package circleExericisePkg;
import java.util.Scanner;
//Aplicación para círculos

public class CircleExercise {
    public CircleExercise(){
//Constructor
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Circle circleOne = new Circle();
        System.out.println("Ingrese radio: ");
        circleOne.setRadius(teclado.nextDouble());
        System.out.println("El radio es: " + circleOne.toString());
        System.out.println("El área del círculo 1 es: " + circleOne.getArea());
        System.out.println("La circunferencia del círculo 1 es: " + circleOne.getCircumference());
    }
}
