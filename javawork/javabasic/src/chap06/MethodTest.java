package chap06;

import workbook.workshop3.Student;

public class MethodTest {

	public static void main(String[] args) {
		Person p = new Person("�嵿��","����",45);
		display(p.getName(),p.getAddress(),p.getAge());
		display(p);
		
		
	}
	
	public static void display(String name, String addr, int age)
	{
		System.out.println(name+", "+addr+", "+age);
	}
	public static void display(Person p)
	{
		System.out.println(p.toString());
	}
	//�޼ҵ带 ������ �� �� ���� ���� ������ �� �ִµ� ���� ������ Ÿ���� �����͸� ������ �����ؾ� �Ѵٸ� �迭�� ����Ÿ������ �����ϰ� ����� �� �ִ�. 
	public static int[] getScore()
	{
		int[] arr = new int[3];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		return arr;
	}
	//Ÿ���� �ٸ� �������� �����͸� �����ϰ� ���� ���
	//�迭�� ������ �� �����Ƿ� �����ϰ� ���� ���� �����ִ� ��ü�� �����ؼ� ������ �� �ִ�.
	public static Student getInfo()
	{
		return new Student("�嵿��",90,100,50,78);
	}
}
