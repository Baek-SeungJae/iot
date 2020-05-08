package chat.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

//3.서버에서 모든 클라이언트 정보를 가지고 있어야 함.
// 클라이언트의 정보 클라이언트의 처리를 표현한 User클래스를 작성

public class User extends Thread{
	Socket client;
	ChatServerView serverView;
	InputStream is;
	InputStreamReader ir;
	BufferedReader br;
	OutputStream os;
	PrintWriter pw;
	String nickname;
	public User() {
		
	}
	public User(Socket client, ChatServerView serverView) {
		super();
		this.client = client;
		this.serverView = serverView;
		ioWork();
		
		
		
	}
	
	public void ioWork() {
		try {
			is = client.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			os = client.getOutputStream();
			pw = new PrintWriter(os, true);
			
			try {
				nickname = br.readLine();
				serverView.taclientlist.append("***********"+nickname+"님이 입장**********\n");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
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
				serverView.taclientlist.append(nickname+" : " + resMsg+"\n");
			} catch (Exception e) {
			}
		}
	}
	
	
	
}
