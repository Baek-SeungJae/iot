package chap05;

public class ArrayCopyTest02 {

	public static void main(String[] args) {
		int[] firstArr = new int[5];
		for(int i=0; i<firstArr.length; i++)
		{
			firstArr[i] = 10+i;
		}
		for(int i=0; i<firstArr.length; i++)
		{
			System.out.print(firstArr[i] + "\t");
		}
		System.out.println();
		int[] secondArr = new int [firstArr.length*2];
		//firstArr 배열의 0번부터 firstArr.length개 만큼 secondArr의 0번부터 저장
		//System.arraycopy(firstArr, 0, secondArr, 0, firstArr.length);
		System.arraycopy(firstArr, 3, secondArr, 3, firstArr.length-3);
		for(int i=0; i<secondArr.length; i++)
		{
			System.out.print(secondArr[i] + "\t");
		}
		
	}
		
}
