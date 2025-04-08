package ec.edu.ups.clases;

public class Estudiante extends Persona {
private String carrera;
public Estudiante() {}

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(String correoElectronico, String nombre, String apellido, String cedula, String telefono, String carrera) {
        super(correoElectronico, nombre, apellido, cedula, telefono);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                '}';
    }
}
