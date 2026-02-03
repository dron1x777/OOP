public class House {
    private String address;
    private int numberOfRooms;
    private double area;

    public  House (String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }
    void setAddress(String address) {
        this.address = address;
    }
    void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    void setArea(double area) {
        this.area = area;
    }
    String getAddress() {
        return address;
    }
    int getNumberOfRooms() {
        return numberOfRooms;
    }
    double getArea() {
        return area;
    }
    String calculatePrice() {
        return address + " " + numberOfRooms + " " + area * 100000;
    }
}
