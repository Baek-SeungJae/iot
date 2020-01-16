package chap08;
import java.util.InputMismatchException;
import java.util.Scanner;

/* ����ڰ� �Է��ϴ� ���� ���� ���ܰ� �ٸ��� �߻�
 * 1. ����ڰ� ����� ���� �Է� : ���ܰ� �߻����� �����Ƿ� catch���� ������� �ʴ´�.
 * 2. ����ڰ� ���� ���ڿ� 0�� �Է��ϸ� ArithmeticException�� �߻�
 * 		=> Exception e = new ArithmeticException();
 * 			---------		---------------------
 * 			������ü				������ü
 * 
 * 3. ����ڰ� ���ڰ� �ƴ϶� ���ڸ� �Է�
 * 		=> InputMismatchException�߻�
 * 		=> Exception e = new InputMismatchException();
 * 4. �پ��� Exception�� ó���� ���ؼ� catch���� ���� �� �����ϰ� ����� �� �ִ�.
 * 		=> ���� Ÿ�Կ� ���ϴ� Exception�� ���� ���߿� �����ؾ� �Ѵ�.
 * 5. 
 */
//���ܹ߻� �ڵ尡 ���ǵ� Ŭ����
public class ExceptionTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {		
			System.out.println("start");
			System.out.println("���ڸ� �Է��ϼ���");
			int num1 = key .nextInt();
			System.out.println("���� ���ڸ� �Է��ϼ���");
			int num2 = key.nextInt();
			System.out.println("���: "+num1/num2);
		} catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��� �� �����ϴ�.");
		} catch(ArithmeticException e) {
			System.out.println("���� ������ 0�� �Է��� �� �����ϴ�.");
		} catch(Exception e) {
			System.out.println("���ܹ߻�");
			System.out.println("���ܸ޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
