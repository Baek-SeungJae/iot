package test.exam;
//�ڹ� �⺻�� �������� ���ͷ��� ���ؼ� ���캸�� ����
public class PrimitiveTypeTest
{
	public static void main(String[] args) 
	{
		// boolean��
		boolean bool = true; // true of false
		System.out.println(bool);
		
		//������
		char c = 'a'; // charŸ�� ������ ���ͷ��� ǥ���� �� ''�� ǥ��
		System.out.println(c);

		//������
		//������������ �⺻���� �Ҵ�Ǵ� ���ͷ��� Ÿ���� int
		byte b = 127;
		System.out.println(b);
		short s = 32767;
		System.out.println(s);
		int i = 2147483647;
		System.out.println(i);
		long l = 2147483648L; // longŸ���� ��쿡�� ���̻� L�̳� l�� �ٿ����Ѵ�.
		System.out.println(l);

		//�Ǽ���
		//�Ǽ��������� �⺻���� �Ҵ�Ǵ� ���ͷ��� Ÿ���� double
		float f = 0.123456789012f; // floatŸ���� ��쿡�� ���̻� F�� f�� �ٿ����Ѵ�.
		System.out.println(f);
		double d = 10/3.0;
		System.out.println(d);
		
	}
}