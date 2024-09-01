package Figure.Triangle;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(double side){
        super(side, side, side);
    }

    @Override
    public double square() {
        return this.getA() * this.getA() * Math.sin(Math.PI / 3) / 2;
    }

    @Override
    public double radiusOfTheInscribedCircle(){
        return this.getA() * Math.sin(Math.PI / 3) / 3;
    }

    @Override
    public double radiusOfTheCircumscribedCircle(){
        return this.radiusOfTheInscribedCircle() * 2;
    }
}
