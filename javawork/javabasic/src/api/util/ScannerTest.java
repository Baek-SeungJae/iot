package api.util;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요:");
		String str = key.next();
		System.out.println("키보드로 입력받은 문자열:" +str);
		
		System.out.print("숫자를 입력하세요:");
		int i = key.nextInt();
		System.out.println("키보드로 입력받은 숫자:"+i);
		
	}
}
