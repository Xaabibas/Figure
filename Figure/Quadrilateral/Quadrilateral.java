package Figure.Quadrilateral;

public class Quadrilateral {
    private double a;
    private double b;
    private double c;
    private double d;

    public Quadrilateral(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    void setD(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }

    public double perimeter(){
        return a + b + c + d;
    }
}
