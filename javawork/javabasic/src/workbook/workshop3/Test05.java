package workbook.workshop3;

public class Test05 {

	public static void main(String[] args) {
		Calc c = new Calc();
		int sum = c.calcSum(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]));
		double avg = sum / (double)args.length;
		char grade;
		if(avg<=100&avg>=90)
			grade ='A';
		else if(avg>=70)
			grade = 'B';
		else if(avg>=50)
			grade = 'C';
		else if(avg>=30)
			grade = 'D';
		else
			grade = 'C';
		
		System.out.println("Sum:"+sum);
		System.out.println("Avg:"+avg);
		System.out.println(grade+"ÇÐÁ¡");
	}
}
