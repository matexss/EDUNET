package ec.edu.ups.Principal;
import ec.edu.ups.clases.*;
import ec.edu.ups.enums.Rol;
import ec.edu.ups.enums.TipoDireccion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear Instituciones
        Institucion institucion1 = new Institucion();
        institucion1.setId(1);
        institucion1.setNombre("Instituto Superior Cuenca");
        institucion1.setSedes(Arrays.asList("El Vecino", "Giron", "Baños"));

        Institucion institucion2 = new Institucion();
        institucion2.setId(2);
        institucion2.setNombre("Universidad Técnica Loja");
        institucion2.setSedes(Arrays.asList("Loja", "Zamora"));

        // Crear personas
        Estudiante estudiante = new Estudiante("estudiante@gmail.com", "Ana", "Perez", "0102030405", "0999999999", "Ingeniería");
        Docente docente = new Docente("docente@gmail.com", "Carlos", "Martinez", "0506070809", "0888888888",
                Arrays.asList("PhD", "MSc"), Arrays.asList("Sistemas", "Educación"));

        Administrativo administrativo = new Administrativo("admin@gmail.com", "Laura", "Rojas", "1122334455", "0777777777",
                Arrays.asList("Jefe de Talento Humano"), Arrays.asList("Contratación", "Evaluación"));

        Visitante visitante = new Visitante("visitante@gmail.com", "Miguel", "Torres", "1234567890", "0666666666",
                "Reunión académica", new GregorianCalendar(2025, Calendar.APRIL, 10), new GregorianCalendar(2025, Calendar.APRIL, 9));

        // Asignar direcciones
        estudiante.addDireccion(new Direccion(TipoDireccion.CASA, "Sucre", "Loja", "100", "Cuenca", "Azuay", "Ecuador"));
        docente.addDireccion(new Direccion(TipoDireccion.TRABAJO, "Bolívar", "Tarqui", "200", "Cuenca", "Azuay", "Ecuador"));
        administrativo.addDireccion(new Direccion(TipoDireccion.CASA, "Quito", "Guayaquil", "300", "Loja", "Loja", "Ecuador"));
        visitante.addDireccion(new Direccion(TipoDireccion.INSTITUCION, "Colon", "Pichincha", "400", "Loja", "Loja", "Ecuador"));

        // Crear asignaciones
        Asignacion asignacion1 = new Asignacion(estudiante, Rol.ESTUDIANTE, new GregorianCalendar(2024, Calendar.MARCH, 1));
        Asignacion asignacion2 = new Asignacion(docente, Rol.DOCENTE, new GregorianCalendar(2023, Calendar.SEPTEMBER, 15));
        Asignacion asignacion3 = new Asignacion(administrativo, Rol.ADMINISTRATIVO, new GregorianCalendar(2020, Calendar.JANUARY, 10));
        Asignacion asignacion4 = new Asignacion(visitante, Rol.VISITANTE, new GregorianCalendar(2025, Calendar.APRIL, 9));

        // Asignar personas a instituciones
        institucion1.addAsignacion(asignacion1);
        institucion1.addAsignacion(asignacion2);

        institucion2.addAsignacion(asignacion3);
        institucion2.addAsignacion(asignacion4);

        // Imprimir información de instituciones
        System.out.println("\n Información Institución 1:");
        System.out.println(institucion1);

        System.out.println("\n Información Institución 2:");
        System.out.println(institucion2);
    }
}
