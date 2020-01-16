package chap07.poly;
/*
 * �������̽� ����
 * << �������̽� >>
 * => �߻�޼ҵ�, ����� �����ϴ� Ư���� Ŭ����
 *  
 *  1. �������̽��� interface Ű���带 �̿��ؼ� �����Ѵ�.
 *  2. public abstract�� ���� �����ϴ�.
 *  	- ����� ������ �ڵ����� �߰��ȴ�.
 *  3. �������̽��� �������̽��� ����� �� �ִ�. (extends �̿�)
 *  	- ���� �������̽��� ���� �������̽��� �߻�޼ҵ带 ��ӹ޴´�.
 *  4. Ŭ������ �������̽��� ����� �� �ִ�. (implements �̿�)
 *  	- �������̽��� ����ϴ� Ŭ������ �̹� �ٸ� Ŭ������ ����ϴ� ��쿡 extends�� ���� �����ϰ� implements�� �����ؾ� �Ѵ�.
 *  5. �������̽��� ���� ���� ����� �� �ִ�. ��, ���߻���� �����ϴ�.
 *  	implements �ڿ� �������̽��� ������ �� ,�� �����Ͽ� ����
 *  6. Ŭ������ �������̽����� ��ӹ޴� ����Ŭ������ ��� Ŭ������ �������̽��� ������ �νĵȴ�. (��ӹ޴� ��� Ŭ����, �������̽��� ���� Ÿ���� �ȴ�.)
 *  7. �������̽��� ����ϴ� ������ ���߻���� ���, �������� ������ �� �ֵ���, �⺻������ �����ؾ� �ϴ� ����� �������� �����ϱ� ���� ����
 *  
 */

interface InterA{
	void test();
	void display(int num0);
}
interface InterB extends InterA{
	int intTest();
}
class SuperA{
}
interface InterC{
}
class SubA extends SuperA implements InterB, InterC{
	public void test() {}
	public void display(int num0) {}
	public int intTest() { return 0;}
}

public class InterfaceTest {

	public static void main(String[] args) {
		SuperA obj1 = new SubA();
		InterA obj2 = new SubA();
		InterB obj3 = new SubA();
		InterC obj4 = new SubA();
	}

}
