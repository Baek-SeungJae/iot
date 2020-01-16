package test.exam;
public class IfTest02
{
	public static void main(String[] args) 
	{
		int num1 = 90;
		System.out.println("프로그램 시작");
		
		if(num1>=90) //조건 : true나 false가 반환되게 하는 식
		{
			//조건을 만족하는 경우	
			System.out.println("합격");
		}
		else 
		{
			//조건을 만족하지 않는 경우
			System.out.println("불합격");
		}

		System.out.println("프로그램 종료");

	}
}
