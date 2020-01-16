package chap04;

import java.util.Scanner;

//switch 연습 - 기본문법
//switch는 if- else문을 대신할 수 있는 제어문
public class SwitchTest01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요:");
		int ssn = key.nextInt();
		
		switch(ssn) // true | false로 판단할 수 있는 조건이 아니라 평가할 값을 가지고 있는 변수 // 지정된 변수, 연산식, 메소드 호출
		{
			case 1: // ssn변수에 저장된 값을 case문으로 평가 - 비교연산자 사용불가
				System.out.println("남자");
				break; //break문을 만나면 break가 속해있는 블럭을 빠져나간다.
			case 2:
				System.out.println("여자");
				break;
			case 3:
				System.out.println("남자");
				break;
			case 4:
				System.out.println("여자");
				break;
			default: // if문의 else와 같은 역할
				System.out.println("기타");
		}
	}
}
