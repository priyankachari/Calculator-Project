package com.java.calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;


public class calculatorFunctionality {
	
	JFrame frame= new JFrame();
	JPanel JPnel= new JPanel();
	JTextArea textArea=new JTextArea(2,10);
	
	JButton Button1=new JButton();
	JButton Button2=new JButton();
	JButton Button3=new JButton();
	JButton Button4=new JButton();
	JButton Button5=new JButton();
	JButton Button6=new JButton();
	JButton Button7=new JButton();
	JButton Button18=new JButton();
	JButton Button9=new JButton();
	JButton Button0=new JButton();
	
	
	JButton ButtonAdd=new JButton();
	JButton ButtonSub=new JButton();
	JButton ButtonMul=new JButton();
	JButton ButtonDiv=new JButton();
	JButton ButtonClear=new JButton();
	JButton ButtonDot=new JButton();
	JButton ButtonEqual=new JButton();
	
	double number1, number2, result;
	int  addC=0, sunC=0,mulC=0,divC=0;
	
	public calculatorFunctionality() {
		frame.setSize(350,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");
		
		//frame setResizable 
		
		frame.add(JPnel);
		JPnel.setBackground(Color.LIGHT_GRAY);
		Border border= BorderFactory.createLineBorder(Color.RED);
		
		JPnel.add(textArea);
		textArea.setBackground(Color.BLACK);
		Border TBorder= BorderFactory.createLineBorder(Color.BLUE);
		textArea.setBorder(TBorder);
		Font font=new Font("arial", Font.BOLD, 32);
		textArea.setFont(font);
		textArea.setForeground(Color.WHITE);
		
		textArea.setPreferredSize(new Dimension(2,10) );
		textArea.setLineWrap(true);
		
		
		
	}

}
