package chap06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class APIConstructorTest {

	public static void main(String[] args) throws IOException {
		byte[] data1 = {65,66,67,68,69};
		char[] data2 = {'a','b','c','d','e'};
		String str = new String();
		String str1 = new String("java");
		String str2 = new String(data1);
		String str3 = new String(data1,2,2);
		
		String str4 = new String(data2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		File f = new File("test.txt");
		System.out.println(f.getName());
		
		FileInputStream fs = new FileInputStream("test.txt");
		System.out.println(fs.read());
	}

}
