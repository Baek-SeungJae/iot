package test.exam;
public class TimeExam
{
	public static void main(String[] args) 
	{
		//time변수에 저장된 값은 초 데이터이다.
		// __시간 __분 ___초의 형태로 출력하기
		int time = 8888; // 2시간 28분 8초
		int hour = time / 3600;
		int minute = (time / 60)%60;
		int second = time % 60;
		System.out.println(hour+"시간 "+minute+"분 "+second+"초");
	}
}
