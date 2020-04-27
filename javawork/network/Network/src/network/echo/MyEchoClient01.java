package network.echo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class MyEchoClient01 {

	public static void main(String[] args) {
		BufferedReader keyin = null;
		PrintWriter out = null;
		InputStream is = null;
		DataInputStream dis = null;
		try {
			Socket client = new Socket("70.12.224.117", 12345);
			System.out.println("서버접속완료");
			while (true) {
				out = new PrintWriter(client.getOutputStream(), true);
				keyin = new BufferedReader(new InputStreamReader(System.in));
				is = client.getInputStream();
				dis = new DataInputStream(is);

				String hi = dis.readUTF();
				System.out.println(hi);
				String sendMsg = "";
				String resMsg = "";

				while ((sendMsg = keyin.readLine()) != null) {
					out.println(sendMsg);
					out.flush();

					resMsg = dis.readUTF();
					System.out.print("서버가 보내는 메시지>>" + resMsg);
				}
			}
		} catch (IOException e) {

		}
	}
}
