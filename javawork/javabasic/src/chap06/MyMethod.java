package chap06;
public class MyMethod {
	//1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�
	public void display()
	{
		for(int i=0; i<10; i++)
			System.out.print("*");
		System.out.println();
	}
	// 2. �Ű������� 1���̰� ���ϰ��� ���� �޼ҵ�
	public void display(String str)
	{
		for(int i=0; i<10; i++)
			System.out.print(str);
		System.out.println();
	}
	
	// 3. �Ű������� 2���̰� ���ϰ��� ���� �޼ҵ�
	public void display(String str, int k)
	{
		for(int i=0; i<k;i++)
			System.out.print(str);
		System.out.println();
	}
	
	//4. �Ű������� ���ϰ��� ��� �ִ� �޼ҵ�
	// => ���� 2���� �Ű������� ���޹޾� ���ؼ� ����� �����ϴ� �޼ҵ�
	public int add(int num1, int num2)
	{
		return num1+num2;
	}
	
}