package maven.org.MyMavenProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ConnectUrl {
	private void getConnectionURL(){
		BufferedReader reader = null;
		try {
			URL url = new URL("http://www.baidu.com");
			URLConnection conn = url.openConnection();
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String tmp = "";
			while ((tmp = reader.readLine()) != null) {
				System.out.println(tmp);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	}
	
	public static void main(String[] args) {
		ConnectUrl url = new ConnectUrl();
		url.getConnectionURL();
	}

}
