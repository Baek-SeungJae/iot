package basic;

/*
 * ������ ����
 * 1. ������ ������ �����ؼ� �����ϴ� ���
 * flag ����
 * - ������ ����� ���� ���� ó���� �� �ֵ��� ����(���� or ���� - boolean)
 * - �������� üũ(���� �ɸ��� �۾��� �ִ� ��� �߰��� �� ���� üũ�ؼ� �����带 ������ �� �ִ�.
 */
class ThreadTest2 extends Thread {
	public ThreadTest2(String name) {
		super(name);
		}
	@Override
	public void run() {
		
			try {
				while(!Thread.interrupted()) {
				System.out.println("������ ������");
				Thread.sleep(500);	
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("������ �������...");
			}
	
		
	}
}

public class StopThread02 {
		
	public static void main(String[] args) {
		System.out.println("main����");
		ThreadTest2 t = new ThreadTest2("t");
		t.start();
		System.out.println("�������� �̸�: "+ t.getName());
		System.out.println("���ͷ�Ʈ ����: "+t.isInterrupted());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();
		System.out.println("���ͷ�Ʈ ����: "+t.isInterrupted()); 	
		System.out.println("main����");
	}

}
