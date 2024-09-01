package Figure.Triangle;

public class RightAngledTriangle extends  Triangle{

    public RightAngledTriangle(double hypotenuse, double firstCatheter, double secondCatheter){
        super(firstCatheter, secondCatheter, hypotenuse);
    }

    @Override
    public double square() {
        return a * b / 2;
    }

    @Override
    public double radiusOfTheCircumscribedCircle() {
        return c / 2;
    }

    @Override
    public double radiusOfTheInscribedCircle() {
        double p = this.perimeter() / 2;
        return this.square() / p;
    }
}
