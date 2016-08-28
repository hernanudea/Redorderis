package co.tiv.app.dao;

/**
 * Created by hernan on 27/08/16.
 */
public class Persona {
    private String id;
    private String apellido1;
    private String apellido2;
    private String nombre1;
    private String nombre2;
    private String telefono;
    private String direccion;
    private int edad;

    /**
     * metodo constructor vacio
     */
    public Persona() {
    }

    /**
     * metodo constructor con todos los parametros
     * @param id
     * @param apellido1
     * @param apellido2
     * @param nombre1
     * @param nombre2
     * @param telefono
     * @param direccion
     * @param edad
     */
    public Persona(String id, String apellido1, String apellido2, String nombre1, String nombre2, String telefono, String direccion, int edad) {
        this.id = id;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
