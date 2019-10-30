import java.util.Scanner;
public class factorial{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		System.out.println(factorial(n));
	}
	/*
	 * This computes the factorial for any giver number
	 * @param takes a number as an input
	 * @returns the factorial for the given number
	 */
	public static int factorial(int n){
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}

}

