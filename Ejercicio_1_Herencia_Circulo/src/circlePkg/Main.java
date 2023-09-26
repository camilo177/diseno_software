package circlePkg;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        // Set the color of the circle
        circle.setColor("blue");

        // Display information about the circle
        System.out.println(circle);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.getArea());

        // Create a Cylinder object with a radius of 5.0 and height of 10.0
        Cylinder cylinder1 = new Cylinder(5.0, 10.0);

        // Set the color of the cylinder
        cylinder1.setColor("blue");

        // Display information about the cylinder
        System.out.println("///////////////////////////////////");
        System.out.println(cylinder1);
        System.out.println("Radius: " + cylinder1.getRadius());
        System.out.println("Color: " + cylinder1.getColor());
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Volume: " + cylinder1.getVolume(cylinder1.getRadius(), cylinder1.getHeight()));
    }
}