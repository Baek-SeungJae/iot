package chap07.poly;
/*
 *  ��ü�� Ÿ���� �˻��ϰ� �۾��� �� �ִ�.
 *  instanceof�����ڸ� �̿�
 */

class AA{
	
}
interface IA{
	
}
public class InstanceOfTest {
	public static void main(String[] args) {

		SubA obj = new SubA();
		// superA�� ������? ��� ����� �Ͱ� ����.
		if(obj instanceof SuperA)
			System.out.println("SuperA Ÿ����");
		
		else 
			System.out.println("SuperA Ÿ���� �ƴ�");
		
		if(obj instanceof InterA)
			System.out.println("InterA Ÿ����");
		
		else 
			System.out.println("InterA Ÿ���� �ƴ�");
		
		if(obj instanceof InterC)
			System.out.println("InterC Ÿ����");
		
		else 
			System.out.println("InterC Ÿ���� �ƴ�");
		
		if(obj instanceof IA)
			System.out.println("IA Ÿ����");
		
		else 
			System.out.println("IA Ÿ���� �ƴ�");
	}

}
