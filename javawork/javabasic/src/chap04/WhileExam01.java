package chap04;

public class WhileExam01 {

	public static void main(String[] args) {
		
		int total_sum=0;
		int odd_sum=0;
		int even_sum=0;
		int count=0;
		
		while(true)
		{
			if(count>100)
				break;
			
				total_sum+=count;
			if(count%2==0)
			{
				even_sum+=count;
			}
			else
			{
				odd_sum+=count;
			}
			count++;
			
			
		}
		
		System.out.println("Че : "+total_sum);
		System.out.println("ШІМіЧе : "+odd_sum);
		System.out.println("ТІМіЧе : "+even_sum);

	}

}
