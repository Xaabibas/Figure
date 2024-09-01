package Figure.Triangle;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    void setC(double c) {
        this.c = c;
    }

    public double square(){
        double p = (a + b + c) /2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return this.getA() + this.getB() + this.getC();
    }

}

