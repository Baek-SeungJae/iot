package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

class MyNetClient01 {
	public static void main(String[] args) {
		//서버와 통신할 수 있는 소켓 객체를 생성
		try {
			Socket socket = new Socket("70.12.224.117",12345);
			System.out.println("서버접속완료");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
