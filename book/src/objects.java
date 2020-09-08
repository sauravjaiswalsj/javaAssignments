import java.util.Scanner;
class Contacts{
	String name;
	public void callPerson(){
		System.out.print("Hello,"+name);
	}
}
public class objects{
	public static void main(String[] args){
		Contacts refc;
		int x=0;
		String[] name={"mohan","sohan","rohan","noman","choman"};
		/*while(x<5){
			refc=new Contacts();
			refc.name=name[x];
			System.out.println(refc.name);
			x++;
		}
		x=0;
		while(x<5){
			refc=new Contacts();
			System.out.print(refc.name);
			x++;
		}
		*/
		refc=new Contacts();
		refc.name="Shakti";
		CallName(refc);
		refc.callPerson();
	}
	public static void CallName(Contacts refc){
		refc=new Contacts();
		refc.name="Mohan";
		refc.callPerson();
	}
}	
