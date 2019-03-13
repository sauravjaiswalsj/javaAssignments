/**
 * Program to find the gravity of a free falling object in the earth object
 *
 * formual is :
 * x(t)=0.5*at^2+(vi)*t+xi
 *
 * x = final position or distance
 * a = accelaration due to gravity on earth g=-9.81 m/s^2
 * t = time of free fall
 * vi = initial velocity
 * xi= initial position
*/

public class GravityCalculator{
	public static void main(String[] args){
		double gravity=-9.81d;
		double fallingTime=10.0d;
		double initialVelocity=0.0d;
		double initialPosition=0.0d;
		double finalPosition=0.0d;
		finalPosition=0.5*gravity* fallingTime*fallingTime+ initialPosition*fallingTime+initialPosition;
		System.out.println("The object's position after "+fallingTime+" seconds is "+finalPosition+" m");
	}
}
