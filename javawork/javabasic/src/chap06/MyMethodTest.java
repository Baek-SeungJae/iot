package chap06;
// MyMethod Ŭ�������� ������ �޼ҵ带 ����ϴ� Ŭ����
public class MyMethodTest {
	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		
		// �Ű�����, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display();
		
		// �Ű������� �Ѱ�, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display("��");
		
		// �Ű������� 2��, ���ϰ��� ���� �޼ҵ��� ȣ��
		m.display("@", 30);
		
		// �Ű������� ���ϰ��� �ִ� �޼ҵ��� ȣ��
		// �޼ҵ带  ȣ���ϴ� ��� ���ϰ��� �����ϴ� �޼ҵ��� ���� ���� ������ Ÿ���� ������ �����ؼ� ������ �־�� �Ѵ�.
		
		System.out.println(m.add(1, 2));
		
		int result = m.add(1, 2);
		System.out.println(result);
		
		 
	}
}