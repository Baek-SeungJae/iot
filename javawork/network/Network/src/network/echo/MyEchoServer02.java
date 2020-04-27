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

public class MyEchoServer02 {
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			while (true) {
				Socket client = server.accept();
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(), true);

				// 1. 서버 -> 클라이언트
				out.println("안녕하세요 클라이언트님?");

				String sendMsg = "";
				String resMsg = "";
				while (true) {
					resMsg = in.readLine();
					System.out.println("클라이언트가 보내온 메시지>>" + resMsg);
					out.println(resMsg);
				}
			}
		} catch (IOException e) {
		}

	}
}
