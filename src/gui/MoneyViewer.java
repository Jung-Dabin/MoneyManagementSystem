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
	
	public MoneyViewer(WindowFrame frame, MoneyManager moneyManager) {
		this.frame = frame;
		this.moneyManager = moneyManager;
		
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
