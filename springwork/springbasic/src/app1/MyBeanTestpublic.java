package app1;

public class MyBeanTestpublic {

	public static void main(String[] args) {
		MyBeanStyleB obj = new MyBeanStyleB();
		run(obj);
		show(obj);
	}

	public static void run(MyBeanStyleB obj) {
		System.out.println("***********************");
		obj.Hello("��");
		obj.Hello("��");
		System.out.println("***********************");
	}

	public static void show(MyBeanStyleB obj) {
		System.out.println("=======================");
		obj.Hello("��");
		obj.Hello("��");
		System.out.println("=======================");
	}
}
