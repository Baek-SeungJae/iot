package chap03;

public class VariableTest {

	public static void main(String[] args) {
		//기본형변수
		int i = 10;
		int j = 10;
		System.out.println("======================");
		
		if(i==j)
		{
			System.out.println("기본형 같다.");
		}
		else
		{
			System.out.println("기본형 다르다.");
		}
		//참조형변수
		String str1 = new String("java");
		String str2 = new String("java");
		System.out.println("======================");
		//str1=str2;
		if(str1==str2)
			System.out.println("참조형 같다.");
		else
			System.out.println("참조형 다르다.");
		System.out.println("======================");
		//문자열비교 - String클래스의 메소드로 처리
		if(str1.equals(str2))
			System.out.println("문자열 같다.");
		else
			System.out.println("문자열 다르다.");
		
	}
}
