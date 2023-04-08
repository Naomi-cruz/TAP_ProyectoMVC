package modelo;

public class Grupo {
    private String clave;
    private Materia materia;
    private Catedratico catedratico;
    private int hora;
    private int salon;
    Alumno alumnos[];

    public Grupo() {
    }
    public Grupo(String clave, int hora, int salon){
        this.clave = clave;
        this.hora = hora;
        this.salon = salon;
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
        return "Grupo{"+"clave= "+clave+",hora="+hora+",salon="+salon+'}';
    }
    public void imprimir(){
        System.out.println(toString());
    }
}
