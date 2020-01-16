package chap07.Inheritance;

public class IceCream extends Dessert{
	private int calorie;
	public IceCream() {}
	public IceCream(String productName, int price, int count, int calorie)
	{
		super(productName,price,count);
		this.calorie = calorie;
	}
	public static void print()
	{
		System.out.println("====================================");
		System.out.println("주문항목 \t 가격 \t 수량 \t 칼로리");
		System.out.println("====================================");
		
	}
	public void printProductInfo()
	{
		System.out.println(super.getProductName()+"\t"+super.getPrice()+"\t"+super.getCount()+"\t"+calorie+"kcal");
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
}
