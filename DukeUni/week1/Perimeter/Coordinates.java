package Perimeter;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int pointX, int pointY) {
        this.x = pointX;
        this.y=pointY;
    }

    public Coordinates() {
        this.x=0;
        this.y=0;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public double getDistance(Coordinates C,Coordinates D){
        int dx=C.getX()-D.getX();
        int dy=C.getY()-D.getY();
        return Math.sqrt((dx*dx + dy*dy));
    }
}
