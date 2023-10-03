package formasPkg;

public class Cilindro extends Circulo{
    private double height;
    //Constructor
    public Cilindro(double radius, double height) {
        super(radius);
        this.height = height;
    }

    //Getters and setters

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * this.height + 2 * Math.PI * getRadius() * getRadius();
    }
}
