package network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

class MyEchoClient03 {
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

			String sendMsg = "";
			String resMsg = "";
			resMsg = in.readLine();
			System.out.println("������ ������ �޽���>>" + resMsg);
			while ((sendMsg = keyin.readLine()) != null) {
				out.println(sendMsg);
				out.flush();
				resMsg = in.readLine();
				System.out.println("������ ������ �޽���>>" + resMsg);
			}
		} catch (
		UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
