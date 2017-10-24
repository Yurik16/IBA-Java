import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 * 
 * class ChatWindow.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 22-10-2017
 */
public class ChatWindow {	
	
	List<User> listOfUsers = Arrays.asList(new User("YU"), new User("Name"), new User("Bill"));
	private JFrame frame;
	private JButton sent;
	private JButton quit;
	private JComboBox<String> users;
	
	/**
	 * @return the users
	 */
	public JComboBox<String> getUsers() {
		return users;
	}

	private JTextArea output;
	/**
	 * @return the output
	 */
	public JTextArea getOutput() {
		return output;
	}

	private JTextField input;
	/**
	 * @return the input
	 */
	public JTextField getInput() {
		return input;
	}

	private JPanel panel;
	private JMenuBar menuBar;
	private JScrollPane textPane;

	
	public ChatWindow() {		
		output = new JTextArea(10, 50);
		textPane = new JScrollPane(output, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		input = new JTextField(10);
		sent = new JButton("Sent");		
		quit = new JButton("Close");		
		users = new JComboBox<String>();
		for(User x : listOfUsers) {
			users.addItem(x.getName());
		}		
	}
	
	void initWindow() {
		frame = new JFrame("Chat Window");
		frame.setLayout(new BorderLayout());
		frame.add(textPane, BorderLayout.WEST);
		initPanel();
		frame.add(panel, BorderLayout.EAST);		
		frame.add(input, BorderLayout.SOUTH);
		initMenu();
		frame.add(menuBar, BorderLayout.NORTH);		
		input.addActionListener(new SentHandler());
		frame.addWindowListener(new CloseHandler());
		frame.pack();
        frame.setVisible(true);
	}
	
	void initPanel() {
		panel = new JPanel(new GridLayout(3, 1));		
		panel.add(sent);
		panel.add(quit);
		panel.add(users);
		
		sent.addActionListener(new SendHandler());
		input.addActionListener(new SendHandler());
		quit.addActionListener(new CloseHandler());			
	}
	
	
	private class SendHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String text = input.getText();
            output.append(users.getSelectedItem() + ": " + text + "\n");
            input.setText("");
            output.setCaretPosition(output.getDocument().getLength()-1);
        }
    }    
	
	void initMenu() {
		menuBar = new JMenuBar();
		JMenu f = new JMenu("File");
		JMenu h = new JMenu("Help");
		JMenuItem n1 = new JMenuItem("Nothing");
		JMenuItem n2 = new JMenuItem("Doing");
		JMenuItem n3 = new JMenuItem("Here");
		menuBar.add(f);
		menuBar.add(h);
		h.add(n1);
		h.add(n2);
		h.add(n3);
	}
}
