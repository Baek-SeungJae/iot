package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoreTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("src/data/score.txt"));
				int sum=0;
				int count=0;
				while(br.ready()) {
					String str = br.readLine();
					count++;
					sum=sum+Integer.parseInt(str.split(",")[1]);
					System.out.println(str.split(",")[0]+"�� ������ "+str.split(",")[1]+"��");
				}
			 System.out.println("����: "+sum);
			 System.out.println("���: "+(sum/(double)count));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(br!=null)
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
