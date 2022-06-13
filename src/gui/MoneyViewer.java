package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.MoneyManager;
import money.MoneyInput;

public class MoneyViewer extends JPanel{
	
	WindowFrame frame;
	MoneyManager moneyManager;
	
	public MoneyManager getMoneyManager() {
		return moneyManager;
	}

	public void setMoneyManager(MoneyManager moneyManager) {
		this.moneyManager = moneyManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date"); // Date Į�� �߰�
		model.addColumn("Time"); // time Į�� �߰�
		model.addColumn("PlaceofUse"); // PlaceofUse Į�� �߰�
		model.addColumn("Contact Info."); // Contact Info. Į�� �߰�
		
		for (int i=0; i<moneyManager.size(); i++) {
			Vector row = new Vector();
			MoneyInput mi = moneyManager.get(i);
			row.add(mi.getDate());
			row.add(mi.getTime());
			row.add(mi.getPlaceofUse());
			row.add(mi.getAmountofMoney());
			model.addRow(row);
		}
		
		JTable table = new JTable(model); // table�� model ���̱�
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public MoneyViewer(WindowFrame frame, MoneyManager moneyManager) {
		this.frame = frame;
		this.moneyManager = moneyManager;
		
		System.out.println("***" + moneyManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date"); // Date Į�� �߰�
		model.addColumn("Time"); // time Į�� �߰�
		model.addColumn("PlaceofUse"); // PlaceofUse Į�� �߰�
		model.addColumn("Contact Info."); // Contact Info. Į�� �߰�
		
		for (int i=0; i<moneyManager.size(); i++) {
			Vector row = new Vector();
			MoneyInput mi = moneyManager.get(i);
			row.add(mi.getDate());
			row.add(mi.getTime());
			row.add(mi.getPlaceofUse());
			row.add(mi.getAmountofMoney());
			model.addRow(row);
		}
		
		JTable table = new JTable(model); // table�� model ���̱�
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
