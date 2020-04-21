package basic;

/*
 * 쓰레드 종료
 * 1. 임의의 변수를 선언해서 종료하는 방법
 * flag 변수
 * - 변수에 저장된 값에 따라서 처리할 수 있도록 구현(실행 or 종료 - boolean)
 * - 변수값을 체크(오래 걸리는 작업이 있는 경우 중간에 익 값을 체크해서 쓰레드를 종료할 수 있다.
 */
class ThreadTest2 extends Thread {
	public ThreadTest2(String name) {
		super(name);
		}
	@Override
	public void run() {
		
			try {
				while(!Thread.interrupted()) {
				System.out.println("쓰레드 실행중");
				Thread.sleep(500);	
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("쓰레드 종료상태...");
			}
	
		
	}
}

public class StopThread02 {
		
	public static void main(String[] args) {
		System.out.println("main시작");
		ThreadTest2 t = new ThreadTest2("t");
		t.start();
		System.out.println("쓰레드의 이름: "+ t.getName());
		System.out.println("인터럽트 상태: "+t.isInterrupted());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();
		System.out.println("인터럽트 상태: "+t.isInterrupted()); 	
		System.out.println("main종료");
	}

}
