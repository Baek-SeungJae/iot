package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MynetServer03 {
	public static void main(String[] args) {
		Socket client = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			while (true) {
				client = server.accept();
				InetAddress clienctInfo = client.getInetAddress();
				System.out.println("������ Ŭ���̾�Ʈ:" + clienctInfo.getHostAddress());
				//
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				// 1. ���� -> Ŭ���̾�Ʈ
				dos.writeUTF("�ȳ��ϼ��� Ŭ���̾�Ʈ��");
				dos.writeInt((int)(Math.random()*7)+2);
				String data = dis.readUTF();
				System.out.println(data);
				
				
			}
		} catch (IOException e) {
		}

	}
}
