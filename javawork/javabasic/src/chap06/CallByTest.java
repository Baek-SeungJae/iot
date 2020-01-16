package chap06;

public class CallByTest {

	public static void main(String[] args) {
		CallByTest obj = new CallByTest();
		int i = 100;
		int[] myarr = new int[5];
		for(int j=0; j<myarr.length; j++)
			myarr[j]=100;

		System.out.println("============변경전===========");
		obj.display(i,myarr);
		obj.change(i, myarr);
		System.out.println("======change호출후===========");
		obj.display(i, myarr);
		
	}
	public void display(int num, int[] myarr)
	{
		System.out.println("i="+num);
		System.out.println("myarr의 요소 값");
		for(int j=0; j<myarr.length; j++)
			System.out.print(myarr[j]+"\t");
		System.out.println();
	}
	//매개변수로 전달 된 i와 my myarr가 참조하는 배열의 요소 값을 변경하는 메소드
	public void change(int num, int[] myarr)
	{
		num=200;
		myarr[1]=200;
	}
}
