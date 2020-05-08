package chat.step7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ClientChatListener implements ActionListener{
	ClientChatView view;

	public ClientChatListener(ClientChatView view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 4. 클라이언트가 메시지를 입력하고 엔터키나 전송버튼을 누르면 서버에 전송
		//버튼을 누를 때, 텍스트상자에서 엔터키를 누를 대 호출
		if(e.getSource()==view.txtinput || e.getSource()==view.btnsend) {
			view.sendMsg(view.txtinput.getText());
			view.txtinput.setText("");
		}
	}
	
	
}
