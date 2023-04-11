package modelo;

import java.util.ArrayList;


public class Materia {
    public static ArrayList<Materia> materias = new ArrayList<Materia>();

    private int id_materia;
    private String nombre;

    public Materia(){
    }

    public Materia(int id_materia, String nombre){
        this.id_materia = id_materia;
        this.nombre = nombre;
    }

    public int getId_materia() {
        return id_materia;
    }
    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString(){
        return "Materia -> {" + "Id: "+ id_materia+ ", Nombre: "+ nombre + "}";
    }

    public static boolean validarMateriaID(int n_id) {
        String id = String.valueOf(n_id);
        for (Materia mat : materias) {
            if (String.valueOf(mat.getId_materia()).equals(id))
            {
                return true;
            }
        }
        return false;
    }

    public static Materia busquedaMateria(int id_Demateria) {
        String id_nuevo = String.valueOf(id_Demateria);
        Materia resultado = null;
        for (Materia mate : materias) {
            if (String.valueOf(mate.getId_materia()).equals(id_nuevo)) {
                resultado = mate;
                break;
            }
        }
        return resultado;
    }
}
