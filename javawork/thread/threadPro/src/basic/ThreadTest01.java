package basic;

/*
 *  ��Ƽ������ ���α׷���
 *  1. Thread Ŭ������ ���
 *  2. run �޼ҵ带 �������̵�
 *  	=> ������ ���α׷������� �۾��ϰ� ���� ������ ���� (���� ���� �帧���� ǥ���ϰ� ���� ������ ����)
 *  3. ThreadŬ������ (Thread�� ����Ŭ����) start�޼ҵ��� ȣ��
 *  	=> ���� �۾� ����
 *  	=> run�� ���� ȣ������ �ʰ� start�޼ҵ带 ȣ���ϸ� JVM�� ������ �� �ִ� ���°� �Ǹ� �ڵ����� ThreadŬ������ run�޼ҵ带 ȣ��
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
		System.out.println("*******************���α׷� ����****************");
		
		System.out.println("�۾���");
		for (int i = 0; i < 20; i++) {
			System.out.print("main");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	
		System.out.println("***************���α׷� ����*******************");
	}

}
