package controlador;

import modelo.Alumno;
import modelo.Catedratico;
import modelo.Grupo;
import modelo.Materia;
import vista.MenuAlumnoalta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static modelo.Grupo.asignarAlumno;

public class ControladorMenuAlumnoalta implements ActionListener {
    public final MenuAlumnoalta vista;

    public ControladorMenuAlumnoalta(MenuAlumnoalta vista) {
        this.vista = vista;
        this.vista.agregarButton.addActionListener(this);
        this.vista.limpiarButton.addActionListener(this);
        this.vista.salirButton.addActionListener(this);
    }

    public void limpiar(){
        this.vista.txfclaveclase.setText("");
        this.vista.txfnumcontrol.setText("");
    }

    public void salir(){
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.vista.limpiarButton == e.getSource()){
            limpiar();
        }

        if (this.vista.agregarButton == e.getSource()) {
            if (vista.txfnumcontrol.getText().isEmpty() || vista.txfclaveclase.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Ingresa valores en todos los campos", "Accion invalida", 0);
            } else {
                try {
                    if (Grupo.validarGrupoclave(vista.txfclaveclase.getText()) == false && Alumno.validarAlumnonumdecontrol(Integer.parseInt(vista.txfnumcontrol.getText())) == false) {
                        JOptionPane.showMessageDialog(vista, "Datos no encontrados", "Accion invalida", 0);
                    } else {
                        if (Grupo.buscarAlumno(Integer.parseInt(vista.txfnumcontrol.getText())) == false) {
                            String clave = vista.txfclaveclase.getText();
                            int num_control = Integer.parseInt(vista.txfnumcontrol.getText());
                            asignarAlumno(clave,num_control);
                            System.out.println("\nAlumno asignado a la clase "+clave);
                        } else {
                            JOptionPane.showMessageDialog(vista, "El alumno ya se encuentra en la clase", "Accion invalida", 0);

                        }
                    }
                } catch (NumberFormatException error) {
                    System.out.println("\nIngresa valores numericos en el campo de numero de control");
                }
            }
        }

        if (this.vista.salirButton == e.getSource()){
            salir();
        }
    }
}
