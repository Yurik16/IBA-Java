package com.mybank.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.mybank.data.DataSource;

public class ATMClient {

  private static final String USAGE
    = "USAGE: java com.mybank.gui.ATMClient <dataFilePath>";

  public static void main(String[] args) {

    // Retrieve the dataFilePath command-line argument
    if ( args.length != 1 ) {
      System.out.println(USAGE);
    } else {
      String dataFilePath = args[0];

      try {
	System.out.println("Reading data file: " + dataFilePath);
	// Create the data source and load the Bank data
	DataSource dataSource = new DataSource(dataFilePath);
	dataSource.loadData();

	// Run the ATM GUI
	ATMClient client = new ATMClient();
	client.launchFrame();

      } catch (IOException ioe) {
	System.out.println("Could not load the data file.");
	System.out.println(ioe.getMessage());
	ioe.printStackTrace(System.err);
      }
    }
  }

  	private JFrame frame;
  	private JTextArea output;
	private JTextField input;
	private JTextField dataEntry;
	private JPanel leftP;
	private JPanel rightP;
	private JButton balance;
	private JButton deposit;
	private JButton withdraw;
	
	public ATMClient() {
		frame = new JFrame("AMT Window");
		frame.setLayout(new BorderLayout());
		initLeftHalf();
		initRightHalf();
	}
	
	public void launchFrame() {				
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	void initLeftHalf() {
		leftP = new JPanel(new GridLayout(2, 1));
		initLeftTopPanel();
		initLeftBottomPanel();
		frame.add(leftP, BorderLayout.WEST);
	}
	
	void initRightHalf() {
		rightP = new JPanel(new BorderLayout());
		output = new JTextArea(10, 75);
		rightP.add(output, BorderLayout.CENTER);
		input = new JTextField(10);
		rightP.add(input, BorderLayout.SOUTH);
		frame.add(rightP, BorderLayout.EAST);
	}
	
	void initLeftTopPanel() {
		
		JButton balance = new JButton("BALANCE");		
		JButton deposit = new JButton("DEPOSIT");
		JButton withdraw = new JButton("WITHDRAW");
		JPanel leftTop = new JPanel(new GridLayout(3, 1));
		leftTop.add(balance);
		leftTop.add(deposit);
		leftTop.add(withdraw);
		leftP.add(leftTop);
		balance.addActionListener(new AtmActions());
		deposit.addActionListener(new AtmActions());
		withdraw.addActionListener(new AtmActions());
	}
	
	void initLeftBottomPanel() {
		JPanel numPad = new JPanel(new BorderLayout());		
		numPad.add(dataEntry, BorderLayout.CENTER);
		dataEntry = new JTextField(10);
		int numOfBut;
		String s;
		
		JButton[] leftBottomButtons = {
				new JButton("1"), new JButton("2"), new JButton("3"),
				new JButton("4"), new JButton("5"), new JButton("6"),
				new JButton("7"), new JButton("8"), new JButton("9"),
				new JButton("."), new JButton("0"), new JButton("ENTER")};
					
		JPanel leftBottom = new JPanel(new GridLayout(4, 3));
	
		for(int i = 0; i < leftBottomButtons.length; i++) {
			JButton button = leftBottomButtons[i];
			button.addActionListener(new NumPadActions(button));			
			leftBottom.add(leftBottomButtons[i]);
			}
			numPad.add(leftBottom, BorderLayout.SOUTH);
			leftP.add(numPad);
		}
	
	class AtmActions implements ActionListener{
		String askForID = "Enter Customer ID";
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(balance)) {
				
			}
			if(e.getSource().equals(deposit)) {
				
			}
			if(e.getSource().equals(withdraw)) {
				
			}
			
		}

	}
	
	class NumPadActions implements ActionListener{
		
		int value;
		
		public NumPadActions(JButton b) {
			try {
				this.value = Integer.valueOf(b.getName());
			}
			catch(NumberFormatException e) {
				
			}this.value = Integer.valueOf(b.getName());
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	
}
}
