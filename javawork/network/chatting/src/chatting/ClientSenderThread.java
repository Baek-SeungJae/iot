package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ClientSenderThread implements Runnable {
	PrintWriter out;
	BufferedReader keyin = null;

	public ClientSenderThread(PrintWriter out) {
		this.out = out;
		keyin = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public void run() {
		while (true) {
			String sendMsg = "";
			try {
				sendMsg=keyin.readLine();
				out.println(sendMsg);
				out.flush();
			} catch (Exception e) {

			}
		}
	}
}
