package Week2;
class Occurrence{
    public boolean towOccurrences(String checkPresentString, String string){
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
}
public class TwoOccurrence {
    public static void main(String[] args){
        System.out.println(new Occurrence().towOccurrences("a","aanana"));
    }
}
