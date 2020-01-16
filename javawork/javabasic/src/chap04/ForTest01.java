package chap04;
//for문 연습 - 기본 for연습(for문의 문법)
public class ForTest01 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++)
		{
			System.out.println("자바프로그래밍"+i);
		}
		System.out.println("***********************************");
		for(int i=10; i<15;i++)
		{
			System.out.println("자바자바");
		}
		System.out.println("***********************************");
		for(int i=5, j=0; i>0; i--,j++)
		{
			System.out.println("자바자바바"+" "+i+" "+j);
		}
		System.out.println("***********************************");
		
		
	}

}
