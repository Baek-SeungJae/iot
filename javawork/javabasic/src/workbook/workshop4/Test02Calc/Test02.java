package workbook.workshop4.Test02Calc;

public class Test02 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		Calc cal = new Calc();
		
		System.out.println(cal.calculate(num));
	}

}
