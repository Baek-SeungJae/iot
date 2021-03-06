package api.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		//File 출력은 매개변수로 전달된 파일이 있으면 파일을 열고 작업하고, 없으면 파일을 새로 만든다.
		FileWriter fw=null;
		try {
			fw = new FileWriter("src/data/output.txt",true);
			fw.write(97);
			fw.write("\n문자열쓰기");
			fw.write("\ntest");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
