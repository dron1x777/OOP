import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(4);
        rectangle.setLength(6);
        System.out.println(rectangle.getInfo());
        System.out.println(rectangle.getS());

    }
}