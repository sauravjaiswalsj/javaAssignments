import java.util.*;
public class Monopoly2{
	public static void main(String[] args){
		System.out.println(monopolyRoll());
	}
	/*
	 * This rolls the two dices and provides the result
	 * @return Returns the total sum after rolling two dices
	 */
	private static int sendJail=1;
	public static int monopolyRoll(){
		if(sendJail==3)return -1;
		int roll1=diceRoll(6);
		int roll2=diceRoll(6);
		int total=roll1+roll2;
		if(roll1!=roll2) return total;
		else{	sendJail++;
		       	return total+monopolyRoll();
		}
	}
	/*
	 * Generates the random dice roll number
	 * @param total side of dices
	 * @return random number when dice is rolled
	 */
	public static int diceRoll(int sides){
		return ((int)((Math.random()*sides)+1));
	}
}
