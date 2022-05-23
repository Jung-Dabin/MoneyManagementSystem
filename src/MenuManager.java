import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MoneyManager moneyManager = new MoneyManager(input);
		
		selectMenu(input, moneyManager);
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
					break;
				case 2:
					moneyManager.deleteSpend();
					break;
				case 3:
					moneyManager.editSpend();
					break;
				case 4:
					moneyManager.checkSpends();
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
}
