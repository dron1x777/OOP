import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] courses = new String[10];
        Student student = new Student();
        student.setName(sc.nextLine());
        student.setSurname(sc.nextLine());
        student.setAge(sc.nextInt());
        System.out.println(student.getInfo());
        for (int i = 0; i < courses.length; i++) {
            courses[i] = sc.nextLine();
        }
        student.setArray(courses);
        student.getArray();
    }
}