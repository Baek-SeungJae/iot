package chap07.Inheritance;
/*
 *		<<��Ӱ��迡�� �����ڰ� ���� Ư¡>>
 *	1. �����ڸ޼ҵ� ù��°�ٿ��� �θ��� ��ü���� �޸𸮿� �ø� �� �ֵ��� �θ��� �����ڸ� ȣ���ϴ� ��ɹ��� �����Ǿ��ִ�.
 *		=> �θ�Ŭ������ �޸𸮿� �Ҵ�Ǿ�� ����� �������Ƿ�...
 *		=> �θ��� �����ڸ� ȣ���ϴ� ����� super(...)
 *		=> super()�� �θ��� �Ű����� ���� �⺻������
 *		=> �̹� �ٸ� �����ڸ� ȣ���ϴ� ��쿡�� super()�� ȣ���� �� ����.
 *			this()�� ȣ���ϴ� ��� super()�� ȣ���� �� ����.
 *	2. ��� Ŭ������ �ֻ���Ŭ������ java.lang.ObjectŬ����
 *		=> �ڹٿ��� ����Ǵ� ��� ��ü�� ���� ������ Ư¡�� ������ Ŭ������ ��ӹް� �ִ� Ŭ������ ���� ��� �����Ϸ��� �ڵ����� ����ϵ��� �Ѵ�.
 *	3. �θ�Ŭ������ ���ǵǾ� �ִ� ��������� ���� �����ؾ� �ϴ� ��쿡�� ����Ŭ�������� ���޵� �� �ֵ��� �����Ѵ�.
 */
class SuperA{ //extends. java.lang.Object�� �����Ǿ��ִ�. 
	String name;
	int age;
	SuperA(){}
	public SuperA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
class SubA extends SuperA{
	String addr;
	int point;
	
	SubA(){
		super();
	}
	
	SubA(String name, int age,String addr){
		super(name,age);
		this.addr = addr;
	}
	
	SubA(String name, int age, String addr, int point){
		// super(); �����Ǿ������ʰ� ����.
		this(name,age,addr);//���� ��ü�� �̹����ǵǾ��ִ� �Ǵٸ� �����ڸ� ȣ��
		this.point = point;
	}
}

public class InheritanceTest03 {
	
	public static void main(String[] args) {
		SubA obj = new SubA("�嵿��",45,"�����",1000);
		System.out.println(obj.name+", "+obj.addr+", "+obj.age+", "+obj.point);

	}

}
