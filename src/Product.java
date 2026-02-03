public class Product {
    private int ID;
    private String name;
    private double price;
    static int counter = 0;

    public Product(String name, double price) {
        ID = counter++;
        this.name = name;
        this.price = price;
    }
    void setName(String name) {
        this.name = name;
    }
    void setPrice(double price) {
        this.price = price;
    }
    void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
