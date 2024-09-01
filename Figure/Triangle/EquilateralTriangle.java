package Figure.Triangle;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(double side){
        this.setA(side);
        this.setB(side);
        this.setC(side);
    }

    @Override
    public double square() {
        return this.getA() * this.getA() * Math.sin(Math.PI / 3) / 2;
    }

    public double radiusOfTheInscribedCircle(){
        return this.getA() * Math.sin(Math.PI / 3) / 3;
    }

    public double radiusOfTheCircumscribedCircle(){
        return this.radiusOfTheInscribedCircle() * 2;
    }
}
