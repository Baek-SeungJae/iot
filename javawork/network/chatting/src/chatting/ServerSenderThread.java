package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ServerSenderThread implements Runnable {
	PrintWriter out;
	BufferedReader keyin;

	public ServerSenderThread(PrintWriter out, BufferedReader keyin) {
		this.out = out;
		this.keyin = keyin;
	}

	@Override
	public void run() {
		String sendMsg = "";
		while (true) {
			try {
				sendMsg = keyin.readLine();
				out.println(sendMsg);
				out.flush();

			} catch (Exception e) {

			}
		}
	}

}
