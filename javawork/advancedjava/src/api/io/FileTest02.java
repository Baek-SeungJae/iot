package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest02 {

	public static void main(String[] args) {
		// C:/Users/booruruk/Desktop/iot/iotest
		// 출력형태
		// a--------------[폴더]
		// b--------------[폴더]
		// ArrayTest01.java------------[파일:(파일의 사이즈)]
		// .
		// .
		// .
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		File file1 = new File("C:/Users/booruruk/Desktop/iot/iotest");

		for (File data : file1.listFiles()) {
			if (data.isDirectory()) {
				System.out.println(data.getName() + "...................[폴더]" + sdf.format(data.lastModified()));
			} else {
				System.out.println(data.getName() + "...............[파일: " + data.length() + "byte]  " + sdf.format(data.lastModified()));
			}
		}

	}

}
