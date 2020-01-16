package chap06;

public class Person {

	private String _name; // 이름
	private String _address; // 주소
	private int _age; // 나이
	// 클래스의 특성을 나타내는 데이터 - 멤버변수 or 필드(API에서 쓰는 용어)
	// 모든 멤버변수는 private으로 선언되어 있기 때문에 값을 설정하는 메소드와 값을 가져올 수 있는 메소드가 필요하다.
	// 이런 역할을 하는 메소드를 정의하는 경우
	
	
	// name변수에 값을 설정하는 메소드
	// 메소드명 : set + 멤버변수명(첫글자를 대문자로 바꾼)
	
	public Person(){}
	
	public Person(String name, String address, int age){
		_name = name;
		_address= address;
		_age = age;
	}
	
	
	public void setName(String name) 
	{
		_name=name;
	}
	public void setAddress(String address) 
	{
		_address = address;
	}
	public void setAge(int age) 
	{
		_age = age;
	}
	public String getName() 
	{
		return _name;
	}
	public String getAddress() 
	{
		return _address;
	}
	public int getAge() 
	{
		return _age;
	}
	
	void print() {
		System.out.println("성명 : "+_name);
		System.out.println("주소 : "+_address);
		System.out.println("나이 : "+_age);
	}

	@Override
	public String toString() {
		return "Person [name=" + _name + ", address=" + _address + ", age=" + _age + "]";
	}
	
}
