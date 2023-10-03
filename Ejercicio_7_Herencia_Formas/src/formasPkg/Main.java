package formasPkg;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Cilindro cilindro = new Cilindro(circulo.getRadius(), 5);
        CilindroHueco cilindroHueco = new CilindroHueco(cilindro.getRadius(), cilindro.getHeight(), 10);

        System.out.println("El area del círculo es: " + circulo.getArea());
        System.out.println("La circunferencia del círculo es: " + circulo.getCircumference());
        System.out.println("El area del cilindro es: " + cilindro.getArea());
    }
}
