package money;

import java.io.Serializable;
import java.util.Scanner;

import exception.PlaceFormatException;

public abstract class Money implements MoneyInput, Serializable { // abstract: Money라는 객체를 생성하지 않는다는 뜻
	/**
	 * 
	 */
	private static final long serialVersionUID = 3546846093255094463L;
	
	protected MoneyKind kind = MoneyKind.Cash;
	protected int Date;
	protected int Time;
	protected String PlaceofUse;
	protected int AmountofMoney;
	
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

	public void setPlaceofUse(String placeofUse) throws PlaceFormatException {
		if (!placeofUse.contains("-") && !placeofUse.equals("")) {
			throw new PlaceFormatException();
		}
		PlaceofUse = placeofUse;
	}

	public int getAmountofMoney() {
		return AmountofMoney;
	}

	public void setAmountofMoney(int amountofMoney) {
		AmountofMoney = amountofMoney;
	}
	
	public abstract void printInfo();
	
	public void setDate(Scanner input) {
		System.out.print("Date: ");
		int date = input.nextInt();
		this.setDate(date);
	}
	
	public void setTime(Scanner input) {
		System.out.print("Time: ");
		int time = input.nextInt();
		this.setTime(time);
	}
	
	public void setPlaceofUse(Scanner input) {
		String placeofuse = "";
		while(!placeofuse.contains("-")) {
			System.out.print("PlaceofUse: ");
			placeofuse = input.next();
			try {
				this.setPlaceofUse(placeofuse);
			}
			catch (PlaceFormatException e) {
				System.out.println("Incorrect Place Format. put the place of use that contains -");
			}
		}
	}
	
	public void setAmountofMoney(Scanner input) {
		System.out.print("AmountofMoney: ");
		int amountofmoney = input.nextInt();
		this.setAmountofMoney(amountofmoney);
	}
	
	public String getKindString() {
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
		return skind;
	}
}
