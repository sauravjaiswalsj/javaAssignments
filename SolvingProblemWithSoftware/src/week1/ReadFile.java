package week1;
import java.io.*;

public class ReadFile {
    public String getReadFile()throws IOException{
        StringBuilder sb = new StringBuilder(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if(sb.indexOf(".txt")==-1){
            sb.append(".txt");
        }
        try {
            final File file = new File(sb.toString());
            final BufferedReader br = new BufferedReader(new FileReader(file));
            sb = new StringBuilder("");
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
        }catch(Exception e){
            System.out.println("File Not found");
        }
        return sb.toString();
    }
}
