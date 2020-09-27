import java.util.*;
public class Point{
    private final int x;
    private final int y;
    public Point(int startX, int startY){
        this.x=startX;
        this.y=startY;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double Distance(Point otherPT){
        int dx=x-otherPT.getX();
        int dy=y-otherPT.getY();
        return Math.sqrt(dx*dx + dy * dy);
    }
        public static void main(String[] args){
            Point p1=new Point(4,-1) ;
            Point p2=new Point(1,3);
            System.out.println(p1.Distance(p2 ));
        }
}
