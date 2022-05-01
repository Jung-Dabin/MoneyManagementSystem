package money;

import java.util.Scanner;

public class CreditCardMoney extends Money { //Money Ŭ������ �θ� Ŭ������ ��� �޴� CreditCardMoney Ŭ����

	// �޼ҵ� �������̵�: Money Ŭ������ getUserInput() �޼ҵ�
	public void getUserInput(Scanner input) {
		System.out.print("Date: ");
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Time: ");
		int time = input.nextInt();
		this.setTime(time);
		
		// ������ �ϰ� ������� ��信 ���� �Է� ���� �Ǵ� ���� ����
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you have a Place of Use? (Y/N): ");
			answer = input.next().charAt(0);
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
		
		System.out.print("Amount of Money: ");
		int amountofmoney = input.nextInt();
		this.setAmountofMoney(amountofmoney);
	}
}