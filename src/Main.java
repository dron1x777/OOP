import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        University[] university = new University[2];
        for (int i = 0; i < university.length; i++) {
            university[i] = new University();
            university[i].setName("University" + i);
            university[i].setYear(2019);
            System.out.println(university[i].getName());
            System.out.println(university[i].getYear());

            university[i].setYear(university[i].getYear() + 1);
        }

        School[] schools = new School[2];
        for (int i = 0; i < schools.length; i++) {
            schools[i] = new School();
            schools[i].setName("School" + i);
            schools[i].setNumber(117);
            System.out.println(schools[i].getName());
            System.out.println(schools[i].getNumber());
            schools[i].setNumber(schools[i].getNumber() + 1);
        }
        Car[] cars = new Car[2];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].setModel("Model" + i);
            cars[i].setYear(2018);
            System.out.println(cars[i].getModel());
            System.out.println(cars[i].getYear());
            cars[i].setYear(cars[i].getYear() + 1);
        }
        Person[] persons = new Person[2];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            persons[i].setName("Person" + i);
            persons[i].setAge(15+1);
            System.out.println(persons[i].getName());
            System.out.println(persons[i].getAge());
            persons[i].setAge(persons[i].getAge() + 1);
        }
    }
}