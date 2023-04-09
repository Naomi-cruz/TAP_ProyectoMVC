package modelo;

import java.util.ArrayList;

public class Alumno {
    public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    private int numControl;
    private String nombre;
    private int especialidad;

    public Alumno(int numControl, String nombre, int especialidad) {
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

    public int getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public String toString(){
        return "Alumno{"+"Especialidad="+especialidad+", Numero de control: "+numControl+", nombre="+nombre+"}";
    }
    public void imprimir(){
        System.out.println(toString());
    }

    public static boolean buscarAlumnonumdecontrol(int n_id) {
        String id = String.valueOf(n_id);
        for (Alumno alumno : alumnos) {
            if (String.valueOf(alumno.getNumControl()).equals(id))
            {
                //System.out.println("Este id ya existe: " + esp.getId());
                return true;
            }else{
                //System.out.println("Este id aun no existe");
                return false;
            }
        }
        return false;
    }
}