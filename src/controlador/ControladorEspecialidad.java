package controlador;

import modelo.Alumno;
import modelo.Especialidad;
import vista.VistaEspecialidad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import static modelo.Especialidad.especialidades;


public class ControladorEspecialidad implements ActionListener {


  /*  private final Especialidad especialidad;
    private final VistaEspecialidad vista;

    public ControladorEspecialidad(Especialidad especialidad, VistaEspecialidad vista) {
        this.especialidad = especialidad;
        this.vista = vista;
        this.vista.guardarButton.addActionListener(this);
        this.vista.limpiarButton.addActionListener(this);
        this.vista.salirButton.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vista.limpiarButton == e.getSource()) {
            limpiar();
        }

        if (this.vista.guardarButton == e.getSource()) {
            if (vista.jtfEspecialidad.getText().isEmpty() ||  vista.txfId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Ingresa valores en todos los campos", "Accion invalida", 0);
            }
                else {
                try {
                    if (Especialidad.buscarEspecialidadID(Integer.parseInt(vista.txfId.getText())) == false) {

                        especialidad.setId(Integer.parseInt(vista.txfId.getText()));
                        especialidad.setNombre((vista.jtfEspecialidad.getText()));

                        int id = Integer.parseInt(vista.txfId.getText());
                        String nombre = vista.jtfEspecialidad.getText();
                        especialidades.add(new Especialidad(id, nombre));
                        System.out.println(especialidad);
                        Especialidad.buscarEspecialidadID(id);

                    } else {
                        JOptionPane.showMessageDialog(vista, "El id ya esta asociado a otra especialidad", "Accion invalida", 0);
                    }
                } catch (NumberFormatException error) {
                    System.out.println("\nIngresa valores numericos en el id");
                }
            }
        }

        if (this.vista.salirButton == e.getSource()) {
            salir();
        }
    }
        public void limpiar () {
            this.vista.txfId.setText("");
            this.vista.jtfEspecialidad.setText("");
        }

        public void salir() {
            System.exit(0);
        }
*/
}