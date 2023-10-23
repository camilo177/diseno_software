package facultadPkg;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Instancias
        Profesor profesor = new Profesor("Carlos", "Rodriguez",01, "Casado", 2001, 2, "Matemáticas");
        List<String> cursos = new ArrayList<>();
        cursos.add("Cálculo 1");
        cursos.add("Requisitos");
        Estudiante estudiante = new Estudiante("Camilo", "López",011, "Soltero", cursos);
        PersonalServicio personalServicio = new PersonalServicio("Daniel", "Pérez",021, "Casado", 2002, 3, "Biblioteca");

        //Profesor métodos
        System.out.println("Profesor: " + profesor);
        profesor.cambioDepartamento("Biología");
        profesor.cambioEstadoCivil("Divorciado");
        System.out.println("Profesor con cambios: " + profesor);

        //Estudiante
        System.out.println("Estudiante: " + estudiante);
        estudiante.matricula("Algebra Lineal");
        System.out.println("Estudiante con matrícula: " + estudiante);

        //Personal Servicio
        System.out.println("Personal de servicio: " + personalServicio);
        personalServicio.trasladoSeccion("Baños");
        personalServicio.cambioEstadoCivil("Soltero");
        System.out.println("Personal de Servicio con cambios: " + personalServicio);
    }
}
