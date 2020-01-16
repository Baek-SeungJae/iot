package chap07.poly;
/*
 * 인터페이스 연습
 * << 인터페이스 >>
 * => 추상메소드, 상수만 정의하는 특별한 클래스
 *  
 *  1. 인터페이스는 interface 키워드를 이용해서 정의한다.
 *  2. public abstract가 생략 가능하다.
 *  	- 상속을 받으면 자동으로 추가된다.
 *  3. 인터페이스가 인터페이스를 상속할 수 있다. (extends 이용)
 *  	- 하위 인터페이스가 상위 인터페이스의 추상메소드를 상속받는다.
 *  4. 클래스가 인터페이스를 사용할 수 있다. (implements 이용)
 *  	- 인터페이스를 사용하는 클래스가 이미 다른 클래스를 상속하는 경우에 extends를 먼저 정의하고 implements를 정의해야 한다.
 *  5. 인터페이스는 여러 개를 상속할 수 있다. 즉, 다중상속이 가능하다.
 *  	implements 뒤에 인터페이스를 정의할 때 ,로 구분하여 나열
 *  6. 클래스와 인터페이스들을 상속받는 하위클래스는 모든 클래스와 인터페이스의 하위로 인식된다. (상속받는 모든 클래스, 인터페이스의 하위 타입이 된다.)
 *  7. 인터페이스를 사용하는 목적은 다중상속을 허용, 다형성을 적용할 수 있도록, 기본적으로 구현해야 하는 기능이 무엇인지 정의하기 위한 목적
 *  
 */

interface InterA{
	void test();
	void display(int num0);
}
interface InterB extends InterA{
	int intTest();
}
class SuperA{
}
interface InterC{
}
class SubA extends SuperA implements InterB, InterC{
	public void test() {}
	public void display(int num0) {}
	public int intTest() { return 0;}
}

public class InterfaceTest {

	public static void main(String[] args) {
		SuperA obj1 = new SubA();
		InterA obj2 = new SubA();
		InterB obj3 = new SubA();
		InterC obj4 = new SubA();
	}

}
