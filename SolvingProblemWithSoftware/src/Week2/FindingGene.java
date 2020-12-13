package Week2;
//Read file as a string search for the gene and return the 1st gene
import java.io.*;
import java.util.Locale;

class FindGene{
    public String getGene(String DNA){
       int startCodon = DNA.indexOf("ATG");
       int stopCodon = DNA.indexOf("TAA",startCodon+3);
       // This index of looks from the start of the string and the The reason it failed the test case of Sam is we looked for taa from start instead we should have looked after the start codon
        //System.out.println(DNA.indexOf(startCodon)+" "+DNA.indexOf(stopCodon)+3);
        if((stopCodon-startCodon)%3 != 0){
            return "No valid Gene Found";
        }
        if(startCodon != -1 && stopCodon!= -1)
            return DNA.substring(startCodon,stopCodon+3);
        return "No gene";
    }
    public String getGeneCorrect(String DNA){
        int startCodon = DNA.indexOf("ATG");
        int stopCodon = DNA.indexOf("TAA",startCodon+3);
        int prevCodon=-1;
        while(stopCodon!=-1){
            prevCodon=stopCodon;
            if((stopCodon-startCodon)%3!=0){
                stopCodon=DNA.indexOf("TAA",prevCodon+1);
            }
            else{
                return DNA.substring(startCodon,stopCodon+3);
            }
        }
        return "No gene";
    }
}

public class FindingGene {
    public static void main(String[] args){
        String DNA = getDNA();
        //testSimpleGene();
        testNewGene();
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
    public static void testSimpleGene(){
        String one ="AGCATCGGCGTAGAGCGTGTTTAGGAGTCGACACACAAATAAAGTTAAA";
        String two ="ATGTCGCCAGAGAACTACTAGCAAAGGCTTAAAACTCAAAGGACTTGGCGG;";
        String three = "ATGGATCCTCCATATACAACGGTATCTCCACCTCAGGTTTAGATCTCAACAACGGAACCATTGCCGACATGAGACAGTTAGGTATCGTCGAGAGTTACAAGCTAA";
        String four = "TACCTACAAGCAGTCTAAAGGACGACTACTCATCTATGTGGCAAAATAGTAAACATTTACCCACCTATTAAAAGTATAGGAGATAGAAATTGAACTCAGGAGCTA";
        String five = "TTAAACTCGTTAATACCCTTAAAATTAGCCATCTCCTAGACCTAATACTGGACTATTCTATTTTTTAATAGAAGAAATAATGTTAATATAAGTAACAAGAGTTAATGTAGCTTAAACCTTTAAAGCAAGGCACTGAAAATGCCTAGATGAGTGAGCTCACTCCATAGACACAAAGGTTTGGTCCTGGCCTTCTTATTAGT";
        System.out.println(new FindGene().getGene(one));
        System.out.println(new FindGene().getGene(two));
        System.out.println(new FindGene().getGene(three));
        System.out.println(new FindGene().getGene(four));
        System.out.println(new FindGene().getGene(five));
    }
    public static void testNewGene(){
        String one ="AGCATCGGCGTAGAGCGTGTTTAGGAGTCGACACACAAATAAAGTTAAA";
        String two ="ATGTCGCCAGAGAACTACTAGCAAAGGCTTAAAACTCAAAGGACTTGGCGG;";
        String three = "ATGGATCCTCCATATACAACGGTATCTCCACCTCAGGTTTAGATCTCAACAACGGAACCATTGCCGACATGAGACAGTTAGGTATCGTCGAGAGTTACAAGCTAA";
        String four = "TACCTACAAGCAGTCTAAAGGACGACTACTCATCTATGTGGCAAAATAGTAAACATTTACCCACCTATTAAAAGTATAGGAGATAGAAATTGAACTCAGGAGCTA";
        String five = "TTAAACTCGTTAATACCCTTAAAATTAGCCATCTCCTAGACCTAATACTGGACTATTCTATTTTTTAATAGAAGAAATAATGTTAATATAAGTAACAAGAGTTAATGTAGCTTAAACCTTTAAAGCAAGGCACTGAAAATGCCTAGATGAGTGAGCTCACTCCATAGACACAAAGGTTTGGTCCTGGCCTTCTTATTAGT";
        System.out.println(new FindGene().getGeneCorrect(one));
        System.out.println(new FindGene().getGeneCorrect(two));
        System.out.println(new FindGene().getGeneCorrect(three));
        System.out.println(new FindGene().getGeneCorrect(four));
        System.out.println(new FindGene().getGeneCorrect(five));
    }
}
