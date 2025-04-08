package ec.edu.ups.clases;
import java.util.List;
public class Administrativo extends Persona {
    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo() {}

    public Administrativo(String correoElectronico, String nombre, String apellido, String cedula, String telefono, List<String> cargos, List<String> responsabilidades) {
        super(correoElectronico, nombre, apellido, cedula, telefono);
        this.cargos = cargos;
        this.responsabilidades = responsabilidades;
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "cargos=" + cargos +
                ", responsabilidades=" + responsabilidades +
                '}';
    }
}
