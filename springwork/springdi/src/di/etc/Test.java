package di.etc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext factory = 
			new GenericXmlApplicationContext("config/etc.xml");
		CollectionTest etc = 
			factory.getBean("collection",CollectionTest.class);
		//etc.getList();
		//etc.getMap();
		
		ConstructorTest etc2 = factory.getBean("con1",ConstructorTest.class);
		System.out.println(etc2);
	}

}
