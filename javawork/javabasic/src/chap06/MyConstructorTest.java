package chap06;

public class MyConstructorTest {

	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();
		obj.setName("장동건");
		obj.setId("jang");
		obj.setPass("1234");
		System.out.println(obj.getName()+", "+obj.getId()+", "+obj.getPass());
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		MyConstructor obj2 = new MyConstructor("파이리","3.142","0001");
		System.out.println(obj2.getName()+", "+obj2.getId()+", "+obj2.getPass());
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		MyConstructor obj3 = new MyConstructor("파이리","3.142","0001","꼬부기");
		System.out.println(obj3.getName()+", "+obj3.getId()+", "+obj3.getPass()+", "+obj3.getNickname());
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		MyConstructor obj4 = new MyConstructor("파이리","3.142","0001","꼬부기","역삼동");
		System.out.println(obj4.getName()+", "+obj4.getId()+", "+obj4.getPass()+", "+obj4.getNickname()+", "+obj4.getAddr());
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		MyConstructor obj5 = new MyConstructor("파이리","3.142","0001","꼬부기","역삼동",1000);
		System.out.println(obj5.getName()+", "+obj5.getId()+", "+obj5.getPass()+", "+obj5.getNickname()+", "+obj5.getAddr()+", "+obj5.getPoint());
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

}
