package dl.exam01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TVUser {
	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		
		// TV obj1 = (SamsungTV) factory.getBean("samsung");
		TV obj2 = factory.getBean("tv",TV.class);
		/*
		 * obj1.turnOn(); obj1.soundUp(); obj1.soundDown(); obj1.turnOff();
		 */
		obj2.turnOn();
		obj2.soundUp();
		obj2.soundDown();
		obj2.turnOff();
		
		//factory.close();
	}

}
