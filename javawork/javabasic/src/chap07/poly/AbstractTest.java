package chap07.poly;
/* 모든 내용이 구현이 되어있지 않은 클래스로 완성되지 않았으므로 객체생성 불가
 * 메소드의 body가 구현되지 않은 메소드를 갖고있는 클래스
 * 1) 추상메소드를 선언하는 방법
 *    접근제어자 abstract 리턴타입 메소드명(매개변수);
 *   => 추상메소드가 정의된 클래스는 미완성된 추상클래스가 되므로 일반 클래스와 다르다.
 *   	추상클래스를 정의하는 경우 클래스 선언부에도  abstract를 추가해야 한다. 
 * 2) 추상클래스의 특징
 * 	  - 일반메소드와 추상메소드 모드 정의할 수 없다.
 * 	  - 추상메소드가 한 개라도 정의되어 있는 클래스는 반드시 abstract를 추가해야 한다.
 * 	  - 추상클래스를 상속하려면 에러가 발생한다. 
 * 	 => 서브클래스가 추상클래스를 상속하면서 서브클래스도 추상클래스로 변경된다.
 * 		[서브클래스를 추상클래스로 정의하거나, 추상메소드를 오버라이딩 해야한다.]
 * 
 * 3) 추상클래스와 추상메소드를 정의하는 이유
 * 	  - "다형성을 적용하기 위해서"
 * 	  - 상위클래스로 사용하기 위한 목적(객체생성을 문법적으로 제한하기 위해)
 * 	  - 하위클래스에서 반드시 재정의해야 하는 메소드를 문법으로 정의하여 반드시 재정의 하도록 하기위해서
 */

abstract class AbstractSuper{
	public abstract void show();
	public void display() {
		System.out.println("display");
	}
}
class AbstractSub extends AbstractSuper{
	
	
	
	
	public void show() {
		
	}
}




public class AbstractTest {
	
}
