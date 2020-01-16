package chap04;
//switch문에서의 제약사항
import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) {
	// switch의 조건문은 int로 casting 될 수 있는 값을 담고 있는 변수, 연산식, 메소드
	// byte, short, int, char,     string
		double d = 1.0;
		/*switch(d)
		{
			case 1.0:
		}*/
		int data = 5;
		/*switch(data+60)
		{
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
		}*/
		
		String str = new String("a01");
		switch(str)
		{
			case "a01": 
				System.out.println("A01");
				break;
			case "a02":
				System.out.println("A02");
				break;
		}
	}
}
