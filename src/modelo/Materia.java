package modelo;

public class Materia {
    private int id;
    private String nombre;

    public Materia(){
    }

    public Materia(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Materia{" + "Id: "+ id+ ", nombre: "+ nombre + "}";
    }
}
