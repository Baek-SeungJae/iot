package chap08;

import java.util.Scanner;

// ¿¹¿Ü°¡ ¹ß»ýµÈ °÷¿¡¼­ ¿¹¿Ü¸¦ Ã³¸®ÇÏµµ·Ï Á¤ÀÇ
// ¿¹¿Ü°¡ ¹ß»ýµÈ °÷¿¡¼­ ¿¹¿Ü¸¦ Ã³¸®ÇÏ¸é È£­„³ª¤Ñ¤¤ °÷¿¡¼­´Â ¾î¶² ¿¹¿Ü°¡ ¹ß»ýÇß´ÂÁö ¾Ë ¼ö ¾ø°í ¿¹¿Ü°¡ ¹ß»ýÇÒ¶§ °æ¿ì¿¡ µû¶ó¼­ ´Ù¸£°Ô Ã³¸®ÇÏ°í ½Í¾îµµ ÇÒ ¼ö ¾ø´Ù.
// 
public class ThrowsTest01 {

	public int test(int num1, int num2) { //°è»ê¸¸ÇÏ´Â ¸Þ¼Òµå
		int result=0;
		try {
			System.out.println("------------test()¸Þ¼Òµå ³»ºÎ-------------");
			System.out.println("ÀÔ·Â°ª: " +num1);
			System.out.println("ÀÔ·Â°ª: " +num2);
			result = num1/num2;
			System.out.println("°á°ú: " +result);
			System.out.println("------------test()¸Þ¼Òµå ³»ºÎ-------------");
		} catch(ArithmeticException e) {
			//¿¹¿Ü°¡ ¹ß»ýµÇ¸é  result º¯¼ö¿¡´Â 0À» Á¤ÀÇ
			result = 0;
		}
		return result;
	}
	public void show() { // ¼ýÀÚ¸¦ Àü´ÞÇÏ¸ç test()¸¦ È£ÃâÇÏ´Â ¸Þ¼Òµå
		Scanner key = new Scanner(System.in);
		System.out.print("¼ýÀÚÀÔ·Â: ");
		int num1 = key.nextInt();
		System.out.print("¼ýÀÚÀÔ·Â: ");
		int num2 = key.nextInt();
		int result = test(num1,num2);
		
		//¹«Á¶°Ç ½ÇÇàµÇ¾î¾ß ÇÏ´Â ¸í·É¹®
		System.out.println("test()È£Ãâ°á°ú:"+result);
	}
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		obj.show();
	}

}
