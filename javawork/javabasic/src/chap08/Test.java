package chap08;

public class Test {

	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		int num = obj.test(100,0);
		System.out.println("결과: "+num);
		
		
		ThrowsTest02 obj2 = new ThrowsTest02();
		int num2 = 10;
		int inputNum=100;
		try{
			num2 = obj2.test(inputNum, 0);
		} catch(ArithmeticException e) {
			if(inputNum%2==0)
				num2 = 1000;
			else
				num2 = 10;
		} finally {
		System.out.println("결과: "+num2);
		}
	}
}