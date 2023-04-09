package controlador;

import modelo.Grupo;
import vista.MenuPrincipalGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static controlador.ControladorAlumno.alumnos;
import static controlador.ControladorCatedratico.catedraticos;
import static controlador.ControladorEspecialidad.especialidades;
import static controlador.ControladorGrupo.grupos;
import static controlador.ControladorMateria.materias;

public class ControladorMenuGUI implements ActionListener {

    private final MenuPrincipalGUI menuGUI;

    public ControladorMenuGUI(MenuPrincipalGUI menuGUI) {
        this.menuGUI = menuGUI;
        this.menuGUI.mostrarButton.addActionListener(this);
        this.menuGUI.salirButton.addActionListener(this);
    }
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

    public void actionPerformed(ActionEvent e) {

        if (this.menuGUI.mostrarButton == e.getSource()){
            System.out.println("\n----------- Base de datos ---------");
            listarBD1();
        }

        if (this.menuGUI.salirButton == e.getSource()){
            salir();
        }

    }

    public void salir(){
        System.exit(0);
    }
}
