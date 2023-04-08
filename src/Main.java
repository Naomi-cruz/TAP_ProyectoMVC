import controlador.ControladorAlumno;
import controlador.ControladorGrupo;
import modelo.*;
import vista.VistaAlumno;
import vista.VistaGrupo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.System.*;

public class Main {

    public static BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedReader dataString = new BufferedReader(new InputStreamReader(System.in));
    //public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    public static ArrayList<Especialidad> especialidades = new ArrayList<Especialidad>();
    public static ArrayList<Materia> materias = new ArrayList<Materia>();
    public static ArrayList<Catedratico> catedraticos = new ArrayList<Catedratico>();
    //public static ArrayList<Grupo> grupos = new ArrayList<Grupo>();

    public static void main(String[] args) throws IOException {
        int opc=0;
        do {
            opc = menu();
            switch (opc){
                case 1:
                    altaEspecialidad();
                    break;
                case 2:
                    Alumno alumno = new Alumno();
                    VistaAlumno vista = new VistaAlumno();
                    ControladorAlumno controlador = new ControladorAlumno(alumno,vista);

                    //altaAlumno();

                    break;
                case 3:
                    altaCatedratico();
                    break;
                case 4:
                    altaMateria();
                    break;
                case 5:
                    Grupo grupo = new Grupo();
                    VistaGrupo vistag = new VistaGrupo();
                    ControladorGrupo controladorg = new ControladorGrupo(grupo,vistag);
                    //altaGrupo();
                    break;
                case 6:
                    //listarBD();
                    break;
                case 7:
                    out.println("\nAdios");
                    break;
                default:
                    out.println("\nOpcion no vañidad\n");
            }


        } while (opc != 7);

    }
    public static int menu() throws IOException {
        out.println("\n-------------MENU PRINCIPAL-----------");
        out.println("1. Alta Especialidad");
        out.println("2. Alta Alumno");
        out.println("3. Alta Catedratico");
        out.println("4. Alta materia");
        out.println("5. Alta Grupo");
        out.println("6. Lista base de datos");
        out.println("7. Salir");
        out.println("Deme una opcion:");

        return Integer.parseInt(data.readLine());
    }

    public static void altaEspecialidad() throws IOException {
        out.println("id: ");
        int id = Integer.parseInt(data.readLine());
        out.println("Nombre: ");
        String nombre = dataString.readLine();
        especialidades.add(new Especialidad(id,nombre));
    }


    public static void altaCatedratico() throws IOException {
        out.println("RFC: ");
        String RFC = dataString.readLine();
        out.println("Nombre: ");
        String nombre = dataString.readLine();
        catedraticos.add(new Catedratico(RFC,nombre));
    }

    public static void altaMateria() throws IOException {
        out.println("id: ");
        int id = Integer.parseInt(data.readLine());
        out.println("Nombre: ");
        String nombre = dataString.readLine();
        materias.add(new Materia(id,nombre));
    }

   /* public static void altaGrupo() throws IOException {
        out.println("Clave: ");
        String clave = dataString.readLine();
        out.println("Hora: ");
        int hora = Integer.parseInt(data.readLine());
        out.println("Salon: ");
        int salon = Integer.parseInt(data.readLine());
        grupos.add(new Grupo(clave,hora,salon));
    }*/

    /*public static void listarBD(){
        for (int i=0; i<especialidades.size(); i++){
            out.println(especialidades.get(i).toString());
        }

        for (int i=0; i<materias.size(); i++){
            out.println(materias.get(i).toString());
        }

        for (int i=0; i<alumnos.size(); i++){
            out.println(alumnos.get(i).toString());
        }

        for (int i=0; i<catedraticos.size(); i++){
            out.println(catedraticos.get(i).toString());
        }

        for (int i=0; i<grupos.size(); i++){
            out.println(grupos.get(i).toString());
        }
    }
    public static void altaAlumno() throws IOException {
        Especialidad especialidad;
        out.println("numControl: ");
        int numControl = Integer.parseInt(data.readLine());
        out.println("Nombre: ");
        String nombre = dataString.readLine();
        out.println("id Especialidad: ");
        int idEspecialidad = Integer.parseInt(data.readLine());
        alumnos.add(new Alumno(numControl,nombre,especialidades.get(idEspecialidad-1)));
    }*/
}