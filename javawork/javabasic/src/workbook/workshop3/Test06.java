package workbook.workshop3;

public class Test06 {

	public static void main(String[] args) {
		
		
		Student[] s = new Student[3];
		for(int i=0; i<s.length;i++)
			s[i] = new Student();
		
		s[0] = new Student("Kim",100,90,95,89);
		s[1] = new Student("Lee",60,70,99,98);
		s[2] = new Student("Park",68,86,60,40);
		 
		for(int i=0; i<s.length;i++)
			System.out.println(s[i].getName()+" 평균: "+s[i].getAvg()+" 학점: "+s[i].getGrade()+"학점");
	}
}