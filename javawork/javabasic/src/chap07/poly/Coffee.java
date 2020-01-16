package chap07.poly;

public class Coffee extends Beverage{
	static int amount=0;
	public Coffee()
	{
		amount++;
	}
	public Coffee(String name)
	{
		super(name);
		calcPrice();
		amount++;
	}
	public void calcPrice()
	{
		switch(super.getName()){
			case "Americano": super.setPrice(1500);
			break;
			case "CafeLatte": super.setPrice(2500);
			break;
			case "Cappuccino": super.setPrice(3000);
		}
	}
}
