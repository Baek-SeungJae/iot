package ArrayListExam02_DTO;

import java.util.ArrayList;

public class ArrayListExam02 {

	public static void main(String[] args) {
		/* 번호		성명		자바		웹		android
		 *  1		장동건	97		100		88
		 *  2		이민호	100		92		91
		 *  3		류준열	88		96		78
		 */
		
		ArrayList<StudentDTO> stdlist = new ArrayList<StudentDTO>();
		StudentDTO stdto1 = new StudentDTO(1,"장동건", 97, 100, 88);
		StudentDTO stdto2 = new StudentDTO(2, "이민호", 100, 92, 91);
		StudentDTO stdto3 = new StudentDTO(3, "류준열", 88, 96, 78);
		
		stdlist.add(stdto1);
		stdlist.add(stdto2);
		stdlist.add(stdto3);
		
		display(stdlist);
	}
	
	
	public static void display(ArrayList<StudentDTO> arr) {
		int ArrayListSize = arr.size();
		for(int i=0; i<ArrayListSize; i++)
		{
			StudentDTO std = arr.get(i);
			System.out.print("번호 : "+std.getNum());
			System.out.print("\t\t이름 : "+std.getName());
			System.out.print("\t\t자바 : "+std.getJava());
			System.out.print("\t\t웹 : "+std.getWeb());
			System.out.println("\t\t안드로이드 : "+std.getAndroid());
		}
	}

}
