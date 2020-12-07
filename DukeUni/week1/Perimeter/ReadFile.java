package Perimeter;
import java.io.*;

public class ReadFile{
    public String getReadFile() throws IOException {
       StringBuilder sb = new StringBuilder(new BufferedReader(new InputStreamReader(System.in)).readLine());
       if(sb.indexOf(".txt")==-1){
           sb.append(".txt");
        }
        try {
            final File file = new File(sb.toString());
            final BufferedReader br = new BufferedReader(new FileReader(file));
            sb=new StringBuilder("");
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
            //System.out.println(sb.toString());
        }catch (Exception e){
            System.out.println("404! File Not Found");
        }
        return sb.toString();
    }
}
