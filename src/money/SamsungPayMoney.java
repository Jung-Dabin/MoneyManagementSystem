package money;

import java.util.Scanner;

import exception.PlaceFormatException;

public class SamsungPayMoney extends PaymentMoney { //Money Ŭ������ �θ� Ŭ������ ��� �޴� SamsungPayMoney Ŭ����

	protected String PlaceofApproval;
	protected int AmountofPayment;
	
	public SamsungPayMoney(MoneyKind kind) {
		super(kind);
	}
	
	// getUserInput() �޼ҵ�
	public void getUserInput(Scanner input) {
		setDate(input);
		setTime(input);
		setMoneyPlaceofUsewithYN(input);
		setanotherPlaceofUsewithYN(input);
		setAmountofMoney(input);
	}
	
	public void setanotherPlaceofUsewithYN(Scanner input){ //�ٸ� ���ó�� �ִ��� ����ڿ��� �����ϰ� ���� �Է¹޴� �޼ҵ�
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
	
	// printInfo() �޼ҵ�
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Date:" + Date + " Time:" + Time + " Place of Approval:" + PlaceofApproval + " Amount of Payment:" + AmountofPayment);
	}
}
