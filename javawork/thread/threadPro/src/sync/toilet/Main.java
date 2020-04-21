package sync.toilet;

public class Main {
	public static void main(String[] args) {
		//모든 쓰레드가 공유해서 사용할 객체
		Toilet toilet = new Toilet();
		
		User user1 = new User("무지",toilet);
		User user2 = new User("프로도",toilet);
		User user3 = new User("타요",toilet);
		User user4 = new User("둘리",toilet);
		User user5 = new User("도비",toilet);
		User user6 = new User("코르키",toilet);
		User user7 = new User("피즈",toilet);
		
		
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		user6.start();
		user7.start();
	
	}
}
