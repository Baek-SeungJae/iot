package chap03;
//��������

public class OprTest03 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		//&������(and)
		System.out.println("========&����========");
		System.out.println((num1<num2)&(num1>=100)); // tt
		System.out.println((num1<num2)&(num1>100));  // tf
		System.out.println((num1>num2)&(num1>=100)); // ft
		System.out.println((num1>num2)&(num1>100));  // ff
		
		System.out.println("========|����========");
		System.out.println((num1<num2)|(num1>=100)); // tt
		System.out.println((num1<num2)|(num1>100));  // tf
		System.out.println((num1>num2)|(num1>=100)); // ft
		System.out.println((num1>num2)|(num1>100));  // ff
		
		System.out.println();
		System.out.println(!true);
		System.out.println(!false);
		
	
	}

}
