import java.util.Scanner;

class Player{
	int num=0;
	int guess(){
		num=(int)(Math.random()*10);
	       	System.out.println("I'm guessing "+num);
		return num;
	}
}
public class GuessGameLauncher{
	public static void main(String[] args){
		GuessGame game=new GuessGame();
		game.GameLauncher();
	}
}
class GuessGame{
	private Player p1,p2,p3;
	void GameLauncher(){
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
		int guess1=0,guess2=0,guess3=0;
		boolean g1,g2,g3;
		System.out.println("\t\t Guesssing Game");
		System.out.println("\t-------------------------------------");
		int target=(int)(Math.random()*10);
		while(true){
			System.out.println("Target Number to guess is : "+target);
			guess1=p1.guess();
			guess2=p2.guess();
			guess3=p3.guess();
			g1=(guess1==target)?true:false;
			g2=(guess2==target)?true:false;
			g3=(guess3==target)?true:false;
			if(g1 || g2|| g3){
				System.out.println("We have a winner");
				System.out.println("Player1: "+guess1 +" Player2: "+guess2+"Player3: "+guess3);
				if(g1){
					System.out.println("Player1 is winner");
				}else if(g2){
					System.out.println("Player2 is winner");
				}
				else{
					System.out.println("Player3 is winner");
				}
				break;
			}
			else{
				System.out.println("Player1: "+guess1 +" Player2: "+guess2+"Player3: "+guess3);
				System.out.println("Guess it Again ");
			}
		}
	}
}


