package workbook.workshop6.Test06Shape;

public class Circle extends Shape implements Resize{

	private int radius;
	public Circle() {}
	public Circle(int radius, String colors)
	{
		this.radius = radius;
		super.setColors(colors);
	}
	public double getArea() {
		
		return Math.round(radius*radius*Math.PI*10)/10.0;
	}
	public void setResize(int size)
	{
		this.radius +=size;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
