package workbook.workshop3;

public class Book {

	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public Book() {}
	public Book(String bookName, int bookPrice, double bookDiscountRate)
	{
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	public double getDiscountBookPrice()
	{
		return this.bookPrice*(100-this.bookDiscountRate)/100;
	}
	public void print() {
		System.out.println(this.getBookName() + " " + this.getBookPrice()+"¿ø "+this.getBookDiscountRate()+"% "+this.getDiscountBookPrice()+"¿ø");
	}
	
	public void setBookName(String bookName) {this.bookName = bookName;}
	public void setBookPrice(int bookPrice) {this.bookPrice = bookPrice;}
	public void setBookDiscountRate(double bookDiscountRate) {this.bookDiscountRate = bookDiscountRate;}
	
	public String getBookName() {return this.bookName;}
	public int getBookPrice() {return this.bookPrice;}
	public double getBookDiscountRate() {return this.bookDiscountRate;}
}
