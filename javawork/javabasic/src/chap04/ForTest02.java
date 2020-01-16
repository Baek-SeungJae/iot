package chap04;
//for문 중첩하기
public class ForTest02 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++) 
		{
			for(int j=0; j<5; j++)
			{
				if(i==2 & j==2)
				{
					System.out.print("너");
				}
				else
				System.out.print("2");
			}
			System.out.println();
		}
	}
}
