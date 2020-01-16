package test.exam;
public class Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("ȫ�浿", 100);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
class BankCustomer {
	private String name;
	private int currentMoney;
	public BankCustomer(String name, int currentMoney) {
		this.name = name;
		this.currentMoney = currentMoney;
	}
	
	void withdraw(int money) {
		if(currentMoney>=money)
		{
			currentMoney-=money;
		}
		else
		{
			throw new IllegalArgumentException("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentMoney() {
		return currentMoney;
	}
	public void setCurrentMoney(int currentMoney) {
		this.currentMoney = currentMoney;
	}
}
