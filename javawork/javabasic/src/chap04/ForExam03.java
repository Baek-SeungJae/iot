package chap04;

public class ForExam03 {

	public static void main(String[] args) {
		int total_sum = 0;
		int odd_sum = 0;
		int even_sum = 0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				even_sum+=i;
			}
			else
			{
				odd_sum+=i;
			}
			total_sum += i;
		}
		
		System.out.println("�� : "+total_sum);
		System.out.println("Ȧ���� : "+odd_sum);
		System.out.println("¦���� : "+even_sum);
		
	}

}