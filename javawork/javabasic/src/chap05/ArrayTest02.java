package chap05;

import java.util.Random;
import java.util.Scanner;

//참조형데이터 배열 만들기
public class ArrayTest02 {

	public static void main(String[] args) {
		String[] strArr = new String[3];
		Random[] randArr = new Random[5];
		Scanner[] keyArr = new Scanner[100];
		
		System.out.println(strArr[0]);
		System.out.println(randArr[0]);
		System.out.println(keyArr[0]);
		
		String[] arr = new String[3];
		arr[0] = new String("java");
		arr[1] = new String("JDBC");
		arr[2] = new String("HTMLS");
		
		randArr[0] = new Random();
		randArr[1] = new Random();
		
		for(int i=0; i<randArr.length; i++)
		{
			System.out.println(randArr[i]);
		}
	}
		
}
