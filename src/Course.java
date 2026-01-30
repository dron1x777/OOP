
public class Course {
    private String name;
    private int age;
    private int something;

    public Course() {

    }


    public Course(String name) {
        this.name = name;
    }

    public Course(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Course(String name, int age, int something) {
        this.name = name;
        this.age = age;
        this.something = something;
    }

    public String getInfo() {
        return this.name + " " + this.age + " " + this.something;
    }
}
