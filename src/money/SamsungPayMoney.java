package money;

import java.util.Scanner;

public class SamsungPayMoney extends Money implements MoneyInput { //Money Ŭ������ �θ� Ŭ������ ��� �޴� SamsungPayMoney Ŭ����

	protected String PlaceofApproval;
	protected int AmountofPayment;
	
	public SamsungPayMoney(MoneyKind kind) {
		super(kind);
	}
	
	// getUserInput() �޼ҵ�
	public void getUserInput(Scanner input) {
		System.out.print("Date:");
		int date = input.nextInt();
		this.setDate(date);
			
		System.out.print("Time:");
		int time = input.nextInt();
		this.setTime(time);
			
		// ������ �ϰ� ������� ��信 ���� �Է� ���� �Ǵ� ���� ����
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
	
	// printInfo() �޼ҵ�
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
