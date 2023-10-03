package formasPkg;

public class CilindroHueco extends Cilindro{
    private double espacioHueco;

    public CilindroHueco(double radius, double height, double espacioHueco) {
        super(radius, height);
        this.espacioHueco = espacioHueco;
    }
    //Getters and setters
    public double getEspacioHueco() {
        return espacioHueco;
    }

    public void setEspacioHueco(double espacioHueco) {
        this.espacioHueco = espacioHueco;
    }

}
