import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] students = {"Aimerei", "Aibek", "Ruslan", "Akbermet"};
        Team group = new Team("Galactic Strangers", students);
        group.printPlayers();
        System.out.println(group.addPlayer("Shamidin"));
        group.printPlayers();
        System.out.println(group.addPlayer("Ruslan"));
        group.printPlayers();


    }
}