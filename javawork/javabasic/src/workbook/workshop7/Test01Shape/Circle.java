package workbook.workshop7.Test01Shape;

public class Circle extends Shape implements Movable{
	private int radius;
	public Circle() {}
	public Circle(int radius, int x, int y)
	{
		super(new Point(x,y));
		this.radius = radius;
	}
	public double getArea()
	{
		return Math.round(radius*radius*Math.PI*10)/10.0;
	}
	public double getCircumference()
	{
		return Math.round(2*radius*Math.PI*10)/10.0;
	}
	public void move(int x, int y)
	{
		this.point.setX(this.point.getX()+x+1);
		this.point.setY(this.point.getY()+y+1);
	}
	public String printInfo()
	{
		return("Circle: "+this.radius+" " + this.point.getX()+" " + this.point.getY());
	}
}
