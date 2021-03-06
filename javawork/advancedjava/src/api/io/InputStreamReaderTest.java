package api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		PrintStream out = System.out;
		while (true) {
			// 1. stream의 데이터를 1byte 읽기
			try {
				int data = in.read();
				if (data == 13)
					break;
				out.print((char) data);
			} catch (IOException e) {
			}
		}
	}
}
