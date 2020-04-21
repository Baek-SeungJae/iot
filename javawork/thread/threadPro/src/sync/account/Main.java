package sync.account;

class Plus implements Runnable {
	SharedObj sharedObj;

	public Plus(SharedObj sharedObj) {
		this.sharedObj = sharedObj;
	}

	@Override
	public void run() {
		synchronized (sharedObj) {
			for (int i = 0; i < 5; i++) {
				System.out.println("ÀÜ¾×ÀÇ ÇÕ: " + sharedObj.acc1.getBalance() + "+" + sharedObj.acc2.getBalance() + "="
						+ (sharedObj.acc1.getBalance() + sharedObj.acc2.getBalance()));
			}
		}
	}
}

class Trans implements Runnable {
	SharedObj sharedObj;

	public Trans(SharedObj sharedObj) {
		this.sharedObj = sharedObj;
	}

	@Override
	public void run() {
		synchronized (sharedObj) {
			for (int i = 0; i < 20; i++) {
				System.out.println("ÀÌÃ¼");
				sharedObj.acc1.withdraw(100);
				sharedObj.acc2.deposit(100);
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		SharedObj sharedObj = new SharedObj();

		sharedObj.acc1 = new Account("001", 1000, "±è¼­¿¬");
		sharedObj.acc2 = new Account("002", 5000, "Çöºó");
		new Thread(new Plus(sharedObj)).start();
		new Thread(new Trans(sharedObj)).start();

	}
}
