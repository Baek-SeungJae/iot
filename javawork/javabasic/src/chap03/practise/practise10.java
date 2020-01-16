package chap03.practise;

public class practise10 {

	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (65<=ch&90>=ch) ? (char)(ch+32) : ch;
		System.out.println("ch : "+ch);
		System.out.println("ch to lowerCase : "+lowerCase);

	}

}
