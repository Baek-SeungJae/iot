package workbook.workshop4;

public class Test04 {

	public static void main(String[] args) {
		if(args.length>2 | args.length<2)
			System.out.println("다시 입력 하세요");
		else 
		{
		System.out.println(args[0]+" "+args[0]);
		System.out.println(args[1]+" "+args[1]);
		}
		double sum = Double.parseDouble(args[0])+Double.parseDouble(args[0])+Double.parseDouble(args[1])+Double.parseDouble(args[1]);
		double avg = sum / 4.0;
		System.out.println();
		System.out.println("sum=" + sum);
		System.out.println("avg=" + avg);
		
		
	}

}