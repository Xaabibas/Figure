package Figure.Triangle;

public class IsoscelesTriangle extends Triangle{

    public IsoscelesTriangle(double base, double sideSide){
        try {
            if (base > sideSide * 2){
                throw new Exception("Такого треугольника не существует");
            }
            this.setA(base);
            this.setB(sideSide);
            this.setC(sideSide);

        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public double square() {
        double h = Math.sqrt(this.getB()*this.getB() - this.getA()*this.getA()/4);
        return h * this.getA() / 2;
    }
}
