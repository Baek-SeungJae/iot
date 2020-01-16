package basic;

public class CalcLogic {
	public int calc(int num1, String method, int num2) {
		switch (method) {
			case "+" :
				return num1 + num2;
			case "-" :
				return num1 - num2;
			case "*" :
				return num1 * num2;
			case "/" :
				return num1 / num2;
			default :
				return 0;
		}
	}
}
