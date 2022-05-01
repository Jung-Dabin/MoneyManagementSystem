package money;

import java.util.Scanner;

public class CreditCardMoney extends Money { //Money 클래스를 부모 클래스로 상속 받는 CreditCardMoney 클래스

	// 메소드 오버라이드: Money 클래스의 getUserInput() 메소드
	public void getUserInput(Scanner input) {
		System.out.print("Date: ");
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Time: ");
		int time = input.nextInt();
		this.setTime(time);
		
		// 질문을 하고 사용자의 대답에 따라 입력 정보 또는 공백 저장
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