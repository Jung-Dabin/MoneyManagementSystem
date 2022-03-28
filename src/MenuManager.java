import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 5;
		Scanner input = new Scanner(System.in);
	
		while (num != 6) {
			System.out.println("*** Money Management System Menu ***");
			System.out.println(" 1. Add Spend");
			System.out.println(" 2. Delete Spend");
			System.out.println(" 3. Edit Spend");
			System.out.println(" 4. Check Spend");
			System.out.println(" 5. Show a Menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1-6: ");
			num = input.nextInt();
			
			if (num == 1) {
				addSpend();
			}
			else if (num == 2) {
				deleteSpend();
			}
			else if (num == 3) {
				editSpend();
			}
			else if (num == 4) {
				checkSpend();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addSpend() {
		Scanner input = new Scanner(System.in);
		System.out.print("Date: ");
		String Date = input.next();
		System.out.print("Time: ");
		String Time = input.next();
		System.out.print("Place of Use: ");
		String PlaceofUse = input.next();
		System.out.print("Amount of Money: ");
		int AmountofMoney = input.nextInt();
	}
	
	public static void deleteSpend() {
		Scanner input = new Scanner(System.in);
		System.out.print("Date: ");
		String Date = input.next();
	}
	
	public static void editSpend() {
		Scanner input = new Scanner(System.in);
		System.out.print("Date: ");
		String Date = input.next();
	}
	
	public static void checkSpend() {
		Scanner input = new Scanner(System.in);
		System.out.print("Date: ");
		String Date = input.next();
	}

}
