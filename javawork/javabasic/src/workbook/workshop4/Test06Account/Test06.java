package workbook.workshop4.Test06Account;

public class Test06 {

	public static void main(String[] args) {
		Account[] acc = new Account[5];
		for(int i=0; i<acc.length; i++)
			acc[i] = new Account("221-0101-211"+String.valueOf(i+1),100000,4.5);
		
		for(int i=0; i<acc.length; i++)
			acc[i].print();
		
		System.out.println();
		
		for(int i=0; i<acc.length; i++)
		{
			acc[i].setInterestRate(3.7);
			acc[i].accountInfo();
		}
			
		
	}

}
