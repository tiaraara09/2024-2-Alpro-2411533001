package Pekan8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Kalkulator {

	private JFrame frame;
	private JTextField textField;
	private JButton btnbagi;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Kalkulator() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 20));
		textField.setBounds(10, 11, 426, 100);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
				
		JButton btnpersen = new JButton("%");
		btnpersen.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnpersen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpersen.setBounds(145, 149, 89, 53);
		frame.getContentPane().add(btnpersen);
		
		
			
		JButton btnb = new JButton("Del");
		btnb.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String backspace=null;
			if (textField.getText().length()>0)
			{
				
			}
			{
				StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backspace = str.toString();
				textField.setText(backspace);
			}
			
			}
		});		
		btnb.setBounds(244, 149, 89, 53);
		frame.getContentPane().add(btnb);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(46, 149, 89, 53);
		frame.getContentPane().add(btnC);
		
	
		
		JButton btntitik = new JButton(".");
		btntitik.setFont(new Font("Verdana", Font.PLAIN, 15));
		btntitik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btntitik.getText();
				textField.setText(number);
			}
		});

		btntitik.setBounds(244, 418, 89, 53);
		frame.getContentPane().add(btntitik);
		
		
		
		btnbagi = new JButton("/");
		btnbagi.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnbagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnbagi.setBounds(343, 149, 89, 53);
		frame.getContentPane().add(btnbagi);
		
		
		
		JButton btnkali = new JButton("*");
		btnkali.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnkali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				
				
			}
		});	
		btnkali.setBounds(343, 213, 89, 53);
		frame.getContentPane().add(btnkali);
		
		
		
		JButton btnkurang = new JButton("-");
		btnkurang.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnkurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnkurang.setBounds(343, 280, 89, 53);
		frame.getContentPane().add(btnkurang);
		
		JButton btntambah = new JButton("+");
		btntambah.setFont(new Font("Verdana", Font.PLAIN, 15));
		btntambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		btntambah.setBounds(343, 344, 89, 53);
		frame.getContentPane().add(btntambah);
		
		
		JButton btnjumlah = new JButton("=");
		btnjumlah.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnjumlah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if (operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f" ,result);
					textField.setText(answer);
				}
				else if ( operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if ( operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if ( operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if ( operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);				
				}
					
					
			}
		});
		btnjumlah.setBounds(343, 418, 89, 53);
		frame.getContentPane().add(btnjumlah);
		
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(46, 344, 89, 53);
		frame.getContentPane().add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(244, 344, 89, 53);
		frame.getContentPane().add(btn3);
		
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(145, 344, 89, 53);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});

		btn0.setBounds(145, 418, 89, 53);
		frame.getContentPane().add(btn0);
				

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});

		btn7.setBounds(46, 213, 89, 53);
		frame.getContentPane().add(btn7);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});

		btn8.setBounds(145, 213, 89, 53);
		frame.getContentPane().add(btn8);
		
		
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});

		btn9.setBounds(244, 213, 89, 53);
		frame.getContentPane().add(btn9);
		
		
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});

		btn4.setBounds(46, 280, 89, 53);
		frame.getContentPane().add(btn4);
		
		
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});

		btn5.setBounds(145, 278, 89, 53);
		frame.getContentPane().add(btn5);
		
		
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});

		btn6.setBounds(244, 280, 89, 53);
		frame.getContentPane().add(btn6);
		
		
		JButton btn00 = new JButton("00");
		btn00.setFont(new Font("Verdana", Font.PLAIN, 15));
		btn00.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setBounds(46, 417, 89, 54);
		frame.getContentPane().add(btn00);
	}
}