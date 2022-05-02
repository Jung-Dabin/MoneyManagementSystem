import java.util.ArrayList;
import java.util.Scanner;

import money.CreditCardMoney;
import money.Money;
import money.MoneyKind;
import money.SamsungPayMoney;

public class MoneyManager {
	ArrayList<Money> moneys = new ArrayList<Money>(); //ArrayList 생성하여 메모리 공간 할당
	
	Scanner input;	
	MoneyManager(Scanner input) {
		this.input = input;
	}

	//addSpend() 메소드
	public void addSpend() {
		int kind = 0;
		Money money;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Cash");
			System.out.println("2 for Credit Card");
			System.out.println("3 for Samsung Pay");
			System.out.print("Select num 1, 2, or 3 for Money Kind:");

			//사용자의 Cash, CreditCard 선택에 따라 실행
			kind = input.nextInt();
			if (kind == 1) {
				money = new Money(MoneyKind.Cash);
				money.getUserInput(input);
				moneys.add(money);
				break;
			}
			else if (kind == 2) {
				money = new CreditCardMoney(MoneyKind.CreditCard);
				money.getUserInput(input);
				moneys.add(money);
				break;
			}
			else if (kind == 3) {
				money = new SamsungPayMoney(MoneyKind.SamsungPay);
				money.getUserInput(input);
				moneys.add(money);
				break;
			}
			else {
				System.out.print("Select num 1, 2, or 3 for Money Kind:");
			}
		}
	}
	
	//deleteSpend() 메소드
	public void deleteSpend() {
		System.out.print("Date: ");
		int Date = input.nextInt();
		int index = -1; //인덱스를 못 찾았다는 뜻으로 –1
		for (int i = 0; i<moneys.size(); i++) {
			if (moneys.get(i).getDate() == Date) {
				index = i;
				break;
			}
		}
		

		//인덱스가 0보다 크거나 같으면 해당 인덱스 삭제
		if (index >= 0) {
			moneys.remove(index);
			System.out.println("The record " + Date + " is deleted.");
		}
		else {
			System.out.println("No record.");
			return;
		}
	}
	

	//editSpend() 메소드
	public void editSpend() {
		System.out.print("Date: ");
		int Date = input.nextInt();
		for (int i = 0; i<moneys.size(); i++) {
			Money money = moneys.get(i);
			if (money.getDate() == Date) {
				int num = -1;
				while(num !=5) {
					System.out.println("** Money Info Edit Menu **");
					System.out.println(" 1. Edit Date");
					System.out.println(" 2. Edit Time");
					System.out.println(" 3. Edit PlaceofUse");
					System.out.println(" 4. Edit AmountofMoney");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 6: ");

					//사용자의 선택에 따라 해당 정보 변경
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Date: ");
						int date = input.nextInt();
						money.setDate(date);
					}
					else if (num == 2) {
						System.out.print("Time: ");
						int time = input.nextInt();
						money.setTime(time);
					}
					else if (num == 3) {
						System.out.print("PlaceofUse: ");
						String placeofuse = input.next();
						money.setPlaceofUse(placeofuse);
					}
					else if (num == 4) {
						System.out.print("AmountofMoney: ");
						int amountofmoney = input.nextInt();
						money.setAmountofMoney(amountofmoney);
					}
					else {
						continue;
					} //if
				} //while
				break;
			} //if
		} //for
	}
	
	//checkSpends() 메소드
	public void checkSpends() {
//		System.out.print("Date: ");
//		String Date = input.next();
		for (int i = 0; i<moneys.size(); i++) {
			moneys.get(i).printInfo();
		}
	}
}
