package datosPkg;

public class Direccion extends Nombre{
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;

    //Constructor
    public Direccion(String nombre, String primerApellido, String segundoApellido, String calle, String ciudad, String provincia, String codigoPostal) {
        super(nombre, primerApellido, segundoApellido);
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void nuevaDireccion(String ciudad, String calle, String provincia,
                               String codigoPostal) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

    public void nuevoNombre(String nombre, String primerApellido, String segundoApellido) {
        super.setNombre();
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + "\n" +
                "Calle: " + calle + "\n" +
                "Ciudad: " + ciudad + "\n" +
                "Provincia: " + provincia + "\n" +
                "Código Postal: " + codigoPostal;
    }

}
