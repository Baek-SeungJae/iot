package basic;

class DigitThread extends Thread {
	public DigitThread(String name) {
		super(name);
	}

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

class AlphaThread extends Thread {
	public AlphaThread(String name) {
		super(name);
	}

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

public class ThreadExam01 {
	public static void main(String[] args) {
		DigitThread tr1 = new DigitThread("digit");
		AlphaThread tr2 = new AlphaThread("alpha");
		tr1.start();
		tr2.start();
	}
}
