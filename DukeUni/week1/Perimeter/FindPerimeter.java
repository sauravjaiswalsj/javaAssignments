package Perimeter;

import java.io.IOException;
import java.util.ArrayList;

public class FindPerimeter {
    public static void main(String[] args) throws IOException {
        Shape s = new Shape();
        double perimeter = getPerimeter(s);
        System.out.println(perimeter);
        int numPoints = getCords(s);
        System.out.println(numPoints);
        System.out.println(getAverage(perimeter,numPoints));
    }
    public static double getPerimeter(Shape s){
        ArrayList<Double> length = new ArrayList<>();
        Coordinates c= new Coordinates();
        double totalPerim=0.0;
        Coordinates lastCord=s.getLastPoint();
        for(Coordinates currCord:s.getPoints()){
            double currDist=c.getDistance(lastCord,currCord);
            length.add(currDist);
            totalPerim+=currDist;
            lastCord=currCord;
        }
        for(Double i:length){
            System.out.print(i+" ");
        }
        System.out.println();
        return totalPerim;
    }
    public static double getAverage(double perimeter, int numPoints){
        return perimeter/numPoints;
    }
    public static int getCords(Shape s){
        return s.getCountOfPoints();
    }
}
