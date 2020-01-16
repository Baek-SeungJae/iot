package chap07.poly;
//��ü�� ����ȯ : ��Ӱ��迡 �ִ� ��쿡�� �����ϴ�.

class Parent{
	String name = "�嵿��";
	public void display()
	{
		System.out.println("�θ�Ŭ������ display");
	}
}

class Child extends Parent{
	String name = "�̹�ȣ";
	public void display()
	{
		System.out.println("�ڽ�Ŭ������ display");
	}
	public void test()
	{
		System.out.println("����Ŭ�������� ���ǵ� �޼ҵ�");
	}
}

public class RefCastingTest {

	public static void main(String[] args) {
		System.out.println("1. superŸ���� ���������� super��ü�� ����");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		
		System.out.println("*************************************");
		System.out.println("2. subŸ���� ���������� sub��ü�� ����");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
	
		
		
		// ��ü�� ����ȯ
		// - ������ �������� Ÿ�Կ� ���� ����, �޼ҵ�� �����Ǵ� ��ü ����
		// - 
		System.out.println("*************************************");
		System.out.println("3. superŸ���� ���������� sub��ü�� ����");
		Parent obj3 = new Child(); //�ڵ�����ȯ
		obj3.display(); // �޼ҵ� : �������̵��� �޼ҵ��� �������̵��� �޼ҵ带 ȣ��
		System.out.println(obj3.name); // ���� : �������� Ÿ�Կ� �ش��ϴ� Ÿ�Կ� �ش��ϴ� ��������� ����
		
		// Ÿ���� ParentŸ�������� ������ ��ü�� Child Ÿ���̱� ������ ChildŸ������ ����ȯ�� �����ϴ�.
		((Child)obj3).test();
		
		
		
		System.out.println("*************************************");
		System.out.println("4. subŸ���� ���������� super��ü�� ����........X");
		
		
		System.out.println("*************************************");
		System.out.println("5. subŸ���� �������� = superŸ���� ��������(super��ü�� ����)");
		// ��������� ����ȯ�� �ؼ� �����Ϸ��� �ӿ�����, ��������� ĳ��ŷ�� �Ϸ����� ��,
		// obj1�� Child ������ ������� �ʱ� ������ ĳ���� ���� �߻�
		// Child obj5 = (Child)obj1;
		
		System.out.println("*************************************");
		System.out.println("6. subŸ���� �������� = superŸ���� ��������(sub��ü�� ����)");
		Child obj6 = (Child)obj3;
		System.out.println(obj6.name);
		obj6.display();
		obj6.test();
		System.out.println();
	}
}
