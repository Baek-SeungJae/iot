package chap04;

public class DoWhileTest {

	public static void main(String[] args) {
		
		int num = 10;
		while(num>10)
		{
			System.out.println("while문 - 실행명령문 : " +num);
			num++;
		}
		
		
		num = 10;
		do 
		{
			System.out.println("do_while문 - 실행명령문 : " +num);
			num++;
		}
		while(num<10);
		System.out.println("최종 결과 : " +num);

	}

}
