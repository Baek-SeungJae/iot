package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader br= null;
		try {
			// 1. ���Ͽ����ϱ�
			br = new BufferedReader(new FileReader("src/api/io/Filetest01.java"));
			// 2. ���Ͽ�������
			int count =0;//����Ƚ��
			long start = System.nanoTime();
			while (br.ready()) {
				count++;
				String data = br.readLine();
				System.out.println(data);
			}
			long end = System.nanoTime();
			System.out.println("����Ƚ��=>" +count);
			System.out.println("����ð�=>"+ (end-start));

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
