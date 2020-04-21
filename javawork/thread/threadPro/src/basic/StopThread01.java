package basic;

/*
 * 쓰레드 종료
 * 1. 임의의 변수를 선언해서 종료하는 방법
 * flag 변수
 * - 변수에 저장된 값에 따라서 처리할 수 있도록 구현(실행 or 종료 - boolean)
 * - 변수값을 체크(오래 걸리는 작업이 있는 경우 중간에 익 값을 체크해서 쓰레드를 종료할 수 있다.
 */
class ThreadTest extends Thread {
	public ThreadTest(String name) {
		super(name);
		}
	private boolean state = true;

	@Override
	public void run() {
		while(state) {
			System.out.println("쓰레드 실행중");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("쓰레드 종료상태...");
	}
	public void stopThread() {
		state= false;
	}
}

public class StopThread01 {

	public static void main(String[] args) {
		System.out.println("main시작");
		ThreadTest t1 = new ThreadTest("t1");
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.stopThread();
		System.out.println("main종료");
	}

}
