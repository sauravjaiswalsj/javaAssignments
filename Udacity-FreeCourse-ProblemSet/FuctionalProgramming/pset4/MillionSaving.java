import java.util.Scanner;
public class MillionSaving{
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		int balance=cin.nextInt();
		System.out.println(yearsTilOneMillion(balance));
	}
	/*
	 * Computes the time frame to save 1 million 
	 * @param takes the principle amout
	 * @returns the time to save to 1 million in years
	 */
	public static int yearsTilOneMillion(double initBalance){
		int years=0;
		while(initBalance>1_000_000){
			years++;
			initBalance=initBalance*1.05;
		}
		return years;
	}
}
