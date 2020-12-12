package Week2;
class Occurrence{
    public boolean towOccurrences(String a, String b){
        //returns true if the occurrence occurs at least twice in b else false.
        StringBuilder sb = new StringBuilder(b);
        int count =0,index=0;
        while(true){
            index = sb.indexOf(a,index);
            if(index != -1){
                index+=sb.length();
                count++;
            }else{
                break;
            }
        }
        if(count>2)
            return true;
        return false;
    }
}
public class TwoOccurrence {
    public static void main(String[] args){
        System.out.println(new Occurrence().towOccurrences("a","banana"));
    }
}
