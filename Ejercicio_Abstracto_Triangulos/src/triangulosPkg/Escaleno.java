package triangulosPkg;

public class Escaleno extends TrianguloBase {
    public Escaleno(int lado1, int lado2, int lado3, int hipotenusa) {
        super(lado1, lado2, lado3, hipotenusa);
    }

    @Override
    public double perimetro() {
        // El perímetro de un triángulo escaleno es la suma de sus lados
        return getLado1() + getLado2() + getLado3();
    }

    @Override
    public double calcularAreaConHipotenusa(int lado, int hipotenusa) {
        System.out.println("Los triángulos escalenos no tienen hipotenusa.");
        return 0;
    }

    @Override
    public double calcularAreaSinHipotenusa() {
        return super.calcularAreaSinHipotenusa();
    }
}
