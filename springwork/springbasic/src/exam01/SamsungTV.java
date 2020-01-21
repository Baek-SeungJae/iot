package exam01;

public class SamsungTV extends TV{
	private String SamsungTV = "SamsungTV";
	public void turnOn() {
		System.out.print(SamsungTV);
		super.turnOn();
	}
	public void turnOff() {
		System.out.print(SamsungTV);
		super.turnOff();
	}
	public void soundUp() {
		System.out.print(SamsungTV);
		super.soundUp();
	}
	public void soundDown() {
		System.out.print(SamsungTV);
		super.soundDown();
	}
}
