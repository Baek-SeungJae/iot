package basic;

/*
 * ������ ����
 * 1. ������ ������ �����ؼ� �����ϴ� ���
 * flag ����
 * - ������ ����� ���� ���� ó���� �� �ֵ��� ����(���� or ���� - boolean)
 * - �������� üũ(���� �ɸ��� �۾��� �ִ� ��� �߰��� �� ���� üũ�ؼ� �����带 ������ �� �ִ�.
 */
class ThreadTest extends Thread {
	public ThreadTest(String name) {
		super(name);
		}
	private boolean state = true;

	@Override
	public void run() {
		while(state) {
			System.out.println("������ ������");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("������ �������...");
	}
	public void stopThread() {
		state= false;
	}
}

public class StopThread01 {

	public static void main(String[] args) {
		System.out.println("main����");
		ThreadTest t1 = new ThreadTest("t1");
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.stopThread();
		System.out.println("main����");
	}

}
