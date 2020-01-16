package chap05.practise;

public class practise10 {

	public static void main(String[] args) {
		char[] abcCode = {'`','~','!','@','#','$','%','^','&','*','(',
				')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abc123";
		String result = "";
		
		for(int i=0; i< src.length();i++)
		{
			char ch = src.charAt(i);
			if(ch>='a'&ch<='z')
			{
				result+=Character.toString(abcCode[(int)ch-97]);
			}
			else if(ch>='0'&ch<='9')
			{
				result+=Character.toString(numCode[(int)ch-48]);
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}

}
