package Perimeter;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int pointX, int pointY) {
        this.x = pointX;
        this.y=pointY;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
