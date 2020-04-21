package basic;
/*
 * ��Ƽ������ ���α׷���
 * 1. Runnable �������̽��� �����ϴ� Ŭ������ ����
 * 2. Runnable �������̽��� ���� �ִ� �߻�޼ҵ��� run�޼ҵ带 �������̵�
 * 3. �ۼ��� Runnable��ü�� �̿��ؼ� Thread����
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
