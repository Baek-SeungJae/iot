package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MynetServer01 {
	public static void main(String[] args) {
		try {
			// Ŭ���̾�Ʈ�� ����� �� �ֵ��� �غ�
			ServerSocket server = new ServerSocket(12345);
			// Ŭ���̾�Ʈ�� ������ ������ ���
			// Ŭ���̾�Ʈ�� �����ϸ� ������ Ŭ���̾�Ʈ�� ���� ��ü�� ����
			Socket client = server.accept();
			InetAddress clienctInfo = client.getInetAddress();
			System.out.println("������ Ŭ���̾�Ʈ:" + clienctInfo.getHostAddress());

		} catch (IOException e) {
		}
	}
}
