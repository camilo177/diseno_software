package facultadPkg;
import java.util.List;

public class Estudiante extends Persona{
    private List<String> cursos;

    public Estudiante(String nombre, String apellido, double ID, String estadoCivil, List<String> cursos) {
        super(nombre, apellido, ID, estadoCivil);
        this.cursos = cursos;
    }

    //Getter y setter
    public List<String> getCursos() {
        return cursos;
    }

    public void setCursos(List<String> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", ID=" + getID() +
                ", estadoCivil='" + getEstadoCivil() + '\'' +
                ", cursos=" + cursos +
                '}';
    }

    //Método para añadir cursos
    public void matricula(String curso) {
        cursos.add(curso);
    }
}
