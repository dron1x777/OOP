public class Car {
    private String brand;
    private int year;
    private String model;
    private int speed;

    void setBrand(String brand) {
        this.brand = brand;
    }
    void setYear(int year) {
        this.year = year;
    }
    void setModel(String model) {
        this.model = model;
    }
    void setSpeed(int speed) {
        this.speed = speed;
    }
    String getBrand() {
        return brand;
    }
    int getYear() {
        return year;
    }
    String getModel() {
        return model;
    }
    int getSpeed() {
        return speed;
    }
    double increaseSpeed(int value) {
        return speed += value;
    }
    double decreaseSpeed(int value) {
        speed -= value;
        if (speed > 0) {
            return speed;
        }
        return 0;
    }

}