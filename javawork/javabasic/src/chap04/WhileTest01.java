package chap04;

public class WhileTest01 {

	public static void main(String[] args) {
		int i=0;
		while(i<5)
		{	
			System.out.println("자바프로그래밍"+(i+1));
			i++;
		}
		
		i=0;
		System.out.println("=======================================");
		while(true)
		{
			
			if(i>=5)
				break;
			System.out.println("자바프로그래밍"+(i+1));
			i++;
			
		}

	}

}
