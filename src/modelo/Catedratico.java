package modelo;

import java.util.ArrayList;

public class Catedratico {
    public static ArrayList<Catedratico> catedraticos = new ArrayList<Catedratico>();

    private String RFC;
    private String nombre;

    public Catedratico() {
    }

    public Catedratico(String RFC, String nombre) {
        this.RFC = RFC;
        this.nombre = nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Catedratico -> {" + "RFC = " + RFC + ", Nombre = " + nombre + '}';
    }

    public static boolean validarCatedraticoRFC(String n_rfc) {
        for (Catedratico cate : catedraticos ) {
            if (cate.getRFC().equals(n_rfc))
            {
                return true;
            }
        }
        return false;
    }

    public static Catedratico busquedaCatedratico(String rfc) {
        Catedratico resultado = null;
        for (Catedratico cate : catedraticos) {
            if (cate.getRFC().equals(rfc)) {
                resultado = cate;
                break;
            }
        }
        return resultado;
    }
}