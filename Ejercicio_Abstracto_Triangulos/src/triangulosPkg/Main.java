package triangulosPkg;

public class Main {
    public static void main(String[] args) {
        // Instancia triángulo escaleno
        Escaleno escaleno = new Escaleno(5, 6, 7, 0);

        System.out.println("Triángulo Escaleno:");
        System.out.println("Perímetro: " + escaleno.perimetro());
        System.out.println("Área hipotenusa: " + escaleno.calcularAreaConHipotenusa(escaleno.getLado1(), escaleno.getHipotenusa()));
        System.out.println("Área Real: " + escaleno.calcularAreaSinHipotenusa());

        // Instancia triángulo acutángulo
        Acutangulo acutangulo = new Acutangulo(3, 4, 5, 0);

        System.out.println("\nTriángulo Acutángulo:");
        System.out.println("Perímetro: " + acutangulo.perimetro());
        System.out.println("Área con Hipotenusa: " + acutangulo.calcularAreaConHipotenusa(escaleno.getLado1(), escaleno.getHipotenusa()));
        System.out.println("Área Real: " + acutangulo.calcularAreaSinHipotenusa());
    }
}
