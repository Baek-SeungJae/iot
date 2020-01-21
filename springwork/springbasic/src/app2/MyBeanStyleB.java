package app2;

public class MyBeanStyleB extends MyBeanStyle{
	public MyBeanStyleB(String name) {
		super(name);
		super.setName(name);
	}
	public void hello() {
		System.out.println("Hello......."+super.getName());
	}
	
}
