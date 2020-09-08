package GettersSetters;
import GettersSetters.ElectricGuitar;
public class Main {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();
        guitar.setBrand("San Joe");
        guitar.setNumOfPickUps(10);
        System.out.println(guitar.getBrand()+" "+guitar.getNumOfPickUps());
    }
}
