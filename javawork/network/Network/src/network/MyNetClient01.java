package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

class MyNetClient01 {
	public static void main(String[] args) {
		//������ ����� �� �ִ� ���� ��ü�� ����
		try {
			Socket socket = new Socket("70.12.224.117",12345);
			System.out.println("�������ӿϷ�");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
