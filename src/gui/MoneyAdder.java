package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.MoneyAdderCancelListener;
import listeners.MoneyAdderListener;
import manager.MoneyManager;

public class MoneyAdder extends JPanel {
	
	WindowFrame frame;
	MoneyManager moneyManager;
	
	public MoneyAdder(WindowFrame frame, MoneyManager moneyManager) {
		this.frame = frame;
		this.moneyManager = moneyManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		// Date 沫 积己
		JLabel labelDate = new JLabel("Date: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		panel.add(labelDate);
		panel.add(fieldDate);
		
		// Time 沫 积己
		JLabel labelTime = new JLabel("Time: ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelTime.setLabelFor(fieldTime);
		panel.add(labelTime);
		panel.add(fieldTime);
		
		// PlaceofUse 沫 积己
		JLabel labelPlaceofUse = new JLabel("PlaceofUse: ", JLabel.TRAILING);
		JTextField fieldPlaceofUse = new JTextField(10);
		labelPlaceofUse.setLabelFor(fieldPlaceofUse);
		panel.add(labelPlaceofUse);
		panel.add(fieldPlaceofUse);
		
		// AmountofMoney 沫 积己
		JLabel labelAmountofMoney = new JLabel("AmountofMoney: ", JLabel.TRAILING);
		JTextField fieldAmountofMoney = new JTextField(10);
		labelAmountofMoney.setLabelFor(fieldAmountofMoney);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new MoneyAdderListener(fieldDate, fieldTime, fieldPlaceofUse, fieldAmountofMoney, moneyManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new MoneyAdderCancelListener(frame));
		
		panel.add(labelAmountofMoney);
		panel.add(fieldAmountofMoney);
		
		panel.add(saveButton); // save 滚瓢
		panel.add(cancelButton); // cancel 滚瓢
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
