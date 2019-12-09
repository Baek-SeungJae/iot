package dl.constructor01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Test01 {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("config/bean.xml");

		Dice dice = factory.getBean("dice",Dice.class);
		Player p = new Player(dice);
		p.play();
		System.out.println("���� ���� �ֻ����� ��:"+p.getTotalValue());
	}

}
