package chap07.poly;

public class Tea extends Beverage{
	static int amount=0;
	public Tea()
	{
		amount++;
	}
	public Tea(String name)
	{
		super(name);
		calcPrice();
		amount++;
	}
	public void calcPrice()
	{
		switch(super.getName()){
			case "LemonTea": super.setPrice(1500);
			break;
			case "ginsengTea": super.setPrice(2000);
			break;
			case "redginsengTea": super.setPrice(2500);
		}
	}
}
