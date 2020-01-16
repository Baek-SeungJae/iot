package chap03.practise;

public class practise09 {
	//48~57, 65~90, 97~122
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = (48<=ch&57>=ch)?true:(65<=ch&90>=ch)?true:(97<=ch&122>=ch)?true:false ;
		System.out.println(b);

	}

}
