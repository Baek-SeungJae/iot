package chap04;
/*
 *  점수를 sanner로 입력
 *  90~100 : A
 *  80~89 : B
 *  70~79 : C
 *  60~69 : D
 *  0~59 : F
 *  0~100 사이의 값이 아닌 값이 입력되는 경우 : 잘못 입력 출력하기
 */
import java.util.Scanner;

public class ScoreMultiIfExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if(score>=90&score<=100)
		{
			System.out.println("A");
		}
		else if(score>=80&score<90)
		{
			System.out.println("B");
		}
		else if(score>=70&score<80)
		{
			System.out.println("C");
		}
		else if(score>=60&score<70)
		{
			System.out.println("D");
		}
		else if(score>=0&score<60)
		{
			System.out.println("F");
		}
		else
		{
			System.out.println("잘못입력");
		}
	}

}
