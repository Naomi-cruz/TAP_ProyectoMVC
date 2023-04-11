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
            if (vista.txfEspecialidad.getText().length() == 0 || vista.txfNumecontrol.getText().length() == 0 || vista.txfNombre.getText().length() == 0 ) {
                JOptionPane.showMessageDialog(vista, "Ingresa valores en los campos", "Accion invalida", 0);
            }
            else {
                try {
                    if (Alumno.validarAlumnonumdecontrol(Integer.parseInt(vista.txfNumecontrol.getText())) == true) {
                        JOptionPane.showMessageDialog(vista, "Este numero de control ya le pertenece a alguien mas", "Accion invalida", 0);
                    } else {
                        if (Especialidad.buscarEspecialidadID(Integer.parseInt(vista.txfEspecialidad.getText())) == true) {
                            int numControl = Integer.parseInt(vista.txfNumecontrol.getText());
                            String nombre = vista.txfNombre.getText();
                            Especialidad id = Especialidad.busquedaEspecialidad(Integer.parseInt(vista.txfEspecialidad.getText()));

                            alumno.setEspecialidad(id);
                            alumno.setNumControl(numControl);
                            alumno.setNombre(nombre);
                            alumnos.add(new Alumno(numControl, nombre, id));
                            System.out.println(alumno);

                        } else {
                            JOptionPane.showMessageDialog(vista, "Especialidad invalida", "Accion invalida", 0);
                        }
                    }
                } catch (NumberFormatException error) {
                    System.out.println("\nIngresa valores numericos en los id's");
                }
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
