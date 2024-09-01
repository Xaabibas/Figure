package Figure.Quadrilateral;

public class Rectangle extends Quadrilateral{

    public Rectangle(double firstSide, double secondSide){
        super(firstSide, secondSide, firstSide, secondSide);
    }

    public double square(){
        return this.getA()*this.getB();
    }

    public double diagonal(){
        return Math.sqrt(this.getA()*this.getA() + this.getB()*this.getB());
    }
    public double radiusOfTheInscribedCircle(){
        return this.diagonal() / 2;
    }
}
