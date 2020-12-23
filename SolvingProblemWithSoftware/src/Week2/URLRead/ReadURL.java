package Week2.URLRead;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
public class ReadURL {
    public static void main(String[] args)throws IOException{
        final URL url = new URL("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        //Open a url using java
        //java.awt.Desktop.getDesktop().browse(java.net.URI.create(String.valueOf(url)));
        final BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while((line=br.readLine())!=null){
            sb.append(line).append("\n");
        }
        br.close();
        System.out.println(sb.toString());
    }
}
