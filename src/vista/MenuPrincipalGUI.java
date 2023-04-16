package vista;

import javax.swing.*;
import javax.swing.border.Border;

import controlador.*;
import modelo.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipalGUI extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelCentral;
    public JButton salirButton;
    public JButton mostrarButton;
    private JPanel panelSur;
    private JMenuBar barraMenu;
    private JMenu menuPrincipal;
    private JMenuItem itemGrupo;
    private JMenuItem itemAlumno;
    private JMenuItem itemEspecialidad;
    private JMenuItem itemCatedratico;
    private JMenuItem itemMateria;

    //cosas que se agregaron

    private JMenu nuevo;
    private JMenuItem itemDardealta;
    private JMenu grupo;

    //experimento


   public MenuPrincipalGUI() {
        super("BD: Proyecto Escolar");

        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 260);
        setLocation(500, 250);
        setResizable(false);

        barraMenu = new JMenuBar();
        menuPrincipal = new JMenu("-Opciones de registro-");

       barraMenu.setBackground(Color.GRAY);
       menuPrincipal.setFont(new Font("Tw Cent MT", 1,13));
       menuPrincipal.setForeground(Color.WHITE);
        //173,215,239


        itemGrupo = new JMenuItem("Grupo alta");
        nuevo = new JMenu("Grupo");

        nuevo.add(itemGrupo);
        itemGrupo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Grupos ---------");
                Grupo grupo = new Grupo();
                VistaGrupo vistag = new VistaGrupo();
                ControladorGrupo controladorg = new ControladorGrupo(grupo,vistag);
            }
        });

        itemAlumno = new JMenuItem("Alumno");
        itemAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Alumnos  ---------");
                Alumno alumno = new Alumno();
                VistaAlumno vista = new VistaAlumno();
                ControladorAlumno controlador = new ControladorAlumno(alumno,vista);
            }
        });

        itemDardealta = new JMenuItem("Asignación alumno");
        nuevo.add(itemDardealta);

       itemDardealta.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println("\n---------- ---------");
               MenuAlumnoalta menualta = new MenuAlumnoalta();
               ControladorMenuAlumnoalta vistag = new ControladorMenuAlumnoalta(menualta);
           }
       });

        itemEspecialidad = new JMenuItem("Especialidad");
        itemEspecialidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Especialidades ---------");
                Especialidad especialidad = new Especialidad();
                VistaEspecialidad vista = new VistaEspecialidad();
                ControladorEspecialidad controlador = new ControladorEspecialidad(especialidad,vista);
            }
        });

        itemCatedratico = new JMenuItem("Catedrático");
        itemCatedratico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Catedráticos ---------");
                Catedratico alumno = new Catedratico();
                VistaCatedratico vista = new VistaCatedratico();
                ControladorCatedratico controladorc = new ControladorCatedratico(alumno,vista);
            }
        });

        itemMateria = new JMenuItem("Materia");
        itemMateria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n----------- Materias ---------");
                Materia materia = new Materia();
                VistaMateria vista = new VistaMateria();
                ControladorMateria controlador = new ControladorMateria(materia,vista);
            }
        });

        menuPrincipal.add(itemAlumno);
        menuPrincipal.add(itemCatedratico);
        menuPrincipal.add(itemEspecialidad);
        menuPrincipal.add(itemMateria);
        menuPrincipal.add(nuevo);

        barraMenu.add(menuPrincipal);
        this.setJMenuBar(barraMenu);

        setVisible(true);

    }

}
