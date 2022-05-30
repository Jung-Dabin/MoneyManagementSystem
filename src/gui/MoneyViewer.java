package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MoneyViewer extends JFrame{
	public MoneyViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date"); // Date Į�� �߰�
		model.addColumn("Time"); // time Į�� �߰�
		model.addColumn("PlaceofUse"); // PlaceofUse Į�� �߰�
		model.addColumn("Contact Info."); // Contact Info. Į�� �߰�
		
		JTable table = new JTable(model); // table�� model ���̱�
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
