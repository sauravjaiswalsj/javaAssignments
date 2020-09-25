import java.io.*;

public class FileReader {
    public FileReader()throws IOException{
       final File file = new File("file.txt");
       final BufferedReader br = new BufferedReader(new java.io.FileReader(file));
       String line;
       while((line=br.readLine())!=null){
           System.out.println(line);
       }
    }
    public static void main(String[] args){
        FileReader fr = new FileReader();
    }
}
