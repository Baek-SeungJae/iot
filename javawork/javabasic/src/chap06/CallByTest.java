package chap06;

public class CallByTest {

	public static void main(String[] args) {
		CallByTest obj = new CallByTest();
		int i = 100;
		int[] myarr = new int[5];
		for(int j=0; j<myarr.length; j++)
			myarr[j]=100;

		System.out.println("============������===========");
		obj.display(i,myarr);
		obj.change(i, myarr);
		System.out.println("======changeȣ����===========");
		obj.display(i, myarr);
		
	}
	public void display(int num, int[] myarr)
	{
		System.out.println("i="+num);
		System.out.println("myarr�� ��� ��");
		for(int j=0; j<myarr.length; j++)
			System.out.print(myarr[j]+"\t");
		System.out.println();
	}
	//�Ű������� ���� �� i�� my myarr�� �����ϴ� �迭�� ��� ���� �����ϴ� �޼ҵ�
	public void change(int num, int[] myarr)
	{
		num=200;
		myarr[1]=200;
	}
}
