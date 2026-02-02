import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private String surname;
    private String[] courses;
    void setName (String name) {
        this.name = name;
    }
    void setAge (int age) {
        this.age = age;
    }
    void setSurname (String surname) {
        this.surname = surname;
    }
    void setArray(String[] courses) {
        this.courses = courses;
    }
    String getInfo() {
        return "Name: " + name + ", Age: " + age + ", Surname: " + surname;
    }
    void getArray() {
        for (int i = 0; i < courses.length; i++) {
            System.out.print(courses[i] + " ");
        }
    }
}
