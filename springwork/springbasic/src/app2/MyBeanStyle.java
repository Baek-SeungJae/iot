package app2;

public abstract class  MyBeanStyle {
	private String name;
	MyBeanStyle(String name) {
	}
	abstract void hello();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
