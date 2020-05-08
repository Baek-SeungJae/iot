package chat.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

public class User extends Thread {
	Socket client;
	ChatServerView serverView;
	InputStream is;
	InputStreamReader ir;
	BufferedReader br;
	OutputStream os;
	PrintWriter pw;
	String nickname;

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
			broadcast("new/"+nickname);
			int size = userlist.size();
			for(int i=0; i<size; i++) {
				User user = userlist.get(i);
				sendMsg("old/"+user.nickname);
			}
			userlist.add(this);
		} catch (IOException e) {
		}
	}
	public void broadcast(String msg) {
		int size = userlist.size();
		for(int i=0; i<size; i++) {
			User user = userlist.get(i);
			user.sendMsg(msg);
		}
	}
	
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
				int size = userlist.size();
				for(int i=0; i<size; i++) {
					User user = userlist.get(i);
					user.sendMsg("chatting/"+nickname+" : "+resMsg);
				}
			} catch (Exception e) {
				try {
					serverView.taclientlist.append(nickname + "의 접속이 끊어짐"+"\n");
					is.close();
					ir.close();
					br.close();
					os.close();
					pw.close();
					userlist.remove(this);
					broadcast("out/"+nickname);
					break;
				} catch(IOException e1) {
					
				}
			}
		}
	}

}
