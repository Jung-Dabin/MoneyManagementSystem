
public class Money {
	String Date;
	String Time;
	String PlaceofUse;
	int AmountofMoney;
	
	public Money() {
	}
	
	public Money(String Date, String Time) {
		this.Date = Date;
		this.Time = Time;
	}
	
	public Money(String Date, String Time, String PlaceofUse, int AmountofMoney) {
		this.Date = Date;
		this.Time = Time;
		this.PlaceofUse = PlaceofUse;
		this.AmountofMoney = AmountofMoney;
	}
	
	public void printInfo() {
		System.out.println("Date: " + Date + " Time: " + Time + " Place of Use: " + PlaceofUse + " Amount of Money: " + AmountofMoney);
	}
}
