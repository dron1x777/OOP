public class Rectangle {
    private double length;
    private double width;

    void setLength(double length) {
        this.length = length;
    }
    void setWidth(double width) {
        this.width = width;
    }
    String getInfo() {
        return length + " " + width;
    }
    Double getS() {
        return width * length/2;
    }
}
