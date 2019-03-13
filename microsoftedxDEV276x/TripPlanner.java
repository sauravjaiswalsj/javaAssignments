/** This project lets user to plan their trip accordingly
 * Takes the user names and city
 * Takes input from the user such as amount to be spent
 * Takes input such as currency rate and converts to native currency
 * Takes input time difference and change to local time
 *
 * */

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class TripPlanner{
	public static final Scanner cin=new Scanner(System.in);
	public static final DecimalFormat df=new DecimalFormat(".##");
	public static void main(String[] args){
		System.out.println("Welcome to Trip Planner!");
		greetings();
		moneyPlanner();
		timePlanner();
		areaChecker();
	}
	public static void greetings(){
		System.out.print("What is your name? ");
		String name=cin.nextLine();
		System.out.print("Nice to meet you "+name+", where are you travelling to? ");
		String city=cin.nextLine();
		System.out.println("Great! "+city+" sounds like a great trip\n***********\n");
	}//ends greetings
	public static void moneyPlanner(){
		int staying_days;
		double spending_amount,currency_rate;
		String currency_symbol;

		System.out.print("How many days you are planning to stay? ");
		staying_days=cin.nextInt();
		System.out.print("How much money, in USD are you planning to on your trip? ");
		spending_amount =(double)cin.nextDouble();
		System.out.print("What is the three letter currency symbol for your travel destination? ");
		currency_symbol=cin.next();
		System.out.print("How many "+currency_symbol+" are there in 1 USD? ");
		currency_rate=cin.nextDouble();
		System.out.println("If you are travelling for "+staying_days+" days that is the same as "+staying_days*24+" hours or "+staying_days*24*60+" minutes");
		double per_day_USD=spending_amount/(double)staying_days;
		double total_amount_new_curr=spending_amount*currency_rate;
		double per_day_new_curr=total_amount_new_curr/staying_days;
		System.out.println();
		System.out.println("If you are going to spend "+(int)spending_amount+" USD that means per day you can spend up to "+ df.format(per_day_USD)+" USD");
		System.out.println("Your total budget in "+currency_symbol +" "+ df.format(total_amount_new_curr)+" "+currency_symbol+", which per day is " +df.format(per_day_new_curr)+" "+currency_symbol);
	System.out.println("****************\n");
	}//ends tripPlanner

	public static void timePlanner(){
		System.out.print("What is the time difference, in hours, between your home and your destination? ");
		int time_diff=cin.nextInt();
		int morningtime=time_diff+0;
		int noontime=12+time_diff;
		System.out.println("That means that when it is midnight at home it will be "+morningtime+":00 in your travel destination");
		System.out.println("and when it is noon at home it will be "+noontime+":00\n*****************\n");
	}//ends timePlanner

	public static void areaChecker(){
		System.out.print("What is the square area of your destination country in km2? ");
		long areasq=cin.nextLong();
		double milessq= areasq*0.38610;
		System.out.println("In miles2 that is "+milessq+"\n***********");
	}//ends areaChecker
	
}//ends class
		
