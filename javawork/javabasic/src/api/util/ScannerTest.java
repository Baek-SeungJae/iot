package api.util;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ���:");
		String str = key.next();
		System.out.println("Ű����� �Է¹��� ���ڿ�:" +str);
		
		System.out.print("���ڸ� �Է��ϼ���:");
		int i = key.nextInt();
		System.out.println("Ű����� �Է¹��� ����:"+i);
		
	}
}
