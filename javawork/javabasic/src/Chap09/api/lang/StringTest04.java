package Chap09.api.lang;

public class StringTest04 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("java oracle servlet jsp spring");
		
		
		byte[] data1 = str1.getBytes();
		for(int i=0; i<data1.length; i++)
			System.out.print(data1[i]+"\t");
		
		System.out.println();
		char[] data2 = str1.toCharArray();
		for (int i = 0; i < data2.length; i++) {
			System.out.print(data2[i]+"\t");
		}
		
		System.out.println();
		String[] data3 = str2.split(" ");
		for (int i = 0; i < data3.length; i++) {
			System.out.print(data3[i]+"\t");
		}
		
		System.out.println();
		int i = 1000;
		double d = 10.0;
		test(String.valueOf(i));
		test(String.valueOf(d));
		test(i+"");
		test(d+"");
		
	}//main
	
	public static void test(String data) {
		System.out.println("전달된 데이터=>" +data);
		
	}
	
}//class
