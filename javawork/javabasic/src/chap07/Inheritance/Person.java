package chap07.Inheritance;

public class Person {
	String name;
	int age;
	Person(){}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.print("성명 :"+getName()+" 나이: "+getAge());
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

}
