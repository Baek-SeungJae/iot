package chap04;
//if���� ��ø�ؼ� ����ϴ� ���� - gender�� age�� �Ǵ��ؼ� ����� ���
import java.util.Scanner;
//Ctrl+Shift+F => �ڵ带 ����
//������ ���̸� �Է¹޾Ƽ� ������ ���� ����ϱ�
//�Է°� 1,3�� ���� 2,4�� ����
//���� 1~19 : û�ҳ�
//	20 : ����
public class IfExam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���(1,3:����, 2,4:����) : ");
		int gender = scan.nextInt();

		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();

		if (gender == 1 | gender == 3) {
			if (age < 20) {
				System.out.println("û�ҳ� ����");
			} else {
				System.out.println("���� ����");
			}
		}
		if (gender == 2 | gender == 4) {
			if (age < 20) {
				System.out.println("û�ҳ� ����");
			} else {
				System.out.println("���� ����");
			}
		}
	}
}
