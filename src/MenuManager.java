import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MoneyManager moneyManager = getObject("moneyam=manager.ser");
		if (moneyManager == null) {
			moneyManager = new MoneyManager(input);
		}		
		
		selectMenu(input, moneyManager);
		putObject(moneyManager, "moneyam=manager.ser");
	}
	
	public static void selectMenu(Scanner input, MoneyManager moneyManager) {
		int num = -1;

		// Menu 실행
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				
				// 사용자에게 입력 받은 번호에 따라 해당하는 메소드 실행
				switch(num) {
				case 1:
					moneyManager.addSpend();
					logger.log("add a spend");
					break;
				case 2:
					moneyManager.deleteSpend();
					logger.log("delete a spend");
					break;
				case 3:
					moneyManager.editSpend();
					logger.log("edit a spend");
					break;
				case 4:
					moneyManager.checkSpends();
					logger.log("check a list of spend");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Money Management System Menu ***");
		System.out.println(" 1. Add Spend");
		System.out.println(" 2. Delete Spend");
		System.out.println(" 3. Edit Spend");
		System.out.println(" 4. Check Spends");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1-6: ");
	}
	
	public static MoneyManager getObject(String filename) {
		MoneyManager moneyManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			moneyManager = (MoneyManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return moneyManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return moneyManager;
	}
	
	public static void putObject(MoneyManager moneyManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(moneyManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
