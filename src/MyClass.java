import java.util.Arrays;

public class MyClass {
    private String firstName;
    private String lastName;
    private int  age;
    private String[] lessons;
    private String favouriteFood;
    public MyClass(String[] lessons) {
        this.lessons = lessons;
    }
    public MyClass(String firstName, String lastName, int age, String favouriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favouriteFood = favouriteFood;
    }
    public String getInfo() {
        return firstName + " " + lastName + " " + age + " " + favouriteFood;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", lessons=" + Arrays.toString(lessons) +
                ", favouriteFood='" + favouriteFood + '\'' +
                '}';
    }
}
