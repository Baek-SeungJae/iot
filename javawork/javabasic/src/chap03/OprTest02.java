package chap03;
//비교연산자
public class OprTest02 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		int num3 = 100;
		//num1변수가 앞의 문자열의 영향을 받아서 문자열 화 되었기 때문에 오류 발생
		//비교 연산, 사칙연산 등을 할 수 없다.
		System.out.println("더한결과=>"+(num1+num2));
		System.out.println("num1>num2==>" + (num1>num2));
		System.out.println("num1>=num2==>" + (num1>=num2));
		System.out.println("num1<num2==>" + (num1<num2));
		System.out.println("num1<=num2==>" + (num1<=num2));
		
		System.out.println("num1==num3==>"+(num1==num3));
		System.out.println("num2==num3==>"+(num2==num3));
		System.out.println("num1!=num3==>"+(num1!=num3));
	}

}
