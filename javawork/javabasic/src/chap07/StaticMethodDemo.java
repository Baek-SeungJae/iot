package chap07;

public class StaticMethodDemo {
	public static void staticTest1() 
	{
		// 1. static �޼ҵ忡�� static �޼ҵ� �����ϱ� - �Ϲ����� ������� ����
		staticTest2();
		System.out.println("staticTest1()");
	}
	public void display()
	{
		// 2. non-static �޼ҵ忡�� non-static �޼ҵ带 ȣ��
		show();
		System.out.println("display()");
	}
	public void show()
	{
		// 3. non-static �޼ҵ忡�� static �޼ҵ带 ȣ��
		staticTest2();
		System.out.println("show()");
	}
	public static void staticTest2()
	{
		// 4. static �޼ҵ忡��  non-static �޼ҵ带 ȣ��
		// non-static �޼ҵ尡 �޸𸮿� ���� ������ ���� Ŭ�������� �޼ҵ��� �ϴ��� ������ ��ü ���� �Ŀ� ȣ���ؾ� �Ѵ�.
		StaticMethodDemo c = new StaticMethodDemo();
		c.show();
		System.out.println("staticTest2()");
	}
	
}
