import java.io.*;


/**
 * ATCG
 * Codon -"ATC" 3 nucleotide
 * Nucleotide - A or T or C or G
 * Start Codon - ATG
 * Stop codon - TAA
 */
/*
    Finding Gene
    Find 1st occurrence of Start and stop codon

 */
class GeneFinder{

}
class ReadDNA{
    public String readData() {
        try{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        if(sb.indexOf(".txt")!=-1) {
            sb.append(".txt");
        }
            File file = new File(sb.toString());
            String line = new BufferedReader(new FileReader(file)).readLine();
            return line;
        }catch (Exception e){
            return "DNA Not Found";
        }

    }
}
public class GeneFinding {
    public static void main(String[] args){
        String DNA = new ReadDNA().readData();
        if(!DNA.equals("DNA Not Found")){
            System.out.println(new GeneFinder(DNA));
        }else{
            System.out.println("File not Found!");
        }
    }
}
