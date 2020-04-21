package sync.toilet;
//공유객체 - 모든 쓰레드가 공유해서 사용하는 객체
public class Toilet {
	public synchronized void open(String user_name) {
		System.out.println(user_name+"가 문을 열고 들어옴");


			for(int i=0; i<100000000; i++) {
				if(i==10000) {
					System.out.println("ㅋ");
				}
			}
		
		System.out.println(user_name+"가 종료 후에 나감");
	}
}
