package chatting;

import java.io.BufferedReader;

public class ClientReceiverThread implements Runnable {
	BufferedReader in;
	String resMsg = "";

	public ClientReceiverThread(BufferedReader in) {
		this.in = in;
	}

	@Override
	public void run() {
		while(true) {
		try {
			resMsg = in.readLine();
			if(resMsg==null||resMsg.equals("")) {
				break;
			}
			System.out.println("서버가 보내온 메시지>>" + resMsg);
		} catch (Exception e) {
		}
		}
	}
}
