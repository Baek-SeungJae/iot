package chap04;
//코드의 축약 같은
import java.util.Scanner;

public class SwitchTest02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요:");
		int ssn = key.nextInt();
		
		switch(ssn)
		{
			case 1:
			case 3:
				System.out.println("남자");
				break;
			case 2:
			case 4:
				System.out.println("여자");
				break;
			default:
				System.out.println("기타");
		}
	}
}
