package Week2;

import javax.management.ObjectName;

class Occurrence{
    public boolean towOccurrences(String string, String checkPresentString ){
        //returns true if the occurrence occurs at least twice in b else false.
        int currIndex = 0,count=0,prevIndex=-1;
        while(currIndex!=-1) {
            currIndex=string.indexOf(checkPresentString,prevIndex+1);
            if(currIndex>prevIndex) {
                count++;
            }
            prevIndex=currIndex;
        }
//        while(currIndex!=-1){
//            prevIndex=currIndex;
//            if(currIndex==0)
//                currIndex=-1;
//            currIndex=string.indexOf(checkPresentString,currIndex+1);
//            if(currIndex>prevIndex){
//                count++;
//            }
        //}
        return count >= 2;
    }
    public String getLastString(String a, String b){
        int index = a.indexOf(b);

        if(index==-1) {
            index = 0;
        }else {
            index+=b.length();
        }
        return a.substring(index);
    }
}

public class TwoOccurrence {
    public static void main(String[] args){
        Occurrence occurrence =new Occurrence();
        testMethod1(occurrence);
        testMethod2(occurrence);
        testMethod3(occurrence);
        testMethod4(occurrence);
    }
    public static void testMethod1(Occurrence occurrence){
        String a = "banana";
        String b = "an";
        System.out.println(occurrence.towOccurrences(a,b)+" "+occurrence.getLastString(a,b));
    }
    public static void testMethod2(Occurrence occurrence){
        String a = "ananana";
        String b = "a";
        System.out.println(occurrence.towOccurrences(a,b)+" "+occurrence.getLastString(a,b));
    }
    public static void testMethod3(Occurrence occurrence){
        String a = "ctgtatgta";
        String b = "atg";
        System.out.println(occurrence.towOccurrences(a,b)+" "+occurrence.getLastString(a,b));
    }
    public static void testMethod4(Occurrence occurrence){
        String a = "forest";
        String b = "atg";
        System.out.println(occurrence.towOccurrences(a,b)+" "+occurrence.getLastString(a,b));
    }

}
