package workbook.workshop6.Test02Calculator;

public class Calculator {
	public Calculator(){}
	public double divide(int a, int b)
	{
		try
		{
			return a/b;
		} catch (ArithmeticException e) {
			System.out.println("Exception�� �߻� �Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
			return 0.0;
		}
	}
}
