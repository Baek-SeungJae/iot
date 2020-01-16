package chap07.poly;
/*
 *  객체의 타입을 검사하고 작업할 수 있다.
 *  instanceof연산자를 이용
 */

class AA{
	
}
interface IA{
	
}
public class InstanceOfTest {
	public static void main(String[] args) {

		SubA obj = new SubA();
		// superA의 하위냐? 라고 물어보는 것과 같다.
		if(obj instanceof SuperA)
			System.out.println("SuperA 타입임");
		
		else 
			System.out.println("SuperA 타입이 아님");
		
		if(obj instanceof InterA)
			System.out.println("InterA 타입임");
		
		else 
			System.out.println("InterA 타입이 아님");
		
		if(obj instanceof InterC)
			System.out.println("InterC 타입임");
		
		else 
			System.out.println("InterC 타입이 아님");
		
		if(obj instanceof IA)
			System.out.println("IA 타입임");
		
		else 
			System.out.println("IA 타입이 아님");
	}

}
