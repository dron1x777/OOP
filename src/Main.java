import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] lessons = {"OOP", "Technical Lessons", "Practical Lessons"};
        MyClass myClass = new MyClass(lessons);
        MyClass myClass2 = new MyClass("Shamidin", "Ularbekov",15,"Manty");
        System.out.println(myClass2.getInfo());
        System.out.println(myClass.toString());

    }
}