package chap04;
//��øif�� - if�� �ȿ� if�� �����ϰ� ����ϱ�(��� ����� ��ø�� �� �ִ�.)
import java.util.Scanner;

public class IfTest03 
{

	public static void main(String[] args) 
	{
		//Scanner�� ������ �Է� �޾� 90�� �̻��̸� "���"�� ����ϰ�
		//90�̸��̸� "�����"�� ����ϼ���
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = scan.nextInt();
		
		System.out.print("���� Ƚ��: ");
		int count = scan.nextInt();
		if(score>=90)
		{
			System.out.println("���");
		}
		else
		{
			if(count>=3)
			{
				System.out.println("ó������ �ٽ� ����...");
			}
			else
			{
				System.out.println("�� ���� �����...");
			}	
		}	
	}
}
