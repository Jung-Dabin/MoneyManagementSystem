package money;

import java.util.Scanner;

public interface MoneyInput {
	
	public int getDate();
	
	public void setDate(int date);
	
	public void setTime(int time);
	
	public void setPlaceofUse(String placeofUse);
	
	public void setAmountofMoney(int amountofMoney);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
}
