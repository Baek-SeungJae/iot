package firstexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("config/hr.xml");
		JobDAO etc1 = factory.getBean("jobdao",JobDAO.class);
		System.out.println("��ü���ڵ��: "+etc1.count());

	}

}
