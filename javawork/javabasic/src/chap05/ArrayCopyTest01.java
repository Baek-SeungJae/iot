package chap05;

public class ArrayCopyTest01 {

	public static void main(String[] args) {
		int[] firstArr = new int[5];
		// 배열의 값을 할당하기 위한 for문
		for(int i=0; i<firstArr.length; i++)
		{
			firstArr[i] = 10+i; 
		}
		// 배열을 출력하기 위한 for문
		for(int i=0; i<firstArr.length; i++)
		{
			System.out.print(firstArr[i]+"\t");
		}
		System.out.println();
		
		int[] secondArr = new int[firstArr.length*3];
		
		for(int i=0; i<firstArr.length; i++)
		{
			secondArr[i] = firstArr[i];
		}
		
		for(int i=0; i<secondArr.length; i++)
		{
			System.out.print(secondArr[i] + "\t");
		}
	}

}
