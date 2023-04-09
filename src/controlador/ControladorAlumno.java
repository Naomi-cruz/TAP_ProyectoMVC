package controlador;

import modelo.Alumno;
import modelo.Especialidad;
import vista.MenuPrincipalGUI;
import vista.VistaAlumno;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static modelo.Alumno.alumnos;


public class ControladorAlumno implements ActionListener {

    private final Alumno alumno;
    private final VistaAlumno vista;
    public ControladorAlumno(Alumno alumno, VistaAlumno vista) {
        this.alumno = alumno;
        this.vista = vista;
        this.vista.guardarButton.addActionListener(this);
        this.vista.limpiarButton.addActionListener(this);
        this.vista.salirButton.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.vista.limpiarButton == e.getSource()){
            limpiar();
        }

        if (this.vista.guardarButton == e.getSource()){
            if (Alumno.buscarAlumnonumdecontrol(Integer.parseInt(vista.txfNumecontrol.getText())) == false) {
                alumno.setNumControl(Integer.parseInt(vista.txfNumecontrol.getText()));
                alumno.setNombre((vista.txfNumecontrol.getText()));
                alumno.setEspecialidad(Integer.parseInt(vista.txfEspecialidad.getText()));
                int numControl = Integer.parseInt(vista.txfNumecontrol.getText());
                String nombre = vista.txfNombre.getText();
                int idEspecialidad = Integer.parseInt(vista.txfEspecialidad.getText());
                alumnos.add(new Alumno(numControl, nombre, idEspecialidad));
                System.out.println(alumno);
            } else {
                JOptionPane.showMessageDialog(vista,"Este numero de control ya le pertenece a alguien mas","Accion invalida",0);
            }
        }

        if (this.vista.salirButton == e.getSource()){
            salir();
        }
    }

    public void limpiar(){
        this.vista.txfNombre.setText("");
        this.vista.txfNumecontrol.setText("");
        this.vista.txfEspecialidad.setText("");
    }

    public void salir(){
        System.exit(0);
    }


}
