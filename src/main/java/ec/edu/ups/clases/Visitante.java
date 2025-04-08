package ec.edu.ups.clases;
import java.util.GregorianCalendar;
public class Visitante extends Persona {
    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;
    public Visitante() {}

    public Visitante(String correoElectronico, String nombre, String apellido, String cedula, String telefono, String motivo, GregorianCalendar fechaSalida, GregorianCalendar fechaEntrada) {
        super(correoElectronico, nombre, apellido, cedula, telefono);
        this.motivo = motivo;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Visitante{" +
                "motivo='" + motivo + '\'' +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                '}';
    }
}
