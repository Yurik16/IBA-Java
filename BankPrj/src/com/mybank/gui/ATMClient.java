package com.mybank.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
	}
	
	void initLeftBottomPanel() {
		JPanel numPad = new JPanel(new BorderLayout());		
		dataEntry = new JTextField(10);
		numPad.add(dataEntry, BorderLayout.CENTER);
		JButton[] leftBottomButtons = {
				new JButton("1"), new JButton("2"), new JButton("3"),
				new JButton("4"), new JButton("5"), new JButton("6"),
				new JButton("7"), new JButton("8"), new JButton("9"),
				new JButton("."), new JButton("0"), new JButton("ENTER")};		
		JPanel leftBottom = new JPanel(new GridLayout(4, 3));
	
		for(int i = 0; i < leftBottomButtons.length; i++) {
		leftBottom.add(leftBottomButtons[i]);
		}
		numPad.add(leftBottom, BorderLayout.SOUTH);
		leftP.add(numPad);
	}
	
}
