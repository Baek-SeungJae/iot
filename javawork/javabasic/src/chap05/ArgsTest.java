package chap05;

public class ArgsTest {

	public static void main(String[] args) {
		System.out.println("�����Ű����� ->" +(Integer.parseInt(args[0])+Integer.parseInt(args[1]))); //str to int
		System.out.println("�����Ű����� ->" +args[1]);
		
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
		
	}
	
}