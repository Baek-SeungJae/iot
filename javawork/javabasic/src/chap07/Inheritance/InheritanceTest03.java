package chap07.Inheritance;
/*
 *		<<상속관계에서 생성자가 갖는 특징>>
 *	1. 생성자메소드 첫번째줄에는 부모의 객체까지 메모리에 올릴 수 있도록 부모의 생성자를 호출하는 명령문이 생략되어있다.
 *		=> 부모클래스도 메모리에 할당되어야 사용할 수있으므로...
 *		=> 부모의 생성자를 호출하는 방법은 super(...)
 *		=> super()는 부모의 매개변수 없는 기본생성자
 *		=> 이미 다른 생성자를 호출하는 경우에는 super()를 호출할 수 없다.
 *			this()를 호출하는 경우 super()를 호출할 수 없다.
 *	2. 모든 클래스의 최상위클래스는 java.lang.Object클래스
 *		=> 자바에서 실행되는 모든 객체가 갖는 공통의 특징을 정의한 클래스로 상속받고 있는 클래스가 없는 경우 컴파일러가 자동으로 상속하도록 한다.
 *	3. 부모클래스에 정의되어 있는 멤버변수가 값을 셋팅해야 하는 경우에도 하위클래스에서 전달될 수 있도록 정의한다.
 */
class SuperA{ //extends. java.lang.Object가 생략되어있다. 
	String name;
	int age;
	SuperA(){}
	public SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
class SubA extends SuperA{
	String addr;
	int point;
	
	SubA(){
		super();
	}
	
	SubA(String name, int age,String addr){
		super(name,age);
		this.addr = addr;
	}
	
	SubA(String name, int age, String addr, int point){
		// super(); 생략되어있지않고 없다.
		this(name,age,addr);//현재 객체에 이미정의되어있는 또다른 생성자를 호출
		this.point = point;
	}
}

public class InheritanceTest03 {
	
	public static void main(String[] args) {
		SubA obj = new SubA("장동건",45,"서울시",1000);
		System.out.println(obj.name+", "+obj.addr+", "+obj.age+", "+obj.point);

	}

}
