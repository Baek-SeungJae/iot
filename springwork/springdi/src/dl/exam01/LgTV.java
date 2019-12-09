package dl.exam01;

public class LgTV extends TV{
	private String LgTV = "LgTV";
	public void turnOn() {
		System.out.print(LgTV);
		super.turnOn();
	}
	public void turnOff() {
		System.out.print(LgTV);
		super.turnOff();
	}
	public void soundUp() {
		System.out.print(LgTV);
		super.soundUp();
	}
	public void soundDown() {
		System.out.print(LgTV);
		super.soundDown();
	}
}
