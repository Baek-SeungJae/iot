package Chap09.api.lang;

import java.util.Date;
import java.util.Random;

// Object 클래스는 자바에서 작성하는 모든 클래스의 최상위 클래스
public class ObjectTest01 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass()); // 클래스의 정보를 리턴하는 클래스
		System.out.println(obj1.hashCode()); // 해시코드를 리턴
		System.out.println(obj1.toString()); // 객체의 주소 기본메소드
		System.out.println(obj1);			 // toString()과 동일, 기본메소드는 생략가능
		
		Person p1 = new Person("장동건",50,"서울");
		System.out.println(p1.toString()); // 개발자가 작성하는 모든 클래스에서 오버라이딩 해야한다.
		System.out.println(p1);
		
		Random rand = new Random();
		System.out.println(rand);
		Date d = new Date();
		
		System.out.println(d);
		String str = new String("java");
		System.out.println(str);
		
		
	}

}
