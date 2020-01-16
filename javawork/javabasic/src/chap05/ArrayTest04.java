package chap05;

import java.util.Random;

// 배열의 선언, 생성, 초기화를 한꺼번에 처리하는 방법
public class ArrayTest04 {

	public static void main(String[] args) {
		
		//다른 언어와 동일한 방법으로 선언하기 - ,로 구분해서 배열 요소를 구분한다.
		int[] myarr = {10, 20, 30, 40, 50};
		
		System.out.println("배열의 요소의 개수 : "+myarr.length);
		for(int i=0; i<myarr.length; i++)
		{
			System.out.println(myarr[i]);
		}
		
		// 자바 언어 답게 선언, 생성, 초기화
		int[] myarr2 = new int[] {10, 20, 30, 40, 50};
		System.out.println("배열의 요소의 개수 : "+myarr.length);
		for(int i=0; i<myarr2.length; i++)
		{
			System.out.println(myarr2[i]);
		}
		
		//참조형 배열의 선언과 생성과 초기화를 한꺼번에
		
		String[] strArr = {new String("abc"), new String("kkk"), new String("oh")};
		
		System.out.println("참조형배열의 개수 : "+strArr.length);
		//참조형 배열이기 때문에 객체가 할당된 곳의 주소값이 출력되어야 하나 String이 예외
		//String 클래스는 기본형처럼 사용할 수 있다. - 가장 많이 쓰이는 참조형이므로 허용
		for(int i=0; i<strArr.length; i++)
		{
			System.out.println(strArr[i]);
		}
		String[] strArr2 = {"top","jg","mid","adc","spt"};
		for(int i=0; i<strArr2.length; i++)
		{
			System.out.println(strArr2[i]);
		}
		
		Random[] randArr = {new Random(), new Random(), new Random()};
		for(int i=0; i<randArr.length;i++)
		{
			System.out.println("배열 요소 => " + randArr[i]);
		}
		
		
	}

}
