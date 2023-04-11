package modelo;

import java.util.ArrayList;

public class Grupo {
    public static ArrayList<Grupo> grupos = new ArrayList<Grupo>();
    private String clave;
    private Materia materia;
    private Catedratico catedratico;
    private int hora;
    private int salon;
    //public Alumno[] alumnos;
    public static ArrayList<Alumno> alumnosgrupo = new ArrayList<Alumno>();

    public Grupo() {
    }
    public Grupo(String clave, int hora, int salon, Materia materia, Catedratico catedratico){
        this.clave = clave;
        this.hora = hora;
        this.salon = salon;
        this.materia = materia;
        this.catedratico = catedratico;
    }
    public String getClave() {
        return clave;
    }
    public int getHora(){
        return hora;
    }
    public int getSalon(){
        return salon;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    @Override
    public String toString(){
        return "Grupo -> {"+"Clave = "+clave+", Hora = "+hora+", Salon = "+salon+", "+materia+", "+catedratico+"}\nAlumnos: \n"+alumnosgrupo+'}';
    }
    public void imprimir(){
        System.out.println(toString());
    }

    public static boolean buscarGrupo(int n_salon, int s_hora) {
        String num_salon = String.valueOf(n_salon);
        String horario = String.valueOf(s_hora);
        for (Grupo grup : grupos) {
            if (String.valueOf(grup.getHora()).equals(horario) && String.valueOf(grup.getSalon()).equals(num_salon))
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

    public static boolean buscarAlumno(int n_id) {
        String id = String.valueOf(n_id);
        for (Alumno esp : alumnosgrupo) {
            if (String.valueOf(esp.getNumControl()).equals(id))
            {
                return true;
            }
        }
        return false;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public static boolean validarGrupoclave(String n_rfc) {
        for (Grupo gru : grupos ) {
            if (gru.getClave().equals(n_rfc))
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

        public static Grupo busquedaGrupo(String clave) {
        Grupo resultado = null;
        for (Grupo grup : grupos) {
            if (grup.getClave().equals(clave)) {
                resultado = grup;
                break;
            }
        }
        return resultado;
    }
}
