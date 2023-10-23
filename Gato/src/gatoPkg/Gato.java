package gatoPkg;

public class Gato {

    private String nombre;
    private String genero;
    private int edad;
    private String color;
    private float peso;

    public Gato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //Métodos
    public void respirar() {
        System.out.println("Estoy Respirando");
    }

    public void comer(String comida) {
        System.out.println("Estoy comiendo " + comida);
    }

    public void correr(String destino) {
        System.out.println("Estoy corriendo hacia " + destino);
    }

    public void dormir(int horas) {
        System.out.println("Estoy durmiendo durante " + horas + " horas");
    }

    public void maullar() {
        System.out.println("Meow");
    }

}