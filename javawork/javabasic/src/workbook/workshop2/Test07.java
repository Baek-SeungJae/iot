package workbook.workshop2;


public class Test07 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		for(int i=1; i<=100; i++)
		{
			if(i%num==0)
			{
				sum += i;
				if(i!=100)
				{
				System.out.print(i+"+");
				}
				else
				{
					System.out.print(i+"=");
				}
			}
		}
		System.out.println(sum);
	}

}
