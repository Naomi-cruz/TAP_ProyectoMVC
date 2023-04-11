package modelo;

import java.util.ArrayList;

public class Alumno {
    public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    private int numControl;
    private String nombre;
    private Especialidad especialidad;

    public Alumno(int numControl, String nombre, Especialidad especialidad) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public Alumno(){}

    public int getNumControl() {
        return numControl;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String toString(){
        return "Alumno -> {"+especialidad+", Numero de control = "+numControl+", Nombre = "+nombre+"}";
    }
    public void imprimir(){
        System.out.println(toString());
    }

    public static boolean validarAlumnonumdecontrol(int n_id) {
        String id = String.valueOf(n_id);
        for (Alumno alumno : alumnos) {
            if (String.valueOf(alumno.getNumControl()).equals(id))
            {
                return true;
            }
        }
        return false;
    }

    public static Alumno busquedaAlumno(int id_alum) {
        String n_id = String.valueOf(id_alum);
        Alumno resultado = null;
        for (Alumno alum : alumnos) {
            if (String.valueOf(alum.getNumControl()).equals(n_id)) {
                resultado = alum;
                break;
            }
        }
        return resultado;
    }
}