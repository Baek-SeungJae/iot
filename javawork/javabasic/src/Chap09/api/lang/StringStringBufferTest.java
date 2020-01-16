package Chap09.api.lang;

public class StringStringBufferTest {
	public static void stringCheck(int count) {
		String str = new String("�ڹ�");
		long start = System.nanoTime();
		for(int i= 1; i<=count; i++)
		{
			str = str+"java";
		}
		long end = System.nanoTime();
		System.out.println("str=str+java");
		System.out.println("�ɸ��ð�:" + (end-start)/1000000000.0 + "sec");
	}
		
	public static void stringBufferCheck(int count) {
		StringBuffer str = new StringBuffer("�ڹ�");
		long start = System.nanoTime();
		for(int i= 1; i<=count; i++)
		{
			str.append("java");
		}
		long end = System.nanoTime();
		System.out.println("str.append(\"java\")");
		System.out.println("�ɸ��ð�:" + (end-start)/1000000000.0 + "sec");
	}
	
	public static void main(String[] args) {
		System.out.println("����Ƚ��:"+100000);
		System.out.println();
		stringCheck(100000);
		System.out.println();
		stringBufferCheck(100000);
	}
}