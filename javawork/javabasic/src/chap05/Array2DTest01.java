package chap05;

public class Array2DTest01 {

	public static void main(String[] args) {
		int[][] myarr = new int[2][3];
		myarr[0][0]=100;
		myarr[1][1]=200;
		
		System.out.println("myarr�� 2��° ��Ұ� �����ϴ� �迭�� 0�� ����� ��:"+myarr[1][0]);
		System.out.println("myarr�� 1��° ��Ұ� �����ϴ� �迭�� 0�� ����� ��:"+myarr[0][0]);
		
		for(int i=0; i<2;i++)
		{
			for(int j=0; j<3;j++)
			{
				System.out.print(myarr[i][j]+ " ");
			}
			System.out.println();
		}


	}

}
