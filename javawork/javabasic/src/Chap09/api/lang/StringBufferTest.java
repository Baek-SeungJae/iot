package Chap09.api.lang;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		
		System.out.println("���� => "+sb);
		
		sb.append("��մ�."); // �� ���� �߰�
		System.out.println("���� => "+sb);
		
		sb.insert(2, "�ڹ�");
		System.out.println("���� => "+sb);
		
		sb.delete(2,4);
		System.out.println("���� => "+sb);
		
		sb.reverse();
		System.out.println("���� => "+sb);
	}
}
