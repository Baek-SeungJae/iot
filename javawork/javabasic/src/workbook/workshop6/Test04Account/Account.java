package workbook.workshop6.Test04Account;

public class Account {
	private String account;
	private double balance;
	private double interestRate;
	
	public Account(){}
	public Account(String account, double balance, double interestRate)
	{
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public double calculateInterest()
	{
		return Math.round(this.balance * (this.interestRate/100));
	}
	public void deposit(int money) throws Exception
	{
		if(money>=0){
			this.balance = this.balance+ money;
		} else {
			throw new Exception("�Ա� �ݾ��� 0���� �����ϴ�.");
		}
	}
	public void withdraw(int money) throws Exception
	{
		if(money<=this.balance&money>=0){
			this.balance = this.balance-money;
		} else{
			throw new Exception("��� �ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
		}
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void setAccount(String account)
	{
		this.account = account;
	}
	public String getAccount()
	{
		return this.account;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
