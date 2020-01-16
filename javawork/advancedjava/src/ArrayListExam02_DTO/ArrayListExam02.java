package ArrayListExam02_DTO;

import java.util.ArrayList;

public class ArrayListExam02 {

	public static void main(String[] args) {
		/* ��ȣ		����		�ڹ�		��		android
		 *  1		�嵿��	97		100		88
		 *  2		�̹�ȣ	100		92		91
		 *  3		���ؿ�	88		96		78
		 */
		
		ArrayList<StudentDTO> stdlist = new ArrayList<StudentDTO>();
		StudentDTO stdto1 = new StudentDTO(1,"�嵿��", 97, 100, 88);
		StudentDTO stdto2 = new StudentDTO(2, "�̹�ȣ", 100, 92, 91);
		StudentDTO stdto3 = new StudentDTO(3, "���ؿ�", 88, 96, 78);
		
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
			System.out.print("��ȣ : "+std.getNum());
			System.out.print("\t\t�̸� : "+std.getName());
			System.out.print("\t\t�ڹ� : "+std.getJava());
			System.out.print("\t\t�� : "+std.getWeb());
			System.out.println("\t\t�ȵ���̵� : "+std.getAndroid());
		}
	}

}
