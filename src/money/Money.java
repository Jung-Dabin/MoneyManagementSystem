package money;

import java.util.Scanner;

public abstract class Money { // abstract: Money라는 객체를 생성하지 않는다는 뜻
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

	public void setPlaceofUse(String placeofUse) {
		PlaceofUse = placeofUse;
	}

	public int getAmountofMoney() {
		return AmountofMoney;
	}

	public void setAmountofMoney(int amountofMoney) {
		AmountofMoney = amountofMoney;
	}
	
	public abstract void printInfo();
}
