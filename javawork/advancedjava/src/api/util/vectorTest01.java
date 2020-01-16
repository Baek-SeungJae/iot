package api.util;

import java.util.Vector;

//vector를 
public class vectorTest01 {

	public static void main(String[] args) {
		
		//Vector v = new Vector();
		Vector<Integer> v = new Vector<Integer>();
		
	///	v.add("java");
		v.add(10);
		System.out.println("Vector의 용량: "+ v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size()); // 현재 개수
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println("Vector의 용량: "+ v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size()); // 현재 개수
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println("Vector의 용량: "+ v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size()); // 현재 개수
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println("Vector의 용량: "+ v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size()); // 현재 개수
		for(int i=1; i<=10; i++)
		{
			v.add(i);
		}
		System.out.println("Vector의 용량: "+ v.capacity()); // 총 사이즈
		System.out.println("Vector에 저장된 요소의 갯수: " + v.size()); // 현재 개수
	}
	
}
