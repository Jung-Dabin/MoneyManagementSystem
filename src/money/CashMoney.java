package money;

import java.util.Scanner;

public class CashMoney extends Money implements MoneyInput {
	
	public CashMoney(MoneyKind kind) {
		super(kind);
	}
	
	// getUserInput() 메소드
	public void getUserInput(Scanner input) {
		System.out.print("Date: ");
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Time: ");
		int time = input.nextInt();
		this.setTime(time);
		
		System.out.print("Place of Use: ");
		String placeofuse = input.next();
		this.setPlaceofUse(placeofuse);
		
		System.out.print("Amount of Money: ");
		int amountofmoney = input.nextInt();
		this.setAmountofMoney(amountofmoney);
	}
	
	// printInfo() 메소드
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Cash:
			skind = "Cash.";
			break;
		case CreditCard:
			skind = "Card.";
			break;
		case SendMoney:
			skind = "Send.";
			break;
		case SamsungPay:
			skind = "Pay.";
			break;
		default:
		}
		System.out.println("kind:" + skind + " Date:" + Date + " Time:" + Time + " Place of Use:" + PlaceofUse + " Amount of Money:" + AmountofMoney);
	}
}
