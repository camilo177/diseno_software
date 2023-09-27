package FigurasGeometricas;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de un círculo
        Circle circle = new Circle(5.0, "Blue", true);

        // Crear una instancia de un rectángulo
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Green", false);

        // Crear una instancia de un cuadrado
        Square square = new Square(3.0, "Red", true);

        // Mostrar información de las figuras en la consola
        System.out.println("Información del círculo:");
        System.out.println("Radio: " + circle.getRadius());
        System.out.println("Área: " + circle.getArea());
        System.out.println("Perímetro: " + circle.getPerimeter());
        System.out.println(circle);

        System.out.println("\nInformación del rectángulo:");
        System.out.println("Ancho: " + rectangle.getWidth());
        System.out.println("Longitud: " + rectangle.getLength());
        System.out.println("Área: " + rectangle.getArea());
        System.out.println("Perímetro: " + rectangle.getPerimeter());
        System.out.println(rectangle);

        System.out.println("\nInformación del cuadrado:");
        System.out.println("Lado: " + square.getSide());
        System.out.println("Área: " + square.getArea());
        System.out.println("Perímetro: " + square.getPerimeter());
        System.out.println(square);
    }
}
