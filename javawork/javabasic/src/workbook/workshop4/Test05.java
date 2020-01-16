package workbook.workshop4;

public class Test05 {

	public static void main(String[] args) {
		Account account = new Account("441-0290-1203",500000,7.3);
		account.print();
		account.deposit(20000);
		account.print();
		System.out.println("¿Ã¿⁄: "+account.calculateInterest());
	}
}
