import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        House house = new House("address 23", 4, 6);
        System.out.println(house.calculatePrice());
    }
}