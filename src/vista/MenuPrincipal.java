package vista;

import controlador.*;
import modelo.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static controlador.ControladorAlumno.alumnos;
import static controlador.ControladorCatedratico.catedraticos;
import static controlador.ControladorEspecialidad.especialidades;
import static controlador.ControladorGrupo.grupos;
import static controlador.ControladorMateria.materias;

public class MenuPrincipal extends JFrame {
    private JMenuBar barraMenu;
    private JMenu menuPrincipal;
    private JMenuItem itemGrupo;
    private JMenuItem itemAlumno;
    private JMenuItem itemEspecialidad;
    private JMenuItem itemCatedratico;
    private JMenuItem itemMateria;

    private  JMenuItem itemMostrar;

    private JButton btn1;

    public static void listarBD1(){
        for (int i=0; i<especialidades.size(); i++){
            System.out.println(especialidades.get(i).toString());

        }

        for (int i=0; i<alumnos.size(); i++){
            System.out.println(alumnos.get(i).toString());
        }

        for (int i=0; i<grupos.size(); i++){
            System.out.println(grupos.get(i).toString());
        }

        for (int i=0; i<catedraticos.size(); i++){
            System.out.println(catedraticos.get(i).toString());
        }

        for (int i=0; i<materias.size(); i++){
            System.out.println(materias.get(i).toString());
        }
    }


    public MenuPrincipal() {
        super("Base de datos: Proyecto Escolar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 350);
        setLocation(400, 250);

        barraMenu = new JMenuBar();
        menuPrincipal = new JMenu("-Opciones-");
        itemGrupo = new JMenuItem("Grupo");
        itemGrupo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Grupos registrados ---------");
                Grupo grupo = new Grupo();
                VistaGrupo vistag = new VistaGrupo();
                ControladorGrupo controladorg = new ControladorGrupo(grupo,vistag);
            }
        });

        itemAlumno = new JMenuItem("Alumno");
        itemAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Alumnos registrados ---------");
                Alumno alumno = new Alumno();
                VistaAlumno vista = new VistaAlumno();
                ControladorAlumno controlador = new ControladorAlumno(alumno,vista);
            }
        });

        itemEspecialidad = new JMenuItem("Especialidad");
        itemEspecialidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Especialidades registrados ---------");
                Especialidad especialidad = new Especialidad();
                VistaEspecialidad vista = new VistaEspecialidad();
                ControladorEspecialidad controlador = new ControladorEspecialidad(especialidad,vista);
            }
        });

        itemMostrar = new JMenuItem("Mostrar listado de base de datos");
        itemMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Base de datos ---------");
                listarBD1();
            }
        });

        itemCatedratico = new JMenuItem("Catedratico");
        itemCatedratico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Catedraticos registrados ---------");
                Catedratico alumno = new Catedratico();
                VistaCatedratico vista = new VistaCatedratico();
                ControladorCatedratico controladorc = new ControladorCatedratico(alumno,vista);
            }
        });

        itemMateria = new JMenuItem("Materia");
        itemMateria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Materias registrados ---------");
                Materia materia = new Materia();
                VistaMateria vista = new VistaMateria();
                ControladorMateria controlador = new ControladorMateria(materia,vista);
            }
        });



        menuPrincipal.add(itemGrupo);
        menuPrincipal.add(itemAlumno);
        menuPrincipal.add(itemEspecialidad);
        menuPrincipal.add(itemMostrar);
        menuPrincipal.add(itemCatedratico);
        menuPrincipal.add(itemMateria);


        barraMenu.add(menuPrincipal);
        this.setJMenuBar(barraMenu);


        setVisible(true);

    }
}
