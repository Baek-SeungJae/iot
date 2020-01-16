package workbook.workshop6.Test07Car;

public class L3 extends Car implements Temp{
	public L3() {}
	public L3(String name, String engine, int oilTank, int oilSize, int distance)
	{
		super(name,engine,oilTank,oilSize,distance);
	}
	
	public void go(int distance)
	{
		super.go(distance);
		setOilSize(getOilSize()-(distance/10));
	}
	public void setOil(int oilSize)
	{
		setOilSize(getOilSize()+oilSize);
	}
	public int getTempGage()
	{
		return getDistance()/10;
	}
}
