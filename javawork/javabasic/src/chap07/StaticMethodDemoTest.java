package chap07;

import java.util.Random;

public class StaticMethodDemoTest {

	public static void main(String[] args) {
		// API의 static 메소드 접근하기
		// => static 멤버는 인스턴스의 소유가 아니므로 무조건 클래스명으로 접근한다.
		// => static메소드인 것은 객체생성을 안해도 쓸 수 있다.
		System.out.println(Math.PI);
		System.out.println(Math.random());
		System.out.println();
		
		// non-static 메소드(일반메소드, 인스턴스메소드)
		// 객체생성을 한 후에 참조 변수를 통해서 엑세스
		
		
		Random rand = new Random();
		System.out.println(rand.nextInt());

	}

}
