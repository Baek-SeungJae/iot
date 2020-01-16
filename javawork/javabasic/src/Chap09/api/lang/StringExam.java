package Chap09.api.lang;

public class StringExam {

	public static void main(String[] args) {
		//str1을 AVAJ로 출력되도록 구현하세요
		//단, StringBuffer의 reverse()사용하지 않기
		String str1 = "java".toUpperCase();
				
		for(int i=(str1.length()-1); i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
	}
}
