import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Cat cat1 = new Cat("myshyk", 3, "orange");
        Cat cat2 = new Cat("murzyk", 1, "red");
        System.out.println(cat1.getInfo());
        System.out.println(cat2.getInfo());
        Dog dog1 = new Dog("bobik", 5, "white");
        Dog dog2 = new Dog("jerk", 4, "black");
        System.out.println(dog1.getInfo());
        System.out.println(dog2.getInfo());
    }
}