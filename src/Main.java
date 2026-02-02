import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Car car = new Car();
        car.setBrand("BMW");
        car.setYear(2018);
        car.setModel("F90");
        car.setSpeed(230);
        System.out.println(car.getYear());
        System.out.println(car.getBrand());
        System.out.println(car.getYear());
        System.out.println(car.getModel());
        System.out.println(car.increaseSpeed(50));
        System.out.println(car.decreaseSpeed(290));


    }
}