package app3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
// 1. xml�� spring���� ����� �� �ֵ��� ��ü�� ��ȯ�ϴ� �۾��� �����ϴ� ��ü ����
// 2. �����̳� ��ü�� ����
public class MyBeanTest_BeanFactory {
	public static void main(String[] args) {
		// 1. xml�Ľ�
		System.out.println("Resource ������");
		Resource res = new ClassPathResource("/config/bean.xml");
		
		// 2. �����̳� ��ü�� ����
		System.out.println("BeanFactory ������");
		BeanFactory factory = new XmlBeanFactory(res);

		//����Ͻ�����
		System.out.println("getBean ȣ����");
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
