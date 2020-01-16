package workbook.workshop3;
public class Test04 {
	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int count=0;
		int sum=0;
		double avg=0.0;
		for(int i=0; i<arr3.length; i++)
		{
			arr3[i] = (int)(Math.random()*10+1);			
		}
		
		for(int i=0; i<arr3.length; i++)
		{
			for(int j=0;j<i;j++) 
			{
				if(arr3[i]==arr3[j])
				{
					arr3[i] = (int)(Math.random()*10+1);
					i--;
				}
			}
		}
		
		for(int i=0; i<arr3.length; i++)
		{
			System.out.print(arr3[i]+" ");
			sum += arr3[i];
		}
		avg = sum / (double)arr3.length;
		System.out.println();
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}
}