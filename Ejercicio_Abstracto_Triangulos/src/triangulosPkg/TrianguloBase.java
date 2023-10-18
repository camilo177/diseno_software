package triangulosPkg;

public abstract class TrianguloBase {
    private int lado1;
    private int lado2;
    private int lado3;
    private int hipotenusa;

    public TrianguloBase(int lado1, int lado2, int lado3, int hipotenusa) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.hipotenusa = hipotenusa;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(int hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public abstract double perimetro();

    public double calcularAreaConHipotenusa(int lado, int hipotenusa) {
        return 0;
    }

    // Método para calcular el área de un triángulo escaleno y acutángulo usando la fórmula de Herón.
    public double calcularAreaSinHipotenusa() {
        double a = getLado1();
        double b = getLado2();
        double c = getLado3();
        double s = perimetro() / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
