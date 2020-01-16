package workbook.workshop6.Test02Calculator;

public class CalcTest {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		char opr = args[1].charAt(0);
		Calculator cal = new Calculator();
		switch(opr){
			case '+': break;
			case '-': break;
			case 'x': break;
			case '/': System.out.println("°á°ú: "+cal.divide(num1, num2)); 
				break;
		}
	}
}