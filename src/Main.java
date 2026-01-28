import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Triangle triangle = new Triangle();
        triangle.a =  sc.nextInt();
        triangle.b = sc.nextInt();
        triangle.c = sc.nextInt();
        System.out.println(triangle.Triangle());

    }
}