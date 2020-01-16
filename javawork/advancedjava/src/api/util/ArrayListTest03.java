package api.util;

import java.util.ArrayList;

public class ArrayListTest03 {

	public static void main(String[] args) {
			String[] arr = {"java", "oracle", "jdbc", "html5", "css", "java2"};
			
			ArrayList<String> list = new ArrayList<String>();
			list = changeData(arr);
			int listSize = list.size();
			for(int i=0; i<listSize; i++) 
			{
				System.out.println(list.get(i));
			}
			System.out.println("============================");
			for (String data : list)
				System.out.println(data);
	}	
	
	public static ArrayList<String> changeData(String[] arr)
	{
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<arr.length; i++)
			list.add(arr[i]);
		return list;
	}
}
