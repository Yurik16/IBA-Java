import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * class ChatClient.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 20-10-2017
 */
public class ChatClient {

	public static void main(String[] args) {
		ChatClient c = new ChatClient();
		c.initWindow();
	}
	
	private JFrame frame;
	private JTextArea jArea;
	private JTextField field;
	private JButton b1;
	private JButton b2;
	
	public ChatClient() {
		this.jArea = new JTextArea(10, 50);
		this.field = new JTextField(50);
		this.b1 = new JButton("Sent");
		this.b2 = new JButton("Close");
	}
	
	public void initWindow() {
		frame = new JFrame("Chat window");
		frame.setLayout(new BorderLayout());
		frame.add(jArea, BorderLayout.WEST);
		frame.add(field, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel(new GridLayout(2, 1));
		panel.add(b1);
		panel.add(b2);
		
		frame.add(panel, BorderLayout.EAST);
		frame.pack();
		frame.setVisible(true);
	}
}
