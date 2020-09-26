import java.io.*;  
class ReadFile{
    public ReadFile(){
        try {
            File file = new File("file.txt");
            BufferedReader br = new BufferedReader(new java.io.FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("File not found");
        }
    }
}
public class filesRead{
    public static void main(String[] args) {
        new ReadFile();
    }
}
