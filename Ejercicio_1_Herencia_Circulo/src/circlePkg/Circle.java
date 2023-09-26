package circlePkg;

public class Circle {
    private double radius;
    private String color;
    //constructor
    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color){
        radius = 1.0;
        color = "red";
    }

    //Methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI* this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}




