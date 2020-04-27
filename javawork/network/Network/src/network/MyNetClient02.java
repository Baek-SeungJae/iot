package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

class MyNetClient02 {
	public static void main(String[] args) {
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		//서버와 통신할 수 있는 소켓 객체를 생성
		try {
			Socket socket = new Socket("70.12.115.59",12345);
			//Socket socket = new Socket("70.12.224.117",12345);
			System.out.println("서버접속완료");
			
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			// 1.
			String data = dis.readUTF();
			System.out.println("서버가 전송하는 메시지1: "+data);
			String intdata = dis.readInt()+"";
			System.out.println("서버가 전송하는 메시지2:" +intdata);
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
