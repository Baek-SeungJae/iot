package workbook.workshop7.Test01Shape;

public abstract class Shape {
	Point point;
	public Shape() {}
	public Shape(Point point)
	{
		this.point = point;
	}
	public abstract double getArea();
	public abstract double getCircumference();
}
