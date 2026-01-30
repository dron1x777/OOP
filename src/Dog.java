public class Dog {
    private String name;
    private int age;
    private String color;
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public String getInfo() {
        return this.name + " " + this.age + " " + this.color;
    }
}
