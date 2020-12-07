package week1;

public class Point {
    private final int x;
    private final  int y;
    //Constructor
    public Point(){
        this.x=0;
        this.y=0;
    }
    // Initialize the two points
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    // define getters
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    // Compute the distance
    public double pointDistance(Point p1, Point p2){
        int dx= p1.getX() - p2.getX();
        int dy= p1.getY() - p2.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
}
