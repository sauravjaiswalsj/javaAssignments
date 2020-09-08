package GettersSetters;
import java.util.Scanner;
public class ElectricGuitar{
	private String brand;
	private int numOfPickUps;
	ElectricGuitar(){
		this.brand="";
		this.numOfPickUps=0;
	}
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public int getNumOfPickUps(){
		return this.numOfPickUps;
	}
	public void setNumOfPickUps(int numOfPicks){
		this.numOfPickUps=numOfPicksm;
	}
}

