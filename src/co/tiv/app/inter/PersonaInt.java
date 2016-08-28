package co.tiv.app.inter;

import java.time.LocalDate;

/**
 * Created by hernan on 27/08/16.
 */
public interface PersonaInt {

    public int calcularEdad(LocalDate fechaNacimiento);

    public String mostrarNombre(String id);

}
