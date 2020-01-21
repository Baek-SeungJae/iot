package app2;

public class MyBeanStyleA extends MyBeanStyle{
	public MyBeanStyleA(String name) {
		super(name);
		super.setName(name);
	}
	public void hello() {
		System.out.println("æ»≥Á«œººø‰......."+super.getName());
	}
	
}
