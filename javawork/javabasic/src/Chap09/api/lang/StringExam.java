package Chap09.api.lang;

public class StringExam {

	public static void main(String[] args) {
		//str1�� AVAJ�� ��µǵ��� �����ϼ���
		//��, StringBuffer�� reverse()������� �ʱ�
		String str1 = "java".toUpperCase();
				
		for(int i=(str1.length()-1); i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
	}
}
