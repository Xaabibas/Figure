package Figure.Triangle;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c){
        try {
            if (a + b  <= c || a + c <= b || b + c <= a){
                throw new Exception("Такого трегольника не существует");
            }
            this.a = a;
            this.b = b;
            this.c = c;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
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

