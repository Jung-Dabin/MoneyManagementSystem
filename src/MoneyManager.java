import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import money.CashMoney;
import money.CreditCardMoney;
import money.Money;
import money.MoneyInput;
import money.MoneyKind;
import money.SamsungPayMoney;

public class MoneyManager {
	ArrayList<MoneyInput> moneys = new ArrayList<MoneyInput>(); //ArrayList 생성하여 메모리 공간 할당
	
	Scanner input;	
	MoneyManager(Scanner input) {
		this.input = input;
	}

	//addSpend() 메소드
	public void addSpend() {
		int kind = 0;
		MoneyInput moneyInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Cash");
				System.out.println("2 for Credit Card");
				System.out.println("3 for Samsung Pay");
				System.out.print("Select num 1, 2, or 3 for Money Kind:");
	
				//사용자의 Cash, CreditCard 선택에 따라 실행
				kind = input.nextInt();
				if (kind == 1) {
					moneyInput = new CashMoney(MoneyKind.Cash);
					
					moneyInput.getUserInput(input);
					moneys.add(moneyInput);
					break;
				}
				else if (kind == 2) {
					moneyInput = new CreditCardMoney(MoneyKind.CreditCard);
					moneyInput.getUserInput(input);
					moneys.add(moneyInput);
					break;
				}
				else if (kind == 3) {
					moneyInput = new SamsungPayMoney(MoneyKind.SamsungPay);
					moneyInput.getUserInput(input);
					moneys.add(moneyInput);
					break;
				}
				else {
					System.out.print("Select num 1, 2, or 3 for Money Kind:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	//deleteSpend() 메소드
	public void deleteSpend() {
		System.out.print("Date: ");
		int Date = input.nextInt();
		int index = findIndex(Date);
		removefromMoneys(index, Date);
	}
	
	public int findIndex(int Date) {
		int index = -1; //인덱스를 못 찾았다는 뜻으로 –1
		for (int i = 0; i<moneys.size(); i++) {
			if (moneys.get(i).getDate() == Date) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromMoneys(int index, int Date) {
		//인덱스가 0보다 크거나 같으면 해당 인덱스 삭제
		if (index >= 0) {
			moneys.remove(index);
			System.out.println("The record " + Date + " is deleted.");
			return 1;
		}
		else {
			System.out.println("No record.");
			return -1;
		}
	}

	//editSpend() 메소드
	public void editSpend() {
		System.out.print("Date: ");
		int Date = input.nextInt();
		for (int i = 0; i<moneys.size(); i++) {
			MoneyInput money = moneys.get(i);
			if (money.getDate() == Date) {
				int num = -1;
				while(num !=5) {
					showEditMenu();

					//사용자의 선택에 따라 해당 정보 변경
					num = input.nextInt();
					switch(num) {
					case 1:
						money.setDate(input);
						break;
					case 2:
						money.setTime(input);
						break;
					case 3:
						money.setPlaceofUse(input);
						break;
					case 4:
						money.setAmountofMoney(input);
						break;
					default:
						continue;
					} //switch
				} //while
				break;
			} //if
		} //for
	}
	
	//checkSpends() 메소드
	public void checkSpends() {
		for (int i = 0; i<moneys.size(); i++) {
			moneys.get(i).printInfo();
		}
	}
	
	public void showEditMenu() {
		System.out.println("** Money Info Edit Menu **");
		System.out.println(" 1. Edit Date");
		System.out.println(" 2. Edit Time");
		System.out.println(" 3. Edit PlaceofUse");
		System.out.println(" 4. Edit AmountofMoney");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 6: ");
	}
}
