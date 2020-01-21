package app2;

public class MyBeanTest {

	public static void main(String[] args) {
		MyBeanStyle objA = new MyBeanStyleA("����");
		MyBeanStyle objB = new MyBeanStyleB("����");
		run(objA);
		show(objB);
	}

	public static void run(MyBeanStyle obj) {
		System.out.println("***********************");
		obj.hello();
		obj.hello();
		System.out.println("***********************");
	}

	public static void show(MyBeanStyle obj) {
		System.out.println("=======================");
		obj.hello();
		obj.hello();
		System.out.println("=======================");
	}
}
