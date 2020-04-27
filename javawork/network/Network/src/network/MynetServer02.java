package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MynetServer02 {
	public static void main(String[] args) {
		Socket client = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			// 클라이언트와 통신할 수 있도록 준비
			ServerSocket server = new ServerSocket(12345);
			while (true) {
				// 클라이언트가 접속할 때까지 대기
				// 클라이언트가 접속하면 접속한 클라이언트의 소켓 객체를 리턴
				client = server.accept();
				InetAddress clienctInfo = client.getInetAddress();
				System.out.println("접속한 클라이언트:" + clienctInfo.getHostAddress());
				//
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				// 1. 서버 -> 클라이언트
				dos.writeUTF(clienctInfo.getHostAddress()+"님 접속을 환영합니다.");
				dos.writeInt(20000);
				
				
				
				
			}
		} catch (IOException e) {
		}

	}
}
