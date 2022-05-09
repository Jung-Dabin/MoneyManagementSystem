package money;

import java.util.Scanner;

public class SamsungPayMoney extends Money implements MoneyInput { //Money 클래스를 부모 클래스로 상속 받는 SamsungPayMoney 클래스

	protected String PlaceofApproval;
	protected int AmountofPayment;
	
	public SamsungPayMoney(MoneyKind kind) {
		super(kind);
	}
	
	// getUserInput() 메소드
	public void getUserInput(Scanner input) {
		System.out.print("Date:");
		int date = input.nextInt();
		this.setDate(date);
			
		System.out.print("Time:");
		int time = input.nextInt();
		this.setTime(time);
			
		// 질문을 하고 사용자의 대답에 따라 입력 정보 또는 공백 저장
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you remember a Place of Approval? (Y/N):");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Place of Approval:");
				String placeofuse = input.next();
				this.setPlaceofUse(placeofuse);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setPlaceofUse("");
				break;
			}
			else {
			}
		}
		
		System.out.print("Amount of Payment:");
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
		System.out.println("kind:" + skind + " Date:" + Date + " Time:" + Time + " Place of Approval:" + PlaceofApproval + " Amount of Payment:" + AmountofPayment);
	}
}
