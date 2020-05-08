package chat.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

//3.서버에서 모든 클라이언트 정보를 가지고 있어야 함.
// 클라이언트의 정보 클라이언트의 처리를 표현한 User클래스를 작성

public class User extends Thread {
	Socket client;
	ChatServerView serverView;
	InputStream is;
	InputStreamReader ir;
	BufferedReader br;
	OutputStream os;
	PrintWriter pw;
	String nickname;

	// 3.User객체에서 기존 사용자의 정보를 액세스 할 수 있도록 변수정의
	Vector<User> userlist = new Vector<>();

	public User() {

	}

	public User(Socket client, ChatServerView serverView, Vector<User> userlist) {
		super();
		this.client = client;
		this.serverView = serverView;
		this.userlist = userlist;
		ioWork();
	}

	public void ioWork() {
		try {
			is = client.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			os = client.getOutputStream();
			pw = new PrintWriter(os, true);

			nickname = br.readLine();
			serverView.taclientlist.append("***********" + nickname + "님이 입장**********\n");
			//6. 새로운 클라이언트가 입장하면 벡터에 저장되어 있는 모든 클라이언트에게 입장을 알리는 메시지를 보냄
			int size = userlist.size();
			for(int i=0; i<size; i++) {
				User user = userlist.get(i);
				user.sendMsg("new/"+nickname+"\n"); //이미 접속한 사용자들한테 새로 접속한 사용자의 nickname을 보낸다.
				
			}
			//8.접속자리스트에 현재 새로 입장한 클라이언트 정보도 저장
			userlist.add(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 7.클라이언트에게 메시지를 보내는 메소드를 정의
	public void sendMsg(String msg) {
		pw.println(msg);
	}
	
	public BufferedReader getBr() {
		return br;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}

	public PrintWriter getPw() {
		return pw;
	}

	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String resMsg = br.readLine();
				serverView.taclientlist.append(nickname + " : " + resMsg + "\n");
			} catch (Exception e) {
			}
		}
	}

}
