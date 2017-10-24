import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * 
 * class SendHandler.
 * 
 * @author Yury Chuksin
 * @version 1.0.0
 * @since 22-10-2017
 */
public class SentHandler implements ActionListener{
	
	ChatWindow chat = new ChatWindow();	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		chat.getOutput().append(String.format("%s: %s \n", chat.getUsers().getSelectedItem(), chat.getInput().getText()));
		 chat.getInput().setText("");
		 chat.getOutput().setCaretPosition(chat.getOutput().getDocument().getLength()-1);
	}

}
