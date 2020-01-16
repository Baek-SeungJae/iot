package test.exam;
public class OprTest01
{
	public static void main(String[] args) 
	{	
		
		System.out.println("operator  x  y");
		int x=5;
		int y=x++;
		System.out.println("y = x++ : "+x+"  "+y);
		x=5;
		y=++x;
		System.out.println("y = ++x : "+x+"  "+y);
		x=5;
		y=x--;
		System.out.println("y = x-- : "+x+"  "+y);
		x=5;
		y=--x;
		System.out.println("y = --x : "+x+"  "+y);
	}
}
