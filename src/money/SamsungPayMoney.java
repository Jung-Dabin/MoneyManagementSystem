package money;

import java.util.Scanner;

import exception.PlaceFormatException;

public class SamsungPayMoney extends PaymentMoney { //Money 클래스를 부모 클래스로 상속 받는 SamsungPayMoney 클래스

	protected String PlaceofApproval;
	protected int AmountofPayment;
	
	public SamsungPayMoney(MoneyKind kind) {
		super(kind);
	}
	
	// getUserInput() 메소드
	public void getUserInput(Scanner input) {
		setDate(input);
		setTime(input);
		setMoneyPlaceofUsewithYN(input);
		setanotherPlaceofUsewithYN(input);
		setAmountofMoney(input);
	}
	
	public void setanotherPlaceofUsewithYN(Scanner input){ //다른 사용처가 있는지 사용자에게 질문하고 답을 입력받는 메소드
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have another Place of Approval? (Y/N):");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setPlaceofUse(input);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setPlaceofUse("");
					break;
				}
				else {
				}
			}
			catch(PlaceFormatException e) {
				System.out.println("Incorrect Place Format. put the place of use that contains -");
			}
		}
	}
	
	// printInfo() 메소드
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Date:" + Date + " Time:" + Time + " Place of Approval:" + PlaceofApproval + " Amount of Payment:" + AmountofPayment);
	}
}
