package chap08;
//예외발생 코드가 정의된 클래스
public class ExceptionTest03 {
	public static void main(String[] args) {
		try {
			System.out.println("************프로그램시작************");
			System.out.println(10/0);
			System.out.println("************프로그램종료************");
		}
		catch (ArithmeticException e)
		{
			System.out.println("오류발생...");
			System.out.println("예외메시지: "+e.getMessage());
			e.printStackTrace();
		}
	}

}
