package chap08;
//���ܹ߻� �ڵ尡 ���ǵ� Ŭ����
public class ExceptionTest03 {
	public static void main(String[] args) {
		try {
			System.out.println("************���α׷�����************");
			System.out.println(10/0);
			System.out.println("************���α׷�����************");
		}
		catch (ArithmeticException e)
		{
			System.out.println("�����߻�...");
			System.out.println("���ܸ޽���: "+e.getMessage());
			e.printStackTrace();
		}
	}

}
