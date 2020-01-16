package workbook.workshop6.Test07Car;

public class L5 extends Car implements Temp{
	public L5() {}
	public L5(String name, String engine, int oilTank, int oilSize, int distance)
	{
		super(name,engine,oilTank,oilSize,distance);
	}
	
	public void go(int distance)
	{
		super.go(distance);
		setOilSize(getOilSize()-(distance/8));
	}
	public void setOil(int oilSize)
	{
		setOilSize(getOilSize()+oilSize);
	}
	public int getTempGage()
	{
		return 2*getDistance()/10;
	}
}
