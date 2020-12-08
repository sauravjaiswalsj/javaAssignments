package Week2;
//Read file as a string search for the gene and return the 1st gene
import java.io.*;
import java.util.Locale;

class FindGene{
    public String getGene(String DNA){
       String startCodon = "ATG";
       String stopCodon = "TAA";
       System.out.println(DNA.indexOf(startCodon)+" "+DNA.indexOf(stopCodon)+3);
       return DNA.substring(DNA.indexOf(startCodon),DNA.indexOf(stopCodon)+3);
    }
}

public class FindingGene {
    public static void main(String[] args){
        String DNA = getDNA();
        if(!DNA.equals("File Not Found"))
            System.out.println(new FindGene().getGene(DNA.toUpperCase()));
        else
            System.out.println("File Not Found");
    }
    public static String getDNA(){
        try {
            StringBuilder sb = new StringBuilder(new BufferedReader(new InputStreamReader(System.in)).readLine());
            if(sb.indexOf(".fa")==-1){
                sb.append(".fa");
            }
            File file = new File("./src/Week2/dna/"+sb.toString());
            final BufferedReader br = new BufferedReader( new FileReader(file));
            sb.delete(0,sb.length());
            String line="";
            while((line= br.readLine())!=null){
                sb.append(line);
            }
            return sb.toString();
        }
        catch (Exception e){
            return "File Not Found";
        }
    }
}
