package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class MyNetClient4 {
	public static void main(String[] args) {

		// 서버와 통신할 수 있는 소켓 객체를 생성
		String result = "";
		BufferedReader reader = null;
		try {

			URL url = new URL("http://70.12.224.117:8088/DBServer/member/selectAll.do");
			HttpURLConnection con = new HttpURLConnection(url) {

				@Override
				public void connect() throws IOException {
					// TODO Auto-generated method stub

				}

				@Override
				public boolean usingProxy() {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public void disconnect() {
					// TODO Auto-generated method stub

				}
			};
			con.connect();
			System.out.println("성공");
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String line = null;
			while ((line = reader.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {

		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
			}
		}
		System.out.println(result);
	}
}
