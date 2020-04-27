package network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyEchoServer01 {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			while (true) {
				client = server.accept();
				
				in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				out = new PrintWriter(client.getOutputStream());
				
				out.println("클라이언트님 접속 성공");
				out.flush();
				
				String msg = in.readLine();
				System.out.println(msg);
			}
		} catch (IOException e) {

		}

	}
}
