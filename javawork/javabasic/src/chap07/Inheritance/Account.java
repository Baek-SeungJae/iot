package chap07.Inheritance;

public class Account {
	private String account;
	private int balance;
	private String ownerName;
	private double interestRate;
	Account(){}
	Account(String account, int balance, String ownerName)
	{
		this.account = account;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
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
	public int getBalance()
	{
		return this.balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double calculateInterest()
	{
		return Math.round(this.balance * (this.interestRate/100));
	}
	public void deposit(int money)
	{
		this.balance = this.balance+ money;
	}
	public void withdraw(int money) 
	{
		this.balance = this.balance-money;
	}
	public void print()
	{
		System.out.println("���¹�ȣ: "+this.account+" �ܾ�: "+this.balance + "�� ������: "+this.interestRate+"%");
	}
	public void accountInfo()
	{
		System.out.println("���¹�ȣ: "+this.account+" �ܾ�: "+this.balance+"�� ������: "+this.interestRate+"% ����: "+this.calculateInterest()+"��");
	}
}
