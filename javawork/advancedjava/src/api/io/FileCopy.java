package api.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw= null;
		try {
			fr = new FileReader("src/api/io/FileTest01.java");
			try {
				fw= new FileWriter("src/data/copy_result.txt");
				
				while(true) {
					int data = fr.read();
					if(data==-1)
						break;
					fw.write((char)data);
					System.out.print((char)data);
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr!=null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(fr!=null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
