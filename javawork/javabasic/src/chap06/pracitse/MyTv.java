package chap06.pracitse;

public class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void turnOnOff()
	{
		if(this.isPowerOn==true)
			this.isPowerOn=false;
		else
			this.isPowerOn=true;
	}
	public void volumeUp()
	{
		if(volume<100)
		{
			
		}
	}
}
