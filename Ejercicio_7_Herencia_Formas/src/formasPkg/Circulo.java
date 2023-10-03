package formasPkg;

public class Circulo {
    private double radius;
    //constructor
    public Circulo(double radius) {
        this.radius = radius;
    }

    //Methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI* this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radius=" + radius +
                '}';
    }
}

