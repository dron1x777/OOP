import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Customer customer = new Customer("Shamidin", "Iphone");
        Order order = new Order(37000);

        System.out.println(order.printOrderInfo(customer.name,  customer.phone));

    }
}