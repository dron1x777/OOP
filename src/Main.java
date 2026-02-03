import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Product product = new Product("milk", 60);
        Product product2 = new Product("potato", 30);
        Product product3 = new Product("gum", 10);
        Shop shop = new Shop(5);
        shop.setShopName("Shop 1");
        shop.addProduct(product);
        shop.addProduct(product2);
        shop.addProduct(product3);
        System.out.println(shop.toString());
        shop.updateProduct(1, "cookies", 300);
        System.out.println(shop.toString());
        shop.deleteProduct(1);
        System.out.println(shop.toString());
    }
}