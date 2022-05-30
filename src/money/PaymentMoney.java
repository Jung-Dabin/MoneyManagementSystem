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
	// printInfo() 메소드
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Date:" + Date + " Time:" + Time + " Place of Use:" + PlaceofUse + " Amount of Money:" + AmountofMoney);
	}
	
	public void setMoneyPlaceofUsewithYN(Scanner input) {
		// 질문을 하고 사용자의 대답에 따라 입력 정보 또는 공백 저장
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
