package modelo;

import java.util.ArrayList;

public class Especialidad {

    public static ArrayList<Especialidad> especialidades = new ArrayList<Especialidad>();
    private int id;
    private String nombre;
    public Especialidad(){

    }
    public Especialidad(int id){
        this.id=id;
    }
    public Especialidad(int id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;

    }
    public static boolean buscarEspecialidadID(int n_id) {
        String id = String.valueOf(n_id);
        for (Especialidad esp : especialidades) {
            if (String.valueOf(esp.getId()).equals(id))
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
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString(){
        return "Especialidad{"+"id = "+id+", Nombre = "+nombre+"}";
    }
    public void imprimir(){
        System.out.println(toString());
    }

}
