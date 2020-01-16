package workbook.workshop5.Test05Mobile;

public class Mobile {
	private String moblieName;
	private int batterySize;
	private String osType;
	public Mobile() {}
	public Mobile(String mobileName, int batterySize, String osType)
	{
		this.moblieName =mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	public int operate(int time)
	{
		this.batterySize-=time*10;
		return this.batterySize;
	}
	public int charge(int time)
	{
		this.batterySize+=time*10;
		return this.batterySize;
	}
	public String getMoblieName() {
		return moblieName;
	}
	public void setMoblieName(String moblieName) {
		this.moblieName = moblieName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}

}
