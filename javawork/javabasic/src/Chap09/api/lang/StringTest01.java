package Chap09.api.lang;

public class StringTest01 {

	public static void main(String[] args) {
		// Stirng의 상수들이 저장되는 풀에 저장
		String str1 = "java";
		String str2 = "java";
		
		// 인스턴스로 할당
		String str3 = new String("java");
		String str4 = new String("java");
		
		
		if(str1==str2) // 1, 2는 값
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		if(str3==str4) // 3, 4는 주소
			System.out.println("같다");
		else
			System.out.println("다르다");
		// String은 "문자열"의 형태로 정의될 수 있고 인스턴스의 형태로 정의될 수 있지만 문자열의 비교는 equals()를 사용하자.
		// 
		
	}

}
