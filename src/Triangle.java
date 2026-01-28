public class Triangle {
    int a;
    int b;
    int c;
    public double area() {
        double p = (a + b + c) / 2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return S;
    }


}
