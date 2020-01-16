package workbook.workshop2;

public class Test06 {

	public static void main(String[] args) {
		for(int k=0;k<3;k++)
		{
			for(int i=1;i<=3;i++)
			{
				for(int j=2+k*3;j<5+k*3;j++)
				{
					System.out.print(j+"*"+i+"="+i*j+"\t");
					if(j==9)
						break;
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
