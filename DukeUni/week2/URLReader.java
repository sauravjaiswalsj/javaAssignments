import java.util.*;
import java.net.*;
import java.io.*;
class GetLines{
    public GetLines() {
        try {
            //http://www.dukelearntoprogram.com/course2/data/manylinks.html
            URL web = new URL("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
            BufferedReader line=new BufferedReader(new InputStreamReader(web.openStream()));
            String input;
            while((input=line.readLine())!=null){
                System.out.println(input);
                line.close();
            }
        }
        catch (Exception e){
            System.out.println("URL not found");
        }
    }
}
public class URLReader{
    public static void main(String[] args){
        GetLines g=new GetLines();
    }
}