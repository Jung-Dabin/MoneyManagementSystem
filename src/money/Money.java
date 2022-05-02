package money;

import java.util.Scanner;

public class Money {
	protected MoneyKind kind = MoneyKind.Cash;
	protected int Date;
	protected int Time;
	protected String PlaceofUse;
	protected int AmountofMoney;
	
	// 생성자
	public Money() {
	}
	
	public Money(MoneyKind kind) {
		this.kind = kind;
	}
	
	public Money(int date, int time) {
		this.Date = date;
		this.Time = time;
	}
	
	public Money(int date, int time, String placeofuse, int amountofmoney) {
		this.Date = date;
		this.Time = time;
		this.PlaceofUse = placeofuse;
		this.AmountofMoney = amountofmoney;
	}
	
	public Money(MoneyKind kind, int date, int time, String placeofuse, int amountofmoney) {
		this.kind = kind;
		this.Date = date;
		this.Time = time;
		this.PlaceofUse = placeofuse;
		this.AmountofMoney = amountofmoney;
	}
	

	// getters와 setters로 캡슐화
	public MoneyKind getKind() {
		return kind;
	}

	public void setKind(MoneyKind kind) {
		this.kind = kind;
	}

	public int getDate() {
		return Date;
	}

	public void setDate(int date) {
		Date = date;
	}

	public int getTime() {
		return Time;
	}

	public void setTime(int time) {
		Time = time;
	}

	public String getPlaceofUse() {
		return PlaceofUse;
	}

	public void setPlaceofUse(String placeofUse) {
		PlaceofUse = placeofUse;
	}

	public int getAmountofMoney() {
		return AmountofMoney;
	}

	public void setAmountofMoney(int amountofMoney) {
		AmountofMoney = amountofMoney;
	}
	
	// printInfo() 메소드
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Cash:
			skind = "Cash.";
			break;
		case CreditCard:
			skind = "Card.";
			break;
		case SendMoney:
			skind = "Send.";
			break;
		case SamsungPay:
			skind = "Pay.";
			break;
		default:
		}
		System.out.println("kind:" + skind + " Date:" + Date + " Time:" + Time + " Place of Use:" + PlaceofUse + " Amount of Money:" + AmountofMoney);
	}
	
	//getUserInput() 메소드, 사용자가 입력하는 값 저장
	public void getUserInput(Scanner input) {
		System.out.print("Date: ");
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Time: ");
		int time = input.nextInt();
		this.setTime(time);
		
		System.out.print("Place of Use: ");
		String placeofuse = input.next();
		this.setPlaceofUse(placeofuse);
		
		System.out.print("Amount of Money: ");
		int amountofmoney = input.nextInt();
		this.setAmountofMoney(amountofmoney);
	}
}
