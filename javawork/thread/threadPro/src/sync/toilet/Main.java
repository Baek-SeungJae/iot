package sync.toilet;

public class Main {
	public static void main(String[] args) {
		//��� �����尡 �����ؼ� ����� ��ü
		Toilet toilet = new Toilet();
		
		User user1 = new User("����",toilet);
		User user2 = new User("���ε�",toilet);
		User user3 = new User("Ÿ��",toilet);
		User user4 = new User("�Ѹ�",toilet);
		User user5 = new User("����",toilet);
		User user6 = new User("�ڸ�Ű",toilet);
		User user7 = new User("����",toilet);
		
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		user6.start();
		user7.start();
	
	}
}
