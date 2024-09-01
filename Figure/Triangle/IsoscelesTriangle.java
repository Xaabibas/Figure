package Figure.Triangle;

public class IsoscelesTriangle extends Triangle{

    public IsoscelesTriangle(double base, double sideSide){
        super(base, sideSide, sideSide);
    }

    @Override
    public double square() {
        double h = Math.sqrt(this.getB()*this.getB() - this.getA()*this.getA()/4);
        return h * this.getA() / 2;
    }
}
