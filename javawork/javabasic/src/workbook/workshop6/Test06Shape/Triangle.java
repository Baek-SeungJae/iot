package workbook.workshop6.Test06Shape;

public class Triangle extends Shape implements Resize{
	public Triangle(){}
	public Triangle(int width, int height, String colors)
	{
		super(width, height, colors);
	}
	public double getArea()
	{
		return super.getWidth()*super.getHeight()*0.5;
	}
	public void setResize(int size)
	{
		super.setHeight(super.getHeight()+size);
	}
}
