package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MoneyAdder extends JPanel {
	
	WindowFrame frame;
	
	public MoneyAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		// Date ĭ ����
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		// Time ĭ ����
		JLabel labelTime = new JLabel("Time: ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelTime.setLabelFor(fieldTime);
		panel.add(labelTime);
		panel.add(fieldTime);
		
		// PlaceofUse ĭ ����
		JLabel labelPlaceofUse = new JLabel("PlaceofUse: ", JLabel.TRAILING);
		JTextField fieldPlaceofUse = new JTextField(10);
		labelPlaceofUse.setLabelFor(fieldPlaceofUse);
		panel.add(labelPlaceofUse);
		panel.add(fieldPlaceofUse);
		
		// AmountofMoney ĭ ����
		JLabel labelAmountofMoney = new JLabel("AmountofMoney: ", JLabel.TRAILING);
		JTextField fieldAmountofMoney = new JTextField(10);
		labelAmountofMoney.setLabelFor(fieldAmountofMoney);
		panel.add(labelAmountofMoney);
		panel.add(fieldAmountofMoney);
		
		panel.add(new JButton("save")); // save ��ư
		panel.add(new JButton("cancle")); // cancle ��ư
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
