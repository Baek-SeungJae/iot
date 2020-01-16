package chap07.Inheritance;
/*
 * <<��Ӱ��迡�� ��������� ���� Ư¡>>
 * 1. ��Ӱ��迡���� ����Ŭ������ ���ǵ� ��������� ����Ŭ������������� �� �ִ�.
 * 2. ����Ŭ������ ������ ������ �̸��� ������ ���� Ŭ������ �����ϴ� ��� ����Ŭ������ ��������� �켱������ ����.
 * 3. �θ�Ŭ������ ������ ������ �Ϸ��� super�� �̿��ؼ� �����Ѵ�.
 * 	this -> �ڽ��� ��ü
 * 	super -> �θ�ü
 * 4. ����Ŭ������ private�� ����� ������ ��Ӱ��迡 �ִٰ� �ϴ��� ����Ŭ�������� ������ �� ����.
*/
class Super{
	//private int num = 1000;
	int num = 1000;
}

class Sub extends Super{
	int num =100;
	public void display()
	{
		System.out.println("num=>" +num); //
		System.out.println("super=>" +super.num); //
	}
}

public class InheritanceTest01 {

	public static void main(String[] args) {
		//����Ŭ������ ����Ŭ������ �Ϲ����� ������ �����ϱ� ���ؼ� ����ϴ� Ŭ���� �̹Ƿ�
		//�ַ� ���� Ŭ������ �����ؼ� ����Ѵ�.
		Sub obj = new Sub();
		obj.display();
		System.out.println("main=>"+obj.num);
	}

}
