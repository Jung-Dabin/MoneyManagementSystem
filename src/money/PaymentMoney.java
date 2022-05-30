package money;

import java.util.Scanner;

import exception.PlaceFormatException;

public abstract class PaymentMoney extends Money {

	public PaymentMoney(MoneyKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	// printInfo() �޼ҵ�
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Date:" + Date + " Time:" + Time + " Place of Use:" + PlaceofUse + " Amount of Money:" + AmountofMoney);
	}
	
	public void setMoneyPlaceofUsewithYN(Scanner input) {
		// ������ �ϰ� ������� ��信 ���� �Է� ���� �Ǵ� ���� ����
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N'){
			System.out.print("Do you remember a Place of Use? (Y/N): ");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.print("Place of Use: ");
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
			catch(PlaceFormatException e) {
				System.out.println("Incorrect Place Format. put the place of use that contains -");
			}
		}
	}

}
