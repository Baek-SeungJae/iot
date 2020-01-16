package workbook.workshop6.Test06Shape;

public class Rectangle extends Shape implements Resize{
	public Rectangle() {}
	public Rectangle(int width, int height, String colors)
	{
		super(width, height, colors);
	}
	public double getArea() 
	{
		return super.getWidth()*super.getHeight();
	}
	public void setResize(int size) 
	{
		super.setWidth(super.getWidth()+size);
	}
}
