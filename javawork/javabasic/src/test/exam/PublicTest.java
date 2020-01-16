package test.exam;
// 기본으로 인식하는 패키지의 위치는 java.lang패키지와 현재 작업패키지
// -> 다른 패키지에 있는 클래스를 사용하는 경우 API나 낵가 작성한 클래스나 모두 import 해야함
import chap06.Person;

public class PublicTest {

	public static void main(String[] args) {
		Person p1 = new Person();
	//	p1._name = "ASD";
	//	p1._addr = "서울시"; //default이므로 외부패키지에서 접근 불가능하다.
	//	p1._age = 45; // private이므로 외부 패키지, 외부 클래스 모두 접근할 수 없다.
	}

}
