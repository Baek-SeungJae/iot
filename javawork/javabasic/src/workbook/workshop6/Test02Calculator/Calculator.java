package workbook.workshop6.Test02Calculator;

public class Calculator {
	public Calculator(){}
	public double divide(int a, int b)
	{
		try
		{
			return a/b;
		} catch (ArithmeticException e) {
			System.out.println("Exception이 발생 하였습니다. 다시 입력해 주세요");
			return 0.0;
		}
	}
}
