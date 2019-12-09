package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
	스프링을 이용해서 프로그램 실행하기
	- new 연산자를 이용해서 객체생성하는 코드를 직접 정의하지 않는다.(API 제외)
	- 스프링 내부에서 제공하는 Factory클래스를 이용해서 객체를 전달받는다.
	- 
 */
public class MyBeanTest4 {

	public static void main(String[] args) {
		//스프링의 Factory클래스를 생성
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//비즈니스로직
		MyBeanStyle obj1 = (MyBeanStyle) factory.getBean("myBean2");
		MyBeanStyle obj2 = (MyBeanStyle) factory.getBean("myBean2");
		MyBeanStyle obj3 = (MyBeanStyle) factory.getBean("myBean2");
		if(obj1==obj2)
			System.out.println("같다.");
		else {
			System.out.println("다르다.");
		}
		run(obj1);
		show(obj2);
		//factory.close();
	}

	public static void run(MyBeanStyle obj) {
		System.out.println("***********************");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("***********************");
	}

	public static void show(MyBeanStyle obj) {
		System.out.println("=======================");
		obj.hello("현빈");
		obj.hello("현빈");
		System.out.println("=======================");
	}
}
