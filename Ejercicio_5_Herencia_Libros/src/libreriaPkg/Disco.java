package libreriaPkg;

public class Disco extends Publicacion{
    private float duracion;

    //Constructor


    public Disco(String titulo, double precio, float duracion) {
        super(titulo, precio);
        this.duracion = duracion;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "titulo='" + getTitulo() + '\'' +
                ", precio=" + getPrecio() +
                ", duracion=" + duracion +
                '}';
    }
}
