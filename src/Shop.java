import java.util.Arrays;

public class Shop {
    private String shopName;
    private Product[] products;
    public int count;

    void setCount(int count) {
        this.count = count;
    }
    void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public Shop(int size) {
        products = new Product[size];
        count = 0;
    }

    String getShopName() {
        return shopName;
    }
    int getCount()  {
        return count;
    }
    public Product[] getProducts() {
        return products;
    }

    void addProduct(Product product) {
        if (count < products.length) {
            products[count++] = product;
            System.out.println("Added product " + product.getName() + " with price " + product.getPrice());
        }
        else {
            System.out.println("shop is full");
        }
    }

    String updateProduct(int id, String newName, double newPrice) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getID() == id) {
                products[i].setName(newName);
                products[i].setPrice(newPrice);
                return "Updated product " + newName + " with price " + newPrice;
            }
        }
        return "Invalid product ID";
    }
    String deleteProduct(int id) {
        String message = "this product is already deleted";
        for (int i = 0; i < products.length; i++) {
            if (products[i].getID() == id) {
                products[i].setName(message);
                products[i].setPrice(0);
                return "Deleted product " + products[i].getName();
            }
        }
        return "Invalid product ID";

    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", products=" + Arrays.toString(products) +
                ", count=" + count +
                '}';
    }
}
