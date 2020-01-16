package chap06.pracitse;

public class Mypoint {
	private int x;
	private int y;
	public Mypoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public double getDistance(int x, int y)
	{
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
}