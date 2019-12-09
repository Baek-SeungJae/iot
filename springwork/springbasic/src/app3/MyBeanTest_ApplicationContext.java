package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
	�������� �̿��ؼ� ���α׷� �����ϱ�
	- new �����ڸ� �̿��ؼ� ��ü�����ϴ� �ڵ带 ���� �������� �ʴ´�.(API ����)
	- ������ ���ο��� �����ϴ� FactoryŬ������ �̿��ؼ� ��ü�� ���޹޴´�.
	- 
 */
public class MyBeanTest_ApplicationContext {
	public static void main(String[] args) {
		//�������� FactoryŬ������ ����
		System.out.println("ApplicationContext������");
		ApplicationContext factory = new GenericXmlApplicationContext("/config/bean.xml");
		//����Ͻ�����
		System.out.println("getBeanȣ�� ��");
		MyBeanStyle obj = (MyBeanStyle) factory.getBean("myBean");
		run(obj);
		show(obj);
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