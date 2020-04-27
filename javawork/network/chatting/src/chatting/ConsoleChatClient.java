package chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ConsoleChatClient {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedReader keyin = null;
		PrintWriter out = null;
		
		// ������ ����� �� �ִ� ���� ��ü�� ����
		try {
			Socket socket = new Socket("70.12.224.117", 12345);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			ClientSenderThread t1 = new ClientSenderThread(out);
			ClientReceiverThread t2 = new ClientReceiverThread(in);
			String sendMsg = "";
			String resMsg = "";
			resMsg = in.readLine();
			System.out.println("������ ������ �޽���>>" + resMsg);
		
			new Thread(t1).start();
			new Thread(t2).start();
			

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
