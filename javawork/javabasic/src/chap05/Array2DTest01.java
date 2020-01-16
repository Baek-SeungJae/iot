package chap05;

public class Array2DTest01 {

	public static void main(String[] args) {
		int[][] myarr = new int[2][3];
		myarr[0][0]=100;
		myarr[1][1]=200;
		
		System.out.println("myarr의 2번째 요소가 참조하는 배열의 0번 요소의 값:"+myarr[1][0]);
		System.out.println("myarr의 1번째 요소가 참조하는 배열의 0번 요소의 값:"+myarr[0][0]);
		
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
