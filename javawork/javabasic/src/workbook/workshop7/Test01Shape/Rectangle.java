package workbook.workshop7.Test01Shape;

public class Rectangle extends Shape implements Movable{
	private int width;
	public Rectangle() {}
	public Rectangle(int width, int x, int y)
	{
		super(new Point(x,y));
		this.width = width;
	}
	public double getArea()
	{
		return Math.round(width*width*10)/10.0;
	}
	public double getCircumference()
	{
		return Math.round(4*width*10)/10.0;
	}
	public void move(int x, int y)
	{
		this.point.setX(this.point.getX()+x+2);
		this.point.setY(this.point.getY()+y+2);
	}
	public String printInfo()
	{
		return("Rectangle: "+this.width+" " + this.point.getX()+" " + this.point.getY());
	}
}
