package chap06;
public class MyMethod {
	//1. 매개변수가 없고 리턴값이 없는 메소드
	public void display()
	{
		for(int i=0; i<10; i++)
			System.out.print("*");
		System.out.println();
	}
	// 2. 매개변수가 1개이고 리턴값이 없는 메소드
	public void display(String str)
	{
		for(int i=0; i<10; i++)
			System.out.print(str);
		System.out.println();
	}
	
	// 3. 매개변수가 2개이고 리턴값이 없는 메소드
	public void display(String str, int k)
	{
		for(int i=0; i<k;i++)
			System.out.print(str);
		System.out.println();
	}
	
	//4. 매개변수와 리턴값이 모두 있는 메소드
	// => 숫자 2개를 매개변수로 전달받아 더해서 결과를 리턴하는 메소드
	public int add(int num1, int num2)
	{
		return num1+num2;
	}
	
}