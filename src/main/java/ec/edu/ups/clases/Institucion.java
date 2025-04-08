package ec.edu.ups.clases;
import java.util.List;
public class Institucion {
    private int id;
    private String nombre;
    private List<String> sedes;
    private String direccion;
    private List<Asignacion> asignaciones;

    public Institucion() {}

    public Institucion(int id, String nombre, List<Asignacion> asignaciones, List<String> sedes, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.asignaciones = asignaciones;
        this.sedes = sedes;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sedes=" + sedes +
                ", direccion='" + direccion + '\'' +
                ", asignaciones=" + asignaciones +
                '}';
    }
}


