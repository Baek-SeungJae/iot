package chap07.Inheritance;

public class Student extends Person{
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {}
	public Student(String name, int age, int korean, int english, int math, int science) {
		super(name, age);
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
		public double getAvg() 
	{
		return (this.korean+this.english+this.math+this.science)/4.0;
	}
	public String getGrade() 
	{
		if(getAvg()<=100&getAvg()>=90)
			return "A";
		else if(getAvg()>=70)
			return "B";
		else if(getAvg()>=50)
			return "C";
		else if(getAvg()>=30)
			return "D";
		else
			return "F";
	}
	public void print()
	{
		super.print();
		System.out.println(" Æò±Õ: "+getAvg()+" ÇÐÁ¡: "+getGrade());
	}
}