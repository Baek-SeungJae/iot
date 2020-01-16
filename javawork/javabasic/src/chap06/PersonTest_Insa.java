package chap06;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("*********인사관리 시스템**********");
		System.out.println("1. 인사등록");
		System.out.println("2. 정보수정");
		System.out.println("3. 개인정보보회");
		System.out.println("4. 사원목록조회");
		System.out.println("원하는 작업을 선택하세요.");
		int work =scan.nextInt();
		switch(work)
		{
		case 1:
			System.out.println("=====인사등록=====");
			System.out.print("성명 : ");
			String name = scan.next();
			System.out.print("주소 : ");
			String addr = scan.next();
			System.out.print("나이 : ");
			int age = scan.nextInt();
			Person p = new Person(name,addr,age);
			p.print();
			break;
		case 2:
			System.out.println("=====정보수정하기=====");
			System.out.println("");
		}

	}

}
