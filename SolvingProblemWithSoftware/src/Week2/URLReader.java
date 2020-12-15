package Week2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
    public static void main(String[] args)throws IOException{
        final URL url = new URL("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        URLConnection conn = url.openConnection();
        final BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while((line=br.readLine())!=null){
            sb.append(line).append("\n");
        }
        System.out.println(sb.toString());
    }
}