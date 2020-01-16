package chap06;

import workbook.workshop3.Student;

public class MethodTest {

	public static void main(String[] args) {
		Person p = new Person("장동건","서울",45);
		display(p.getName(),p.getAddress(),p.getAge());
		display(p);
		
		
	}
	
	public static void display(String name, String addr, int age)
	{
		System.out.println(name+", "+addr+", "+age);
	}
	public static void display(Person p)
	{
		System.out.println(p.toString());
	}
	//메소드를 정의할 때 한 개의 값만 리턴할 수 있는데 만약 동일한 타입의 데이터를 여러개 리턴해야 한다면 배열을 리턴타입으로 정의하고 사용할 수 있다. 
	public static int[] getScore()
	{
		int[] arr = new int[3];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		return arr;
	}
	//타입이 다른 여러개의 데이터를 리턴하고 싶은 경우
	//배열로 리턴할 수 없으므로 리턴하고 싶은 값을 갖고있는 객체를 생성해서 리턴할 수 있다.
	public static Student getInfo()
	{
		return new Student("장동건",90,100,50,78);
	}
}
