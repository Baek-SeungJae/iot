package basic;
/*
 * 멀티쓰레드 프로그래밍
 * 1. Runnable 인터페이스를 구현하는 클래스를 생성
 * 2. Runnable 인터페이스가 갖고 있는 추상메소드인 run메소드를 오버라이딩
 * 3. 작성한 Runnable객체를 이용해서 Thread생성
 * 4. 
 */
class Runnable1 implements Runnable {

	@Override
	public void run() {
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char) i + " ");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 5 == 0)
				System.out.println();
		}
	}
}

public class RunnableTest01 {
	public static void main(String[] args) {
		Runnable1 runnable1 = new Runnable1();
		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable1);
		t1.start();
		t2.start();
	}
}
