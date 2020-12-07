import java.io.*;
import java.net.*;

public class HttpRequest{
	public static void main(String[] args){
		//Set Connection
		HttpURLConnection connection=null;
		try{
		URL github = new URL("https://www.google.com");
		connection = (HttpURLConnection) github.openConnection();
		connection.setRequestMethod("GET");
		//Get Response
		InputStream iStream = connection.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(iStream));
		StringBuilder response = new StringBuilder();
		String line;
		while((line=br.readLine())!=null){
			response.append(line).append("\r");
		}
		br.close();
		System.out.println(line.toString());
		}catch(Exception e){
			System.out.println("URL Error");
		}
		finally{
			if(connection!=null){
				connection.disconnect();
			}
		}
	}
}

