package workbook.workshop4.Test06Account;

public class Account {
	private String account;
	private int balance;
	private String ownerName;
	private double interestRate;
	
	Account(){}
	Account(String account, int balance, double interestRate)
	{
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
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
		System.out.println("계좌번호: "+this.account+" 잔액: "+this.balance + "원 이자율: "+this.interestRate+"%");
	}
	
	public void accountInfo()
	{
		System.out.println("계좌번호: "+this.account+" 잔액: "+this.balance+"원 이자율: "+this.interestRate+"% 이자: "+this.calculateInterest()+"원");
	}
}
