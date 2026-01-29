import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        BankAccount user1 = new BankAccount("Shamidin", 2500);
        System.out.println(user1.toString());
        System.out.println(user1.deposit(1000));
        System.out.println(user1.withdraw(-500));
        System.out.println(user1.printBalance());


        BankAccount user2 = new BankAccount("dog", 1500);
        System.out.println(user2.toString());
        System.out.println(user2.deposit(500));
        System.out.println(user2.withdraw(1000));
        System.out.println(user2.printBalance());
    }
}