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
				
				System.out.println("Ŭ���̾�Ʈ�� ������ �޽���>>" + resMsg);
				if(resMsg==null ||resMsg.equals("")) {
					break;
				}
			} catch (Exception e) {

			}
		}
	}

}