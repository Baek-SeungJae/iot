package chap04;
//switch�������� �������
import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) {
	// switch�� ���ǹ��� int�� casting �� �� �ִ� ���� ��� �ִ� ����, �����, �޼ҵ�
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
