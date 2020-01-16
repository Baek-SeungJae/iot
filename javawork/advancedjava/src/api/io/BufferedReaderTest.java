package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader br= null;
		try {
			// 1. 파일오픈하기
			br = new BufferedReader(new FileReader("src/api/io/Filetest01.java"));
			// 2. 파일엑세스ㅡ
			int count =0;//실행횟수
			long start = System.nanoTime();
			while (br.ready()) {
				count++;
				String data = br.readLine();
				System.out.println(data);
			}
			long end = System.nanoTime();
			System.out.println("실행횟수=>" +count);
			System.out.println("실행시간=>"+ (end-start));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
