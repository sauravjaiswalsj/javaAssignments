/*
 This program takes genes from a file and generated nuclodite
 @authon Saurav Jaiswal
 @version 1.0.0
 @since 2017
 @param dna.txt
 @thorws file Exception
 */
import java.io.*;
import java.util.*;
class GenesFinder{
    public GenesFinder(String dna){
        String result="";
        int startDna=dna.indexOf("ATG");
        int endDna=dna.indexOf("TAA");
        int diff=endDna-startDna;
        if(startDna ==-1 || endDna ==-1) {
            if (diff % 3 != 0) {
                System.out.println("Invalid DNA");
            } else {
                System.out.println("");
            }
        }
        else{
            result=dna.substring(startDna,endDna+3);
            System.out.println(result);
        }
    }
}
class fileReader{
    public String getDNA(){
        try{
            File file=new File("dna.txt");
            BufferedReader br=new BufferedReader(new FileReader(file));
            String lines=br.readLine();
            return lines;
        }
        catch (Exception e){
            return "Your DNA is Missing";
        }
    }
}
public class FindGenes{
    public static void main(String[] args){
        fileReader f=new fileReader();
        if(!f.getDNA().equals("Your DNA is Missing")){
            String dna=f.getDNA();
            GenesFinder g=new GenesFinder(dna);
        }
        else{
            System.out.println("File Missing");
        }


    }
}