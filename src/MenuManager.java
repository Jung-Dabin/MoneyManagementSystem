import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
	
		while (num != 6) {
			System.out.println("*** Money Management System Menu ***");
			System.out.println(" 1. Add Spend");
			System.out.println(" 2. Delete Spend");
			System.out.println(" 3. Edit Details");
			System.out.println(" 4. Check Details");
			System.out.println(" 5. Show a Menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1-6: ");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("Amount of Money: ");
				int Amount = input.nextInt();
				System.out.print("Place of Use: ");
				String Use = input.next();
				System.out.print("Time: ");
				String Time = input.next();
				break;
			case 2:
			case 3:
			case 4:
				System.out.print("Amount of Money: ");
				int Amount2 = input.nextInt();
			}
		}
	}

}
