import java.util.*;
public class Monopoly{
        public static void main(String[] args){               
                System.out.println(monopolyRoll());
        }
        /*
         * Provides the results based on the dice rolling
         * @returns the sum of both the dice
         */
        public static int monopolyRoll(){
		int sendJail=0;
                int roll1=diceRoll(6);
                int roll2=diceRoll(6);
                int total=roll1+roll2;
                while(roll1==roll2){
			roll1=diceRoll(6);
			roll2=diceRoll(6);
			total+=roll1+roll2;
			sendJail++;
			if(sendJail==3){
				return -1;
			}
		}
                return total;
        }
        /*
         * Generatres the Random number between 1 to 6
         * @param Takes number of sides of a dice
         * @return the number generated for each throw
         */
        public static int diceRoll(int sides){
                return (int)((Math.random()*6)+1);
        }
}

