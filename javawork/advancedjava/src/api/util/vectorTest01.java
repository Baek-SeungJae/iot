package api.util;

import java.util.Vector;

//vector�� 
public class vectorTest01 {

	public static void main(String[] args) {
		
		//Vector v = new Vector();
		Vector<Integer> v = new Vector<Integer>();
		
	///	v.add("java");
		v.add(10);
		System.out.println("Vector�� �뷮: "+ v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size()); // ���� ����
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println("Vector�� �뷮: "+ v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size()); // ���� ����
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println("Vector�� �뷮: "+ v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size()); // ���� ����
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println("Vector�� �뷮: "+ v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size()); // ���� ����
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println("Vector�� �뷮: "+ v.capacity()); // �� ������
		System.out.println("Vector�� ����� ����� ����: " + v.size()); // ���� ����
	}
	
}
