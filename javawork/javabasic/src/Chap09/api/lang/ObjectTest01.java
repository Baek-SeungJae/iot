package Chap09.api.lang;

import java.util.Date;
import java.util.Random;

// Object Ŭ������ �ڹٿ��� �ۼ��ϴ� ��� Ŭ������ �ֻ��� Ŭ����
public class ObjectTest01 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass()); // Ŭ������ ������ �����ϴ� Ŭ����
		System.out.println(obj1.hashCode()); // �ؽ��ڵ带 ����
		System.out.println(obj1.toString()); // ��ü�� �ּ� �⺻�޼ҵ�
		System.out.println(obj1);			 // toString()�� ����, �⺻�޼ҵ�� ��������
		
		Person p1 = new Person("�嵿��",50,"����");
		System.out.println(p1.toString()); // �����ڰ� �ۼ��ϴ� ��� Ŭ�������� �������̵� �ؾ��Ѵ�.
		System.out.println(p1);
		
		Random rand = new Random();
		System.out.println(rand);
		Date d = new Date();
		
		System.out.println(d);
		String str = new String("java");
		System.out.println(str);
		
		
	}

}
