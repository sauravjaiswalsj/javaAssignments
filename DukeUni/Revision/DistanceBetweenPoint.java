import org.jetbrains.annotations.NotNull;

public class DistanceBetweenPoint {
    private final int x;
    private final int y;
    public DistanceBetweenPoint(int startX, int startY){
        this.x=startX;
        this.y=startY;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    //compute Distance from one point to another point
    public double distance(@NotNull DistanceBetweenPoint otherPt){
        int dx = x - otherPt.getX();
        int dy = y - otherPt.getY();
        return  Math.sqrt((dx*dx + dy*dy));
    }
    public static void main(String[] args){
        DistanceBetweenPoint p1 = new DistanceBetweenPoint(3,4);
        DistanceBetweenPoint p2 = new DistanceBetweenPoint(6,8);
        System.out.println(p1.distance(p2));
    }
}