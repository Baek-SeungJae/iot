package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class MyNetClient04 {

	public static void main(String[] args) {
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;

		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("�������ӿϷ�");
			while (true) {
				client = server.accept();
				
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream());
				
				String msg = in.readLine();
				System.out.println(msg);
				
				out.println("������ �ȳ� ���� Ŭ���̾�Ʈ��");
				out.flush();
				
			}
		} catch (IOException e) {

		}

	}
}
