package test.exam;
public class TimeExam
{
	public static void main(String[] args) 
	{
		//time������ ����� ���� �� �������̴�.
		// __�ð� __�� ___���� ���·� ����ϱ�
		int time = 8888; // 2�ð� 28�� 8��
		int hour = time / 3600;
		int minute = (time / 60)%60;
		int second = time % 60;
		System.out.println(hour+"�ð� "+minute+"�� "+second+"��");
	}
}
