
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        car1.model = "AUDI";
        car1.year = 2016;
        Car car2 = new Car();
        car2.color = "black";
        car2.model = "BMW";
        car2.year = 1998;
        Car car3 = new Car();
        car3.color = "grey";
        car3.model = "MERS";
        car3.year = 2019;
        System.out.println(car1.color + " " + car1.model + " " + car1.year);
        System.out.println(car2.color + " " + car2.model + " " + car2.year);
        System.out.println(car3.color + " " + car3.model + " " + car3.year);


    }
}