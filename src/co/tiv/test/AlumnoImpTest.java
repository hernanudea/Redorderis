package co.tiv.test;

import co.tiv.app.dao.Materias;
import co.tiv.app.imp.AlumnoImp;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.util.Vector;

import static org.junit.Assert.*;

/**
 * Created by hernan on 27/08/16.
 */
public class AlumnoImpTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void calcularEdad() throws Exception {
        Vector<Materias> vector = new Vector<Materias>();
        AlumnoImp alumno = new AlumnoImp("15264970", "Velasquez", "Ortiz", "Hernan", "Dario", "8577095", "Calle 10", 0, 111800, vector);
        LocalDate hoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(1979, Month.FEBRUARY, 21);

        Period periodo = Period.between(fechaNacimiento, hoy);
        assertEquals(alumno.calcularEdad(fechaNacimiento), periodo.getYears());
    }

    @Test
    public void mostrarNombre() throws Exception {
        AlumnoImp alumno = new AlumnoImp();
        alumno.setApellido1("Velásquez");
        alumno.setApellido2("Ortiz");
        alumno.setNombre1("Hernán");
        alumno.setNombre2("Darío");
        alumno.setId("15264970");
        alumno.setDireccion("Calle 10");

        assertEquals(alumno.mostrarNombre("15264970"), alumno.getNombre1());
    }

    @Test
    public void mostrarVector() throws Exception {
        Vector<Materias> vector = new Vector<Materias>();

        Materias m = new Materias("a5", "Nombre 05", 5);
        Materias n = new Materias("a2", "Nombre 02", 4);
        Materias o = new Materias("a7", "Nombre 07", 4);
        Materias p = new Materias("a8", "Nombre 08", 4);

        AlumnoImp alumno = new AlumnoImp("15264970", "Velasquez", "Ortiz", "Hernan", "Dario", "8577095", "Calle 10", 37, 111800, vector);

        alumno.agregarElementoVector(m);
        alumno.agregarElementoVector(n);
        alumno.agregarElementoVector(o);
        alumno.agregarElementoVector(p);

        assertEquals(alumno.mostrarVector(), 4);
    }

    @Test
    public void agregarElementoVector() throws Exception {

    }

    @Test
    public void mostrarNumerosMN() throws Exception {

    }

    @Test
    public void seleccionar() throws Exception {

    }

    @Test
    public void usarWhile() throws Exception {

    }

    @Test
    public void doWhile() throws Exception {

    }

}