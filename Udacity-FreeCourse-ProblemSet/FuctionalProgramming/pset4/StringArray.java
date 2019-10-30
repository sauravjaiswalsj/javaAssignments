import java.util.*;
public class StringArray{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		// we need to remove the buffer for the Scanner so we gotta use nextLine()
		cin.nextLine();
		String[] names=new String[n];
		for(int i=0;i<n;i++){
			System.out.print(i);
			names[i]=cin.nextLine();
		}
		String target=cin.nextLine();
		System.out.println(indexOfFirstOccurrence(names,target));
	}
	/*
	 * Searches of the first occurence of the string
	 * @param Takes the input array as the input and the target string 
	 * @return the 1st occurrence of the string
	 */
	public static int indexOfFirstOccurrence(String[] names, String target){
		for(int i=0;i<names.length;i++){
			if(names[i].compareTo(target)==0){
				return i;
			}
		}
		return -1;
	}
}
