package chap05;

import java.util.Random;

// �迭�� ����, ����, �ʱ�ȭ�� �Ѳ����� ó���ϴ� ���
public class ArrayTest04 {

	public static void main(String[] args) {
		
		//�ٸ� ���� ������ ������� �����ϱ� - ,�� �����ؼ� �迭 ��Ҹ� �����Ѵ�.
		int[] myarr = {10, 20, 30, 40, 50};
		
		System.out.println("�迭�� ����� ���� : "+myarr.length);
		for(int i=0; i<myarr.length; i++)
		{
			System.out.println(myarr[i]);
		}
		
		// �ڹ� ��� ��� ����, ����, �ʱ�ȭ
		int[] myarr2 = new int[] {10, 20, 30, 40, 50};
		System.out.println("�迭�� ����� ���� : "+myarr.length);
		for(int i=0; i<myarr2.length; i++)
		{
			System.out.println(myarr2[i]);
		}
		
		//������ �迭�� ����� ������ �ʱ�ȭ�� �Ѳ�����
		
		String[] strArr = {new String("abc"), new String("kkk"), new String("oh")};
		
		System.out.println("�������迭�� ���� : "+strArr.length);
		//������ �迭�̱� ������ ��ü�� �Ҵ�� ���� �ּҰ��� ��µǾ�� �ϳ� String�� ����
		//String Ŭ������ �⺻��ó�� ����� �� �ִ�. - ���� ���� ���̴� �������̹Ƿ� ���
		for(int i=0; i<strArr.length; i++)
		{
			System.out.println(strArr[i]);
		}
		String[] strArr2 = {"top","jg","mid","adc","spt"};
		for(int i=0; i<strArr2.length; i++)
		{
			System.out.println(strArr2[i]);
		}
		
		Random[] randArr = {new Random(), new Random(), new Random()};
		for(int i=0; i<randArr.length;i++)
		{
			System.out.println("�迭 ��� => " + randArr[i]);
		}
		
		
	}

}
