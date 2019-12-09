package app3;

public abstract class  MyBeanStyle {
	public abstract void hello(String name);
	
	public void myInit() {
		System.out.println("init....");
	}
	public void myDestroy() {
		System.out.println("destory....");
	}
}
