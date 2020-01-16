package chap05;

public class Array2DTest02 {

	public static void main(String[] args) {
		int[][] myarr = new int[3][];
		myarr[0] = new int[3];
		myarr[1] = new int[2];
		myarr[2] = new int[1];

		for(int i=0; i<myarr.length;i++)
		{
			for(int j=0; j<myarr[i].length;j++)
			{
				System.out.print(myarr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
