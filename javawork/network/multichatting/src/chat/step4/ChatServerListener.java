package chat.step4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ChatServerListener implements ActionListener{
	ChatServerView view;

	public ChatServerListener(ChatServerView view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==view.btnstartServer){//?��버시?�� 버튼?�� ?��르면 
			String port = JOptionPane.showInputDialog(view, 
					"port�? ?��?��?��?��?��",JOptionPane.INFORMATION_MESSAGE);
			//==========4. ?��버시?�� 버튼?�� ?��르면 ?��버�?? start?��?�� 메소?�� ?���?==========
			view.serverStart(Integer.parseInt(port));
		}else if(e.getSource()==view.btnstop){
			System.out.println("?��버중�?");
		}
	}
	
	
}
