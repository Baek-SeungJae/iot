package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConsoleChatServer {
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedReader keyin = null;
		
		try {
			ServerSocket server = new ServerSocket(12345);

			while (true) {
				Socket client = server.accept();
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(), true);
				keyin = new BufferedReader(new InputStreamReader(System.in));
				ServerSenderThread t1 = new ServerSenderThread(out,keyin);
				ServerReceiverThread t2 = new ServerReceiverThread(in);
				// 1. 서버 -> 클라이언트
				out.println("안녕하세요 클라이언트님?");
				new Thread(t2).start();
				new Thread(t1).start();
				//break;
			}
		} catch (IOException e) {
		}

	}
}
