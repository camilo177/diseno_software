package libreriaPkg;

public class Libro extends Publicacion{

    private int numeroPaginas;
    private int anoPublicacion;

    //Constructor
    public Libro(String titulo, double precio, int numeroPaginas, int anoPublicacion) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacion = anoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    @Override
    public String toString() {
        return "Libro [Título: " + getTitulo() + ", Precio: " + getPrecio() +
                ", Número de Páginas: " + numeroPaginas + ", Año de Publicación: " + anoPublicacion + "]";
    }
}
