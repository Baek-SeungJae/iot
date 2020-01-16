package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fs = null;
		try {
			// 1. ���Ͽ����ϱ�

			fs = new FileReader("src/api/io/Filetest01.java");
			int count =0;//����Ƚ��
			long start = System.nanoTime();
			// 2. ���Ͽ�������
			while (true) {
				int data = fs.read();
				count++;
				if (data == -1)
					break;
				System.out.print((char) data);
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
				if (fs != null)
					fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
