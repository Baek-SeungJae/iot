package chap07;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	public Teacher() {}
	
	
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

	public void print()
	{
		System.out.println("성명 :"+getName()+" 나이: "+getAge()+" 과목: "+getSubject());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
