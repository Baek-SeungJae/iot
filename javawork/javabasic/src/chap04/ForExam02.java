package chap04;

import java.util.Scanner;

public class ForExam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����� �� : ");
		int num = scan.nextInt();
		for(int i=1; i<=9; i++)
		{
			System.out.println(num + " * " + (i) + " = " + (num*(i)));
		}

	}

}
