package Perimeter;
import Perimeter.ReadFile;
import Perimeter.Coordinates;

import java.io.IOException;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Coordinates> points;
    public void parseStringToNum() throws IOException {
        String line = new ReadFile().getReadFile();
        System.out.println(line);
    }
}
