package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MynetServer02 {
	public static void main(String[] args) {
		Socket client = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			// Ŭ���̾�Ʈ�� ����� �� �ֵ��� �غ�
			ServerSocket server = new ServerSocket(12345);
			while (true) {
				// Ŭ���̾�Ʈ�� ������ ������ ���
				// Ŭ���̾�Ʈ�� �����ϸ� ������ Ŭ���̾�Ʈ�� ���� ��ü�� ����
				client = server.accept();
				InetAddress clienctInfo = client.getInetAddress();
				System.out.println("������ Ŭ���̾�Ʈ:" + clienctInfo.getHostAddress());
				//
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				// 1. ���� -> Ŭ���̾�Ʈ
				dos.writeUTF(clienctInfo.getHostAddress()+"�� ������ ȯ���մϴ�.");
				dos.writeInt(20000);
				
				
				
				
			}
		} catch (IOException e) {
		}

	}
}
