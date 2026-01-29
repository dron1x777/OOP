import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        User user1 = new User("Shamidin", 15, "usaamidin@gmail.com");
        System.out.println(user1.printInfo());

        User user2 = new User("Dog", 3, "bestdog@gmail.com");
        System.out.println(user2.printInfo());


    }
}