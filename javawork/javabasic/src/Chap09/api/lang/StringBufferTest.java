package Chap09.api.lang;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		
		System.out.println("원본 => "+sb);
		
		sb.append("재밌다."); // 맨 끝에 추가
		System.out.println("원본 => "+sb);
		
		sb.insert(2, "자바");
		System.out.println("원본 => "+sb);
		
		sb.delete(2,4);
		System.out.println("원본 => "+sb);
		
		sb.reverse();
		System.out.println("원본 => "+sb);
	}
}
