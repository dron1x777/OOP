import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] grades = {4,5,2,5,5,4,3,4,2,5};
        int[] grades1 = {5,5,5,2,4,5,5,3,4,5,3,2,5};
        Student user1 = new Student("Shamidin", grades);
        System.out.println(user1.calculateAverage());



        Student user2 = new Student("dog", grades1);
        System.out.println(user2.calculateAverage());

    }
}