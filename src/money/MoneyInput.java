package money;

import java.util.Scanner;

import exception.PlaceFormatException;

public interface MoneyInput {
	
	public int getDate();
	
	public void setDate(int date);
	
	public int getTime();
	
	public void setTime(int time);
	
	public String getPlaceofUse();
	
	public void setPlaceofUse(String placeofUse) throws PlaceFormatException;
	
	public int getAmountofMoney();
	
	public void setAmountofMoney(int amountofMoney);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setDate(Scanner input);
	
	public void setTime(Scanner input);
	
	public void setPlaceofUse(Scanner input);
	
	public void setAmountofMoney(Scanner input);
}
