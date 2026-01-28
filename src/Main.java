import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Programmer programmer = new Programmer();
        programmer.name = sc.nextLine();
        programmer.surname = sc.nextLine();
        programmer.age = sc.nextInt();
        System.out.println(programmer.name + " " +  programmer.surname + " " + programmer.age);
        System.out.println(programmer.getDateOfBirth());
    }
}