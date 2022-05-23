package money;

import java.util.Scanner;

public class CashMoney extends Money {
	
	public CashMoney(MoneyKind kind) {
		super(kind);
	}
	
	// getUserInput() �޼ҵ�
	public void getUserInput(Scanner input) {
		setDate(input);
		setTime(input);
		setPlaceofUse(input);
		setAmountofMoney(input);
	}
	
	// printInfo() �޼ҵ�
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Date:" + Date + " Time:" + Time + " Place of Use:" + PlaceofUse + " Amount of Money:" + AmountofMoney);
	}
}
