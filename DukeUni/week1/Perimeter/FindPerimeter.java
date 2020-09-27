package Perimeter;

import java.io.IOException;

public class FindPerimeter {
    public static void main(String[] args) throws IOException {
           System.out.println(getPerimeter(new Shape()));
    }
    public static double getPerimeter(Shape s){
        Coordinates c= new Coordinates();
        double totalPerim=0.0;
        Coordinates lastCord=s.getLastPoint();
        for(Coordinates currCord:s.getPoints()){
            double currDist=c.getDistance(lastCord,currCord);
            totalPerim+=currDist;
            lastCord=currCord;
        }
        return totalPerim;
    }
}
