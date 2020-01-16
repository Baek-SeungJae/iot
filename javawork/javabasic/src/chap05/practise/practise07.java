package chap05.practise;

public class practise07 {

	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		int money = Integer.parseInt(args[0]);
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5,5,5,5};
		
		for(int i=0; i<coinUnit.length; i++)
		{
			int coinNum=0;
			coinNum=money/coinUnit[i];
			if(coinNum<=5)
			{
				money = money - coinUnit[i]*coinNum;
				coin[i]=coin[i]-coinNum;
			}
			else
			{
				money = money - coinUnit[i]*coin[i];
				coin[i]=0;
				coinNum=5;
			}
			System.out.println(coinUnit[i]+"��: "+coinNum);
		}
		if(money >0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);
		}
		System.out.println("= ���� ������ ���� =");
		for(int i=0; i<coinUnit.length;i++)
		{
			System.out.println(coinUnit[i]+"��: "+coin[i]);
		}
		
		
	}

}
