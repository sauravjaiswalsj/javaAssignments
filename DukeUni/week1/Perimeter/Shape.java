package Perimeter;

import java.io.IOException;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Coordinates> points;
    public void parseStringToNum() throws IOException {
        String line = new ReadFile().getReadFile();
       // System.out.println(line);
        String[] parser = line.split("\\s| |,");
        points = new ArrayList<>();
        for(int i=0;i<parser.length-1;i+=2){
            int x=Integer.parseInt(parser[i]);
            int y=Integer.parseInt(parser[i+1]);
            points.add(new Coordinates(x,y));
        }
    }
    public Shape() throws IOException {
        parseStringToNum();
    }
    public Coordinates getLastPoint(){
        return points.get(points.size()-1);
    }
    public ArrayList<Coordinates> getPoints(){
        return points;
    }
    public int getCountOfPoints(){return points.size();}
}
