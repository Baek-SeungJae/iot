package chap04;
//if문을 중첩해서 사용하는 연습 - gender와 age를 판단해서 결과를 출력
import java.util.Scanner;
//Ctrl+Shift+F => 코드를 정리
//성별과 나이를 입력받아서 다음과 같이 출력하기
//입력값 1,3은 남자 2,4는 여자
//나이 1~19 : 청소년
//	20 : 성인
public class IfExam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("성별을 입력하세요(1,3:남자, 2,4:여자) : ");
		int gender = scan.nextInt();

		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();

		if (gender == 1 | gender == 3) {
			if (age < 20) {
				System.out.println("청소년 남자");
			} else {
				System.out.println("성인 남자");
			}
		}
		if (gender == 2 | gender == 4) {
			if (age < 20) {
				System.out.println("청소년 여자");
			} else {
				System.out.println("성인 여자");
			}
		}
	}
}
