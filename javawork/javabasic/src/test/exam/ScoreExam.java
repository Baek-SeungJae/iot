package test.exam;
public class ScoreExam
{
	public static void main(String[] args)
	{
		int kor, math, eng, total;
		float avg;
		kor = 100;
		math = 95;
		eng = 74;
		total = kor + math + eng;
		avg = (float)total / 3;
		
		System.out.println("���� => " + total);
		System.out.println("��� => " + String.format("%.3f",avg));
	}
}