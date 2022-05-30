package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MoneyViewer extends JFrame{
	public MoneyViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Date"); // Date Ä®·³ Ãß°¡
		model.addColumn("Time"); // time Ä®·³ Ãß°¡
		model.addColumn("PlaceofUse"); // PlaceofUse Ä®·³ Ãß°¡
		model.addColumn("Contact Info."); // Contact Info. Ä®·³ Ãß°¡
		
		JTable table = new JTable(model); // table¿¡ model ºÙÀÌ±â
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
