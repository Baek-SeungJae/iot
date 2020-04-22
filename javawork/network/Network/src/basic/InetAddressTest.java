package basic;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		try {
			// InetAddress ia = InetAddress.getByName(args[0]);
			InetAddress ia = InetAddress.getByName("www.naver.com");
			System.out.println(ia.getHostName());
			System.out.println(ia.getHostAddress());
			System.out.println(InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println();
	
		try {
			// InetAddress[] ialist = InetAddress.getAllByName(args[0]);
			InetAddress[] ialist = InetAddress.getAllByName("www.naver.com");
			for (int i = 0; i < ialist.length; i++) {
				System.out.println(ialist[i].getHostName());
				System.out.println(ialist[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
