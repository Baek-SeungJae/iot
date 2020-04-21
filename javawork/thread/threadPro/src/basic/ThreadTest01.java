package basic;

/*
 *  멀티쓰레드 프로그래밍
 *  1. Thread 클래스를 상속
 *  2. run 메소드를 오버라이딩
 *  	=> 쓰레드 프로그래밍으로 작업하고 싶은 내용을 구현 (동시 실행 흐름으로 표현하고 싶은 내용을 구현)
 *  3. Thread클래스의 (Thread의 하위클래스) start메소도를 호출
 *  	=> 동시 작업 시작
 *  	=> run을 직접 호출하지 않고 start메소드를 호출하면 JVM이 실행할 수 있는 상태가 되면 자동으로 Thread클래스의 run메소드를 호출
 */
class ThreadDemo1 extends Thread {
	public ThreadDemo1(String name) {
		super(name);
		}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i +"("+getName()+")");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest01 {

	public static void main(String[] args) {
		ThreadDemo1 tr1 = new ThreadDemo1("tr1");
		ThreadDemo1 tr2 = new ThreadDemo1("tr2");
		tr1.start();
		tr2.start();
		System.out.println("*******************프로그램 시작****************");
		
		System.out.println("작업중");
		for (int i = 0; i < 20; i++) {
			System.out.print("main");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	
		System.out.println("***************프로그램 종료*******************");
	}

}
