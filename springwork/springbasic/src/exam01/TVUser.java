package exam01;

public class TVUser {
	public static void main(String[] args) {
		TV Samsungtv = new SamsungTV();
		Samsungtv.turnOn();
		Samsungtv.soundUp();
		Samsungtv.soundDown();
		Samsungtv.turnOff();
		
		TV lgtv = new LgTV();
		lgtv.turnOn();
		lgtv.soundUp();
		lgtv.soundDown();
		lgtv.turnOff();
	}

}
