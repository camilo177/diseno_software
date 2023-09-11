package personaPkg;
import java.util.Random;
public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private final String DNI;
    private char sexo;
    private double peso;
    private double altura;

    // Constantes
    private static final char SEXO_DEFECTO = 'H';
    private static final int PESO_IDEAL_BAJO = -1;
    private static final int PESO_IDEAL_NORMAL = 0;
    private static final int PESO_IDEAL_ALTO = 1;

    // Constructores
    public Persona() {
        this("", 0, SEXO_DEFECTO, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos públicos
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return PESO_IDEAL_BAJO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL_NORMAL;
        } else {
            return PESO_IDEAL_ALTO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + " años\n" +
                "DNI: " + DNI + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + " kg\n" +
                "Altura: " + altura + " m\n";
    }

    // Métodos privados
    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SEXO_DEFECTO;
        }
    }

    private String generaDNI() {
        Random rand = new Random();
        StringBuilder dniBuilder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            dniBuilder.append(rand.nextInt(10));
        }
        // Calcula la letra del DNI
        int dniNum = Integer.parseInt(dniBuilder.toString());
        int resto = dniNum % 23;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraDNI = letras.charAt(resto);
        return dniNum + String.valueOf(letraDNI);
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

