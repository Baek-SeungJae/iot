package chap06;
//
// - 멤버변수를 정의할 때는 특별한 경우를 제외하고 초기값을 주지 않는다.
// - 초기값을 정의하지 않아도, 참조형은 null, 정수형은 0, 실수형은 0.0으로 초기화된다.
// - 멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다.
// +	public  : 아무데서나 접근할 수 있다. / 데이터에 public이 오는 경우는 없다고 보면 된다.
// 		default : 같은 패키지에서만 접근가능
// #	protected : 같은 패키지에서만 접근가능하나 상속관계에 있다면 접근가능
// -	private : 같은 클래스 안에서만 접근 가능
//  메소드를 통해 접근한다.
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("장동건","서울시",45);
		p1.print();
		
		Person p2 = new Person("김서연","인천시",25);
		p2.print();
		
	}
}
