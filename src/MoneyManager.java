import java.util.Scanner;

public class MoneyManager {
	Money money;
	Scanner input;
	MoneyManager(Scanner input){
		this.input = input;
	}

	public void addSpend() {
		money = new Money();
		System.out.print("Date: ");
		money.Date = input.next();
		System.out.print("Time: ");
		money.Time = input.next();
		System.out.print("Place of Use: ");
		money.PlaceofUse = input.next();
		System.out.print("Amount of Money: ");
		money.AmountofMoney = input.nextInt();
	}
	
	public void deleteSpend() {
		System.out.print("Date: ");
		String Date = input.next();
		if (money == null) {
			System.out.println("No record.");
			return;
		}
		if (money.Date == money.Date) {
			money = null;
			System.out.println("The record is deleted.");
		}
	}
	
	public void editSpend() {
		System.out.print("Date: ");
		String Date = input.next();
		if (money.Date == money.Date) {
			System.out.println("The money to be edited is " + Date);
		}
	}
	
	public void checkSpend() {
		System.out.print("Date: ");
		String Date = input.next();
		if (money.Date == money.Date) {
			money.printInfo();
		}
	}
}
