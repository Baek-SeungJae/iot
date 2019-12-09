package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
// 1. xml을 spring에서 사용할 수 있도록 객체로 변환하는 작업을 수행하는 객체 생성
// 2. 컨테이너 객체를 생성
public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		// 1. xml파싱
		System.out.println("Resource 생성전");
		Resource res = new ClassPathResource("/config/bean.xml");
		
		// 2. 컨테이너 객체를 생성
		System.out.println("BeanFactory 생성전");
		BeanFactory factory = new XmlBeanFactory(res);

		//비즈니스로직
		System.out.println("getBean 호출전");
		MyBeanStyle obj1 = (MyBeanStyle) factory.getBean("myBean");
		MyBeanStyle obj2 = (MyBeanStyle) factory.getBean("myBean");
		
		if(obj1==obj2)
			System.out.println("같다.");
		else {
			System.out.println("다르다.");
		}
		
		run(obj1);
		show(obj1);
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
