package chap05;

public class ArrayExam01 {

	public static void main(String[] args) {
		int[] intArr = new int[10];
		intArr[2]=100;
		intArr[3]=200;
		intArr[5]=300;
		
		for(int i=0; i<intArr.length; i++)
		{
			System.out.println(intArr[i]);
		}

	}

}
