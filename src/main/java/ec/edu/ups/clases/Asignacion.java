package ec.edu.ups.clases;
import ec.edu.ups.enums.Rol;

import java.util.GregorianCalendar;

public class Asignacion {
    private Persona persona;
    private Rol rol;
    private GregorianCalendar fechaInicio;

    public Asignacion() {}

    public Asignacion(Persona persona, Rol rol, GregorianCalendar fechaInicio) {
        this.persona = persona;
        this.rol = rol;
        this.fechaInicio = fechaInicio;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Asignacion{" +
                "persona=" + persona +
                ", rol=" + rol +
                ", fechaInicio=" + fechaInicio +
                '}';
    }
}
