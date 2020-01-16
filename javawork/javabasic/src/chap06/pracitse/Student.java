package chap06.pracitse;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public Student(){}
	public Student(String name, int ban, int no, int kor, int eng, int math)
	{
		this.name = name;
		this.ban =ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal()
	{
		return kor+ eng+ math;
	}
	public float getAverage()
	{
		
		return Math.round(getTotal()*10/3.0f)/10.0f;
	}
	public String info()
	{
		return (name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage());
	}
}
