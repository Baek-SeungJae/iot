package test.exam;
import java.util.Scanner;
public class Prob1 {
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		String str= scan.nextLine();
		int result= 0;
		try {
			result = convert(str);
			System.out.println("��ȯ�� ���ڴ� "+result+" �Դϴ�.");
		} catch(IllegalAccessException e) {
			System.out.println("���ܰ� �߻��Ǿ����ϴ�. ���ڿ� �Է����� �ʰ� EnterŰ�� �����̽��ϴ�.");
		}
	}
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	private static int convert(String str) throws IllegalAccessException {
		if (!str.isEmpty() | str.length()!=0){
			return Integer.parseInt(str);
		}
		else{
			throw new IllegalAccessException();
		}
	}
}