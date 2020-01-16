package test.exam;
//타입 캐스팅 테스트
public class TypeCastingTest
{
	public static void main(String[] args) 
	{
		//기본형에서 형변환
		//- 자동형변환(큰 데이터타입의 변수 = 작은 데이터타입 변수
		byte b1= 10;
		short s = b1;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println(d);

		char c = 'a';
		System.out.println(c);
		//A의 ascii값을 사용하고 싶은 경우
		int data = c; // int = char : 자동형변환
		System.out.println(data);
		
		//명시적 형변환
		//기본형에서 명시적 형변환
		byte bytedata = (byte)200;
		System.out.println(bytedata);

		//int data를 char로 변환하는 경우
		int intdata = 112;
		char chardata = (char)intdata;
		System.out.println(chardata);
		System.out.println((char)115);

		double doubledata = (double)20/100*100;
		System.out.println(doubledata);
	}
}