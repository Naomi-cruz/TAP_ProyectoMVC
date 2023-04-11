package controlador;

import modelo.Alumno;
import modelo.Catedratico;
import modelo.Grupo;
import vista.VistaCatedratico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static modelo.Catedratico.catedraticos;


public class ControladorCatedratico implements ActionListener {

    private final Catedratico catedratico;
    private final VistaCatedratico vista;

    public ControladorCatedratico(Catedratico catedratico, VistaCatedratico vista) {
        this.catedratico = catedratico;
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

        if (this.vista.guardarButton == e.getSource()) {
            if (vista.txfFRC.getText().isEmpty() || vista.txfNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Ingresa valores en todos los campos", "Accion invalida", 0);
            } else {
                if (Catedratico.validarCatedraticoRFC(vista.txfFRC.getText()) == false) {
                    catedratico.setNombre(vista.txfNombre.getText());
                    catedratico.setRFC(vista.txfFRC.getText());

                    String RFC = vista.txfFRC.getText();
                    String nombre = vista.txfNombre.getText();
                    catedraticos.add(new Catedratico(RFC, nombre));
                    System.out.println(catedratico);
                } else {
                    JOptionPane.showMessageDialog(vista, "El catedratico ya se encuentra registrado", "Accion invalida", 0);
                }
            }
        }

        if (this.vista.salirButton == e.getSource()){
            salir();
        }

    }


    public void limpiar(){
        this.vista.txfFRC.setText("");
        this.vista.txfNombre.setText("");
    }

    public void salir(){
        System.exit(0);
    }
}
