package week1;

import java.io.IOException;
import java.util.ArrayList;

public class PerimeterRunner {
    public static void main(String[] args)throws IOException {
        //getPerimeter -> returns the perimeter of the Given Shapes
        //  -> It has one param named Shapes. This returns the perimeter of the shape.
        //Shape method will have list of Coordinates.
        Shape s = new Shape();
        double perimeter = getPerimeter(s);
        System.out.println(perimeter);
    }
    public static double getPerimeter(Shape s){
        //ArrayList<Double> lengthOfEachSide = new ArrayList<>();
        double totalPerimeter = 0.0;
        Point lastCord = s.getLastPoint();
        for(Point currCord: s.getPoints()){
            double currDist = new Point().pointDistance(lastCord,currCord);
            //lengthOfEachSide.add(currDist);
            totalPerimeter+=currDist;
            lastCord=currCord;
        }
        return totalPerimeter;
    }
}