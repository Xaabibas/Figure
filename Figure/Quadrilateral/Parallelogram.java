package Figure.Quadrilateral;

public class Parallelogram extends Quadrilateral{

    private double angle;
    {
        angle = 0;
    }

    public Parallelogram(double firstSide, double secondSide){
        super(firstSide, secondSide, firstSide, secondSide);
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public double square(){
        System.out.println("Устфновленный угол между сторонами - " + angle + " радиан");
        return Math.sin(angle) * this.getA() * this.getB();
    }
}
