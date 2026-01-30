import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Course course = new Course();
        Course course1 = new Course(sc.nextLine());
        Course course2 = new Course(sc.nextLine(), sc.nextInt());
        sc.nextLine();
        Course course3 = new Course(sc.nextLine(), sc.nextInt(), sc.nextInt());
        System.out.println(course.getInfo());
        System.out.println(course1.getInfo());
        System.out.println(course2.getInfo());
        System.out.println(course3.getInfo());

    }
}