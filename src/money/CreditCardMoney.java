package money;

import java.util.Scanner;

public class CreditCardMoney extends PaymentMoney { //Money Ŭ������ �θ� Ŭ������ ��� �޴� CreditCardMoney Ŭ����

	public CreditCardMoney(MoneyKind kind) {
		super(kind);
	}

	// getUserInput() �޼ҵ�
	public void getUserInput(Scanner input) {
		setDate(input);
		setTime(input);
		setMoneyPlaceofUsewithYN(input);
		setAmountofMoney(input);
	}
}