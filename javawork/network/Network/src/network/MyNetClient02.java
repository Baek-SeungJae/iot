package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

class MyNetClient02 {
	public static void main(String[] args) {
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		//������ ����� �� �ִ� ���� ��ü�� ����
		try {
			Socket socket = new Socket("70.12.115.59",12345);
			//Socket socket = new Socket("70.12.224.117",12345);
			System.out.println("�������ӿϷ�");
			
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			// 1.
			String data = dis.readUTF();
			System.out.println("������ �����ϴ� �޽���1: "+data);
			String intdata = dis.readInt()+"";
			System.out.println("������ �����ϴ� �޽���2:" +intdata);
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
