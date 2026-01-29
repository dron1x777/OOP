public class Order {
    int totalPrice;

    public Order( int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String printOrderInfo(String name, String phone) {
        return "Order: " + name + " " + phone + " " + totalPrice;
    }
}
