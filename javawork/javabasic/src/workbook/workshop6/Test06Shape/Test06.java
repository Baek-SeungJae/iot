package workbook.workshop6.Test06Shape;

public class Test06 {

	public static void main(String[] args) {
		Shape shape[] = new Shape[7];
		shape[0] = new Triangle(7,5,"Blue");
		shape[1] = new Rectangle(4,6,"Blue");
		shape[2] = new Triangle(6,7,"Red");
		shape[3] = new Rectangle(8,3,"Red");
		shape[4] = new Triangle(9,8,"White");
		shape[5] = new Rectangle(5,7,"White");
		shape[6] = new Circle(5,"Green");
		System.out.println("기본정보");
		
		for(int i=0; i<shape.length; i++)
		{
			if(shape[i]  instanceof Circle) 
				System.out.println(shape[i].getClass().getName().replaceAll("workbook.workshop6.Shape.", "")+"\t\t"+shape[i].getArea()+"\t"+shape[i].getColors());
			else 
				System.out.println(shape[i].getClass().getName().replaceAll("workbook.workshop6.Shape.", "")+"\t"+shape[i].getArea()+"\t"+shape[i].getColors());
		}
		
		System.out.println("\n사이즈를 변경 후 정보");
		for(int i=0; i<shape.length; i++)
		{
			((Resize)shape[i]).setResize(5);
			if(shape[i]  instanceof Circle) 
				System.out.println(shape[i].getClass().getName().replaceAll("workbook.workshop6.Shape.", "")+"\t\t"+shape[i].getArea()+"\t"+shape[i].getColors());
			else 
				System.out.println(shape[i].getClass().getName().replaceAll("workbook.workshop6.Shape.", "")+"\t"+shape[i].getArea()+"\t"+shape[i].getColors());
		}
	}
}
