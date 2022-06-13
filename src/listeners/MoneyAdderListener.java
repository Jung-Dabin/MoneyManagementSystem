package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.PlaceFormatException;
import manager.MoneyManager;
import money.CashMoney;
import money.MoneyInput;
import money.MoneyKind;

public class MoneyAdderListener implements ActionListener {
	JTextField fieldDate;
	JTextField fieldTime;
	JTextField fieldPlaceofUse;
	JTextField fieldAmountofMoney;
	
	MoneyManager moneyManager;
	
	public MoneyAdderListener(
			JTextField fieldDate, 
			JTextField fieldTime, 
			JTextField fieldPlaceofUse, 
			JTextField fieldAmountofMoney,
			MoneyManager moneyManager) {
		this.fieldDate = fieldDate;
		this.fieldTime = fieldTime;
		this.fieldPlaceofUse = fieldPlaceofUse;
		this.fieldAmountofMoney = fieldAmountofMoney;
		this.moneyManager = moneyManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MoneyInput money = new CashMoney(MoneyKind.Cash);
		try {
			money.setDate(Integer.parseInt(fieldDate.getText()));
			money.setTime(Integer.parseInt(fieldTime.getText()));
			money.setPlaceofUse(fieldPlaceofUse.getText());
			money.setAmountofMoney(Integer.parseInt(fieldAmountofMoney.getText()));
			moneyManager.addSpend(money);
			putObject(moneyManager, "moneymanager.ser");
			money.printInfo();
		} catch (PlaceFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(MoneyManager moneyManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(moneyManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
