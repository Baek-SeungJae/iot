package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
	�������� �̿��ؼ� ���α׷� �����ϱ�
	- new �����ڸ� �̿��ؼ� ��ü�����ϴ� �ڵ带 ���� �������� �ʴ´�.(API ����)
	- ������ ���ο��� �����ϴ� FactoryŬ������ �̿��ؼ� ��ü�� ���޹޴´�.
	- 
 */
public class MyBeanTest3 {

	public static void main(String[] args) {
		//�������� FactoryŬ������ ����
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//����Ͻ�����
		MyBeanStyle obj1 = (MyBeanStyle) factory.getBean("myBean");
		MyBeanStyle obj2 = (MyBeanStyle) factory.getBean("myBean");
		if(obj1==obj2)
			System.out.println("����.");
		else {
			System.out.println("�ٸ���.");
		}
		run(obj1);
		show(obj1);
	}

	public static void run(MyBeanStyle obj) {
		System.out.println("***********************");
		obj.hello("����");
		obj.hello("����");
		System.out.println("***********************");
	}

	public static void show(MyBeanStyle obj) {
		System.out.println("=======================");
		obj.hello("����");
		obj.hello("����");
		System.out.println("=======================");
	}
}
