package chap07.Inheritance;
public class CheckingAccount extends Account{
	private String cardNo;
	public CheckingAccount(){}
	public CheckingAccount(String accID, String ownerName, int balance, String cardNo)
	{
		super(accID,balance,ownerName);
		this.cardNo = cardNo;
	}
	public void pay(String cardNo,int amount)
	{ 
		if(this.cardNo.equals(cardNo))
		{
			if(super.getBalance()>=amount)
			{
				//super.setBalance(super.getBalance()-amount);
				super.withdraw(amount);
			}
			else
			{
				System.out.println("������ �Ұ����մϴ�."); // ī���ȣ�� �°� �ܾ׺���
			}
		}
		else
		{
			System.out.println("������ �Ұ����մϴ�."); // ī���ȣ�� Ʋ��
		}
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}
