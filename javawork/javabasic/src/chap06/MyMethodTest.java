package chap06;
// MyMethod 클래스에서 정의한 메소드를 사용하는 클래스
public class MyMethodTest {
	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		
		// 매개변수, 리턴값이 없는 메소드의 호출
		m.display();
		
		// 매개변수가 한개, 리턴값이 없는 메소드의 호출
		m.display("♣");
		
		// 매개변수가 2개, 리턴값이 없는 메소드의 호출
		m.display("@", 30);
		
		// 매개변수와 리턴값이 있는 메소드의 호출
		// 메소드를  호출하는 경우 리턴값이 존재하는 메소드라면 리턴 값과 동일한 타입의 변수를 선언해서 저장해 주어야 한다.
		
		System.out.println(m.add(1, 2));
		
		int result = m.add(1, 2);
		System.out.println(result);
		
		 
	}
}