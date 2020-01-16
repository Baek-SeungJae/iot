package chap05;

public class Array2DTest03 {

	public static void main(String[] args) {
		int[][] myarr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
				}; // int[][] myarr = new int[3][5]
		
		int[][] myarr2 ={ 
			{1,2,3},
			{6,7,8,9},
			{11,12,13,14,15}
			};
		
		for(int i=0; i<myarr.length; i++)
		{
			for(int j=0; j<myarr[i].length; j++)
			{
				System.out.print(myarr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<myarr2.length; i++)
		{
			for(int j=0; j<myarr2[i].length; j++)
			{
				System.out.print(myarr2[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
