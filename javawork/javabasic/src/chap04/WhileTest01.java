package chap04;

public class WhileTest01 {

	public static void main(String[] args) {
		int i=0;
		while(i<5)
		{	
			System.out.println("�ڹ����α׷���"+(i+1));
			i++;
		}
		
		i=0;
		System.out.println("=======================================");
		while(true)
		{
			
			if(i>=5)
				break;
			System.out.println("�ڹ����α׷���"+(i+1));
			i++;
			
		}

	}

}
