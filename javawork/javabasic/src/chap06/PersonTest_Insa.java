package chap06;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("*********�λ���� �ý���**********");
		System.out.println("1. �λ���");
		System.out.println("2. ��������");
		System.out.println("3. ����������ȸ");
		System.out.println("4. ��������ȸ");
		System.out.println("���ϴ� �۾��� �����ϼ���.");
		int work =scan.nextInt();
		switch(work)
		{
		case 1:
			System.out.println("=====�λ���=====");
			System.out.print("���� : ");
			String name = scan.next();
			System.out.print("�ּ� : ");
			String addr = scan.next();
			System.out.print("���� : ");
			int age = scan.nextInt();
			Person p = new Person(name,addr,age);
			p.print();
			break;
		case 2:
			System.out.println("=====���������ϱ�=====");
			System.out.println("");
		}

	}

}
