package workbook.workshop5;

public class Otab extends Mobile{
	public Otab() {}
	public Otab(String mobileName, int batterySize, String osType)
	{
		super(mobileName, batterySize, osType);
	}
	public int operate(int time)
	{
		super.setBatterySize(super.getBatterySize()-12*time);
		return super.getBatterySize();
	}
	public int charge(int time)
	{
		super.setBatterySize(super.getBatterySize()+time*8);
		return super.getBatterySize();
	}
}
