package chatting;

import java.io.BufferedReader;

public class ServerReceiverThread implements Runnable {
	BufferedReader in;
	String resMsg;

	public ServerReceiverThread(BufferedReader in) {
		this.in = in;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				resMsg = in.readLine();
				
				System.out.println("클라이언트가 보내온 메시지>>" + resMsg);
				if(resMsg==null ||resMsg.equals("")) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

}