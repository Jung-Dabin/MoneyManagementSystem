package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel {
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel(); // panel1 생성
		JPanel panel2 = new JPanel(); // panel2 생성
		JLabel label = new JLabel("Menu Selection"); // label "Menu Selection" 생성
		
		JButton button1 = new JButton("Add Spend"); // button "Add Spend" 생성
		JButton button2 = new JButton("Delete Spend"); // button "Delete Spend" 생성
		JButton button3 = new JButton("Edit Spend"); // button "Edit Spend" 생성
		JButton button4 = new JButton("Check Spends"); // button "Check Spends" 생성
		JButton button5 = new JButton("Exit Program"); // button "Exit Program" 생성
		
		button1.addActionListener(new ButtonAddListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label); //panel1에 label1 추가
		panel2.add(button1); //panel2에 button1 추가
		panel2.add(button2); //panel2에 button2 추가
		panel2.add(button3); //panel2에 button3 추가
		panel2.add(button4); //panel2에 button4 추가
		panel2.add(button5); //panel2에 button5 추가
		
		this.add(panel1, BorderLayout.NORTH); // frame의 NORTH에 panel1을 추가
		this.add(panel2, BorderLayout.CENTER); // frame의 CENTER에 panel2를 추가
	}

}
