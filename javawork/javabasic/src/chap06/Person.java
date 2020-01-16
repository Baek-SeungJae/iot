package chap06;

public class Person {

	private String _name; // �̸�
	private String _address; // �ּ�
	private int _age; // ����
	// Ŭ������ Ư���� ��Ÿ���� ������ - ������� or �ʵ�(API���� ���� ���)
	// ��� ��������� private���� ����Ǿ� �ֱ� ������ ���� �����ϴ� �޼ҵ�� ���� ������ �� �ִ� �޼ҵ尡 �ʿ��ϴ�.
	// �̷� ������ �ϴ� �޼ҵ带 �����ϴ� ���
	
	
	// name������ ���� �����ϴ� �޼ҵ�
	// �޼ҵ�� : set + ���������(ù���ڸ� �빮�ڷ� �ٲ�)
	
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
		System.out.println("���� : "+_name);
		System.out.println("�ּ� : "+_address);
		System.out.println("���� : "+_age);
	}

	@Override
	public String toString() {
		return "Person [name=" + _name + ", address=" + _address + ", age=" + _age + "]";
	}
	
}
