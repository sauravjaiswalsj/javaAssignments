import java.util.*;
public class ProblemString{
    public static boolean twoOccurence(String stringa, String stringb){
        if((stringb.indexOf(stringa))!=-1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
            Scanner cin=new Scanner(System.in);
            String stringa=cin.nextLine();
            String stringb=cin.nextLine();
            System.out.println(twoOccurence(stringa,stringb));
    }
}