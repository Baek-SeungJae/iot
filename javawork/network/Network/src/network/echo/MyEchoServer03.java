package network.echo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyEchoServer03 {
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
				// 1. ���� -> Ŭ���̾�Ʈ
				out.println("�ȳ��ϼ��� Ŭ���̾�Ʈ��?");

				String sendMsg = "";
				String resMsg = "";
				while (true) {
					resMsg = in.readLine();
					System.out.println("Ŭ���̾�Ʈ�� ������ �޽���>>" + resMsg);
					if (resMsg == null) {
						break;
					}
					sendMsg = keyin.readLine();
					out.println(sendMsg);
					out.flush();
				}
			}
		} catch (IOException e) {
		}

	}
}
