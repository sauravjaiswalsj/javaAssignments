import java.io.*;

public class FileRead{
    public FileRead()throws IOException{
       final File file = new File("file.txt");
       final BufferedReader br = new BufferedReader(new java.io.FileReader(file));
       String line;
       while((line=br.readLine())!=null){
           System.out.println(line);
       }

    }
    public static void main(String[] args) throws IOException {
        new FileRead();
    }
}
