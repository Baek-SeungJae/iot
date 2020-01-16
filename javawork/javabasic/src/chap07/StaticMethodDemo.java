package chap07;

public class StaticMethodDemo {
	public static void staticTest1() 
	{
		// 1. static 메소드에서 static 메소드 접근하기 - 일반적인 방법으로 가능
		staticTest2();
		System.out.println("staticTest1()");
	}
	public void display()
	{
		// 2. non-static 메소드에서 non-static 메소드를 호출
		show();
		System.out.println("display()");
	}
	public void show()
	{
		// 3. non-static 메소드에서 static 메소드를 호출
		staticTest2();
		System.out.println("show()");
	}
	public static void staticTest2()
	{
		// 4. static 메소드에서  non-static 메소드를 호출
		// non-static 메소드가 메모리에 없기 때문에 같은 클래스에서 메소드라고 하더라도 무조건 객체 생성 후에 호출해야 한다.
		StaticMethodDemo c = new StaticMethodDemo();
		c.show();
		System.out.println("staticTest2()");
	}
	
}
