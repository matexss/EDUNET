package ec.edu.ups.clases;
import java.util.List;
public class Docente extends Persona {
    private List<String> titulosAcademicos;
    private List<String> areasdeEspecializacion;

    public Docente() {}


    public Docente(String correoElectronico, String nombre, String apellido, String cedula, String telefono, List<String> titulosAcademicos, List<String> areasdeEspecializacion) {
        super(correoElectronico, nombre, apellido, cedula, telefono);
        this.titulosAcademicos = titulosAcademicos;
        this.areasdeEspecializacion = areasdeEspecializacion;
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasdeEspecializacion() {
        return areasdeEspecializacion;
    }

    public void setAreasdeEspecializacion(List<String> areasdeEspecializacion) {
        this.areasdeEspecializacion = areasdeEspecializacion;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "titulosAcademicos=" + titulosAcademicos +
                ", areasdeEspecializacion=" + areasdeEspecializacion +
                '}';
    }
}
