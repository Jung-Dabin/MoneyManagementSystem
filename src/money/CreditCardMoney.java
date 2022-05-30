package money;

import java.util.Scanner;

public class CreditCardMoney extends PaymentMoney { //Money 클래스를 부모 클래스로 상속 받는 CreditCardMoney 클래스

	public CreditCardMoney(MoneyKind kind) {
		super(kind);
	}

	// getUserInput() 메소드
	public void getUserInput(Scanner input) {
		setDate(input);
		setTime(input);
		setMoneyPlaceofUsewithYN(input);
		setAmountofMoney(input);
	}
}