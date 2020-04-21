package basic;

class DigitRunnable implements Runnable {

	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 5 == 0)
				System.out.println();
		}
	}
}

class AlphaRunnable extends Thread {

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

public class RunnableExam01 {
	public static void main(String[] args) {
		DigitRunnable dr = new DigitRunnable();
		AlphaRunnable ar = new AlphaRunnable();
		new Thread(dr).start();
		new Thread(ar).start();
	}
}
