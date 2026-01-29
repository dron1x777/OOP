import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] students = {"Aimerei", "Aibek", "Ruslan", "Akbermet"};
        Group group = new Group("Galactic Strangers", students);
        group.printStudents();
        System.out.println(group.addStudent("Shamidin"));
        group.printStudents();
        System.out.println(group.countStudents());


    }
}