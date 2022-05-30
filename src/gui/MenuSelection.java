package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame {
	public MenuSelection() {
		this.setSize(300, 300); // frame ũ�� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���α׷� ����
		
		JPanel panel1 = new JPanel(); // panel1 ����
		JPanel panel2 = new JPanel(); // panel2 ����
		JLabel label = new JLabel("Menu Selection"); // label "Menu Selection" ����
		
		JButton button1 = new JButton("Add Spend"); // button "Add Spend" ����
		JButton button2 = new JButton("Delete Spend"); // button "Delete Spend" ����
		JButton button3 = new JButton("Edit Spend"); // button "Edit Spend" ����
		JButton button4 = new JButton("Check Spends"); // button "Check Spends" ����
		JButton button5 = new JButton("Exit Program"); // button "Exit Program" ����
		
		panel1.add(label); //panel1�� label1 �߰�
		panel2.add(button1); //panel2�� button1 �߰�
		panel2.add(button2); //panel2�� button2 �߰�
		panel2.add(button3); //panel2�� button3 �߰�
		panel2.add(button4); //panel2�� button4 �߰�
		panel2.add(button5); //panel2�� button5 �߰�
		
		this.add(panel1, BorderLayout.NORTH); // frame�� NORTH�� panel1�� �߰�
		this.add(panel2, BorderLayout.CENTER); // frame�� CENTER�� panel2�� �߰�

		this.setVisible(true);
	}

}
