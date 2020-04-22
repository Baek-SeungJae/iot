package basic;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest02 {

	public static void main(String[] args) {
		BufferedInputStream bis =null;
		FileOutputStream fos=null;
		try {
			URL url = new URL("https://byline.network/wp-content/uploads/2018/05/Dog-original-1-1320x880.jpg");
			bis = new BufferedInputStream(url.openStream());
			fos = new FileOutputStream("C:\\Users\\booruruk\\Desktop\\temp\\img.jpg");
			while(true) {
				int data_byte=bis.read();
				if(data_byte==-1) {
					break;
				}
				fos.write(data_byte);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos!=null)
				try {
					fos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			if(bis!=null)
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
