package week1;
import java.util.ArrayList;
import java.io.IOException;

public class Shape {
    private ArrayList<Point> points;
    public Shape()throws IOException{
        parseStringToInt();
    }
    public void parseStringToInt() throws IOException{
        String line = new ReadFile().getReadFile();
        String[] parserArray = line.split("\\s| |,");
        points = new ArrayList<>();
        for(int i=0;i<parserArray.length-1;i++){
            int x = Integer.parseInt(parserArray[i]);
            int y = Integer.parseInt(parserArray[i+1]);
            points.add(new Point(x,y));
        }
    }
    public Point getLastPoint(){
        return points.get(points.size()-1);
    }
    public ArrayList<Point> getPoints(){return points;}
    public int getCountOfPoints(){return points.size();}
}
