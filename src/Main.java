import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Customer customer = new Customer();
        createCustomer(customer);
    }

    public static void createCustomer(Customer customer){
        Scanner sc = new Scanner(System.in);
        customer.setFirstName(sc.nextLine());
        customer.setDateOfBirth(sc.nextInt());
        sc.nextLine();
        customer.setEmail(sc.nextLine());
        customer.setPhoneNumber(sc.nextLine());
        customer.setId(sc.nextLong());
        sc.nextLine();
    }

    public static void getByldCustomer(Customer customer){
        System.out.println("your name is: " + customer.getFirstName() + ", " + customer.getDateOfBirth() + ", " + customer.getPhoneNumber() + ", " + customer.getId() + ", " + customer.getEmail());
    }

    public static void updateCustomer(Customer customer){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("""
                    what you wanna update?
                    1. name
                    2. email
                    3. phoneNumber
                    4. ID
                    5. dateOfBirth
                    6. exist""");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    sc.nextLine(); // очищаем буфер
                    customer.setFirstName(sc.nextLine());
                    System.out.println("your name is: " + customer.getFirstName());
                    break;
                case 2:
                    sc.nextLine();
                    customer.setEmail(sc.nextLine());
                    System.out.println("your email is: " + customer.getEmail());
                    break;
                case 3:
                    sc.nextLine();
                    customer.setPhoneNumber(sc.nextLine());
                    System.out.println("your phone number is: " + customer.getPhoneNumber());
                    break;
                case 4:
                    customer.setId(sc.nextLong());
                    sc.nextLine();
                    System.out.println("your ID is: " + customer.getId());
                    break;
                case 5:
                    customer.setDateOfBirth(sc.nextInt());
                    sc.nextLine();
                    System.out.println("your date of birth is: " + customer.getDateOfBirth());
                    break;
                case 6:
                    System.out.println("good bye!");
                    return;
            }
        }
    }

    public static void deleteCustomer(Customer customer){
        customer.setFirstName(null);
        customer.setDateOfBirth(0);
        customer.setEmail(null);
        customer.setPhoneNumber(null);
        customer.setId(0);
        System.out.println("Customer deleted.");
    }
}
