package simple;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingWorker;

/**
 * 
 * class ThreadsGUI.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 25-10-2017
 */
public class ThreadsGUI {

	/**
	 * Main frame.
	 */
	private JFrame frame;
	
	/**
	 * Output display.
	 */
	private JTextArea output;
	
	/**
	 * Panel for two buttons.
	 */
	private JPanel panel;
	
	/**
	 * Panel for three progress bars.
	 */
	private JPanel barPanel;
	
	/**
	 * Start button.
	 */
	private JButton start;
	
	/**
	 * Progress bar for first Thread.
	 */
	private JProgressBar bar1;
	
	/**
	 * Progress bar for second Thread.
	 */
	private JProgressBar bar2;
	
	/**
	 * Progress bar for third Thread.
	 */
	private JProgressBar bar3;
	
	/**
	 * Scroll tool for output display.
	 */
	private JScrollPane textScroll;
	
	/**
	 *  Button which lets the user choose one of several numbers of quantity total thread cycles. 
	 */
	private JComboBox<Integer> cycles;
	
	/**
	 * List of total thread cycles.
	 */
	private List<Integer> list = Arrays.asList(30, 90, 180, 300);
	
	/**
	 * Main constructor. 
	 */
	public ThreadsGUI() {		
		frame = new JFrame("Thread Window");		
		panel = new JPanel(new GridLayout(1, 2));
		barPanel = new JPanel(new GridLayout(3, 1));
		output = new JTextArea(10, 30);
		//input = new JTextField(5);
		start = new JButton("Start");
		bar1 = new JProgressBar();
		bar2 = new JProgressBar();
		bar3 = new JProgressBar();
		textScroll = new JScrollPane(output, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);		
	}	
	
	/**
	 * Initial frame with two panels and two buttons.
	 */
	public void initWindow() {
		frame.setLayout(new BorderLayout());
		output = new JTextArea(10, 50);
		output.setEditable(false);
		output.setMargin(new Insets(5,5,5,5));			
		frame.add(new JScrollPane(output), BorderLayout.SOUTH);;
		bar1.setStringPainted(true);
		bar2.setStringPainted(true);
		bar3.setStringPainted(true);
		initButtons();
		initPanel();
		frame.add(barPanel, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.NORTH);	
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	/**
	 * 
	 */
	public void initPanel() {
		panel.add(start);
		panel.add(cycles);
		barPanel.add(bar1);
		barPanel.add(bar2);
		barPanel.add(bar3);
	}
	
	public void initButtons() {
		start.addActionListener(new StartHandler());
		cycles = new JComboBox<>();
		for(int x : list) {
			cycles.addItem(x);
		}	
	}
	
	public JTextArea getOutput() {
		return output;
	}

	class StartHandler implements ActionListener {
		
		String s1 = "1 ONE";
    	String s2 = "22 TWO";
    	String s3 = "333 THREE";
    	
    	ProgressBarPainter p1;
    	ProgressBarPainter p2;
    	ProgressBarPainter p3;
    	
    	PrintMe w1;
    	PrintMe w2;
    	PrintMe w3;
    	
		@Override
		public void actionPerformed(ActionEvent e) {				
            	
                p1 = new ProgressBarPainter(bar1);
                p2 = new ProgressBarPainter(bar2);
                p3 = new ProgressBarPainter(bar3);
                Thread progressT1 = new Thread(p1);
                Thread progressT2 = new Thread(p2);
                Thread progressT3 = new Thread(p3);
                progressT1.start();
                progressT2.start();
                progressT3.start();

                w1 = new PrintMe(bar1, s1);
                w2 = new PrintMe(bar2, s2);
                w3 = new PrintMe(bar3, s3);
                Thread workerT1 = new Thread(w1);
                Thread workerT2 = new Thread(w2);
                Thread workerT3 = new Thread(w3);
                workerT1.setName(s1);
                workerT2.setName(s2);
                workerT3.setName(s3);
                
                workerT1.start();
                workerT2.start();
                workerT3.start();
		}		
	}
	class PrintMe implements Runnable {
	    JProgressBar jProgressBarW;
	    String nameOfThread; 
	    int count;
	    
	    PrintMe(JProgressBar bar, String name) {
	    	this.jProgressBarW = bar;
	    	this.nameOfThread = name;
	    	this.count = (int)cycles.getSelectedItem() / 3;
	    	bar.setMinimum(0);
	    	bar.setMaximum(count);
	    }
	    public void run(){    
	        	for(int i = 0; i <= count; i++){
		            try {
		            	output.append(String.format("Curent Thread Name : %s \n", Thread.currentThread().getName()));
		            	output.setCaretPosition(output.getDocument().getLength()-1);
		                Thread.sleep(200);
		                //Update bar
		                if(Thread.currentThread().getName().equals(nameOfThread)) {
		                	jProgressBarW.setValue(i);
		                }	                
		            } catch (Exception ex) {}	            
		        }
	    }
	}
	
	class ProgressBarPainter implements Runnable{
		
	    public JProgressBar jProgressBarPainter;
	    
	    ProgressBarPainter(JProgressBar pBar) {
	    	this.jProgressBarPainter = pBar;
	    }
	    public void run(){
	        while(true){
	            try {
	                Thread.sleep(200);
	                jProgressBarPainter.repaint();
	            } catch (InterruptedException ex) {
	               break;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		ThreadsGUI gui = new ThreadsGUI();
		gui.initWindow();
	}
}
