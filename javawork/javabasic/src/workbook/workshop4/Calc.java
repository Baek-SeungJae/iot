package workbook.workshop4;

public class Calc {
	public int calculate(int data)
	{
		int sum =0;
		System.out.print("¦��: ");
		for(int i=1; i<=data; i++)
		{
			if(i%2==0)
			{	
				System.out.print(i+" ");
				sum +=i;
			}
		}
		System.out.print("\n���: ");
		return sum;
	}
}
