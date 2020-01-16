package workbook.workshop3;

public class Test07 {

	public static void main(String[] args) {
		Book bookArray[] = new Book[3];
//		bookArray[0] = new Book("SQL Plus",50000,5);
//		bookArray[1] = new Book("Java 2.0",40000,3);
//		bookArray[2] = new Book("JSP Servlet",60000,6);
		
		bookArray[0] = new Book();
		bookArray[1] = new Book();
		bookArray[2] = new Book();
		
		bookArray[0].setBookName("SQL Plus");
		bookArray[0].setBookPrice(50000);
		bookArray[0].setBookDiscountRate(5);
		
		bookArray[1].setBookName("Java 2.0");
		bookArray[1].setBookPrice(40000);
		bookArray[1].setBookDiscountRate(3);
		
		bookArray[2].setBookName("JSP Servlet");
		bookArray[2].setBookPrice(60000);
		bookArray[2].setBookDiscountRate(6);
		
		int sum=0;
		double dis_sum=0.0;
		
		for(int i=0; i<bookArray.length; i++)
		{	
			bookArray[i].print();
			sum +=bookArray[i].getBookPrice();
			dis_sum+=bookArray[i].getDiscountBookPrice();
		}
		System.out.println("책 가격의 합: "+sum+"원");
		System.out.println("할인 된 책 가격의 합: "+dis_sum+"원");
	}


}