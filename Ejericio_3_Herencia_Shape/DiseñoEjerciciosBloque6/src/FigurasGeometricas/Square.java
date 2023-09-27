package FigurasGeometricas;

public class Square extends Rectangle {
    public Square() {
        // Llamamos al constructor de Rectangle con el mismo valor para width y length
        super();
    }

    public Square(double side) {
        // Llamamos al constructor de Rectangle con el mismo valor para width y length
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        // Llamamos al constructor de Rectangle con el mismo valor para width y length
        super(side, side, color, filled);
    }

    // El método setWidth se hereda de Rectangle y establece el mismo valor para width y length
    // El método setLength se hereda de Rectangle y establece el mismo valor para width y length

    public double getSide() {
        // El lado es igual al valor de width o length, ya que son iguales en un cuadrado
        return getWidth(); // o también se podría usar getLength()
    }

    public void setSide(double side) {
        // Establecer el mismo valor para width y length
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
