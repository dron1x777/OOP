public class User {
    String name;
    int age;
    String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public String printInfo() {
        return "Name: " + name + "\nAge: " + age + "\nEmail: " + email;
    }
}
