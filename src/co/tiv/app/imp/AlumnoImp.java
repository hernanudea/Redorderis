package co.tiv.app.imp;

import co.tiv.app.dao.Materias;
import co.tiv.app.dao.Persona;
import co.tiv.app.inter.PersonaInt;
import com.sun.xml.internal.bind.v2.TODO;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Vector;

/**
 * Created by hernan on 27/08/16.
 */
public class AlumnoImp extends Persona implements PersonaInt{

    private int valorMatricula;
    private Vector<Materias> vectorMaterias = new Vector<Materias>();

    /**
     * construstor con todos los parametros
     * @param id
     * @param apellido1
     * @param apellido2
     * @param nombre1
     * @param nombre2
     * @param telefono
     * @param direccion
     * @param edad
     * @param valorMatricula
     * @param vectorMaterias
     */
    public AlumnoImp(String id, String apellido1, String apellido2, String nombre1, String nombre2, String telefono, String direccion, int edad, int valorMatricula, Vector<Materias> vectorMaterias) {
        super(id, apellido1, apellido2, nombre1, nombre2, telefono, direccion, edad);
        this.valorMatricula = valorMatricula;
        this.vectorMaterias = vectorMaterias;
    }

    public AlumnoImp() {

    }

    @Override
    public int calcularEdad(LocalDate fechaNacimiento) {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        this.setEdad(periodo.getYears());
        System.out.print("La edad de " + this.getNombre1() + " " + getApellido1()+ " es " + this.getEdad());
        return this.getEdad();
    }

    @Override
    public String mostrarNombre(String id) {
        System.out.println("El nombre es:\t"+ this.getNombre1()+" "+getNombre2()+" "+getApellido1()+".");
        return this.getNombre1();
    }

    public int mostrarVector(){
        for (Materias materia: vectorMaterias){
            System.out.print("Código:\t"+materia.getCodigo());
            System.out.print("\tNombre:\t"+materia.getNombre());
            System.out.println("\tCreditos:\t"+materia.getCreditos());
        }
        return vectorMaterias.size();
    }


    /**
     * ingresa un objeto del tipo materia a el vector del objeto alumno
     * @param materia parametro recibo
     * @return false si se presenta error, true si se agrega la amteria satisfactoriamente
     */
    public boolean agregarElementoVector(Materias materia){
        try {
            vectorMaterias.add(materia);
            System.out.println("La materia con nombre: " + materia.getNombre()+" fue agregada correctamente");
            return true;
        }catch (Exception e){
            System.out.println("La materia nmo se puedo ingresar:"+ e.getMessage());
            return false;
        }

    }

    /**
     * metodo estatico, no es necesario crear la instancia para ejecutarlo
     * @param m numero desde donde se muestran los numeros
     * @param n numero hasta donde se muestran los numeros
     */
    public static int mostrarNumerosMN(int m, int n){
        int contador=0;
        for (int i = m; i <=n; i++) {
            System.out.println(i + ".");
            contador++;
        }
        return contador;
    }

    public static String seleccionar(int valor){
        switch (valor){
            case 1:
                System.out.println("El valor es:\t"+"Lunes");
                return "Lunes";
                //break;
            case 2:
                System.out.println("El valor es:\t"+"Martes");
                return "Martes";
                //break;
            case 3:
                System.out.println("El valor es:\t"+"Miercoles");
                return "Miercoles";
                //break;
            case 4:
                System.out.println("El valor es:\t"+"Jueves");
                return "Jueves";
                //break;
            case 5:
                System.out.println("El valor es:\t"+"Viernes");
                return "Viernes";
               // break;
            case 6:
                System.out.println("El valor es:\t"+"Sabado");
                return "Sabado";
                //break;
            case 7:
                System.out.println("El valor es:\t"+"Domingo");
                return "Domingo";
                //break;
            default:
                System.out.println("El valor no corresponde a un dia de la semana");
                return "Otro";
        }
    }

    public static int usarWhile(int m, int n){
        int contador = m;
        while (contador<n){
            System.out.println("El valor es" + contador+".");
            contador++;
        }
        return contador;
    }

    public static int doWhile(int m, int n){

        if (m>=n){
            System.out.println("Los parametros no cumplen. el primero debe ser menor");
        }else{
            int contador = m;
            do {
                System.out.println("El valor es: " + contador+".");
                contador++;
            }while (contador<n);
            return contador;
        }
        return 0;//Integer.parseInt(null);
    }

    public int getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(int valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public Vector<Materias> getVectorMaterias() {
        return vectorMaterias;
    }

    public void setVectorMaterias(Vector<Materias> vectorMaterias) {
        this.vectorMaterias = vectorMaterias;
    }

}
