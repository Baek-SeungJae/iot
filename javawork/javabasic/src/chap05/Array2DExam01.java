package chap05;

public class Array2DExam01 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = i*arr.length+j+1;
			}
		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(i==j)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print(arr[i][j]+"\t");
				}
			}
			System.out.println();
		}
	}
}
