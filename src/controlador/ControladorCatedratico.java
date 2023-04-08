package controlador;

import modelo.Catedratico;
import modelo.Grupo;
import vista.VistaCatedratico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ControladorCatedratico implements ActionListener {
    public static ArrayList<Catedratico> catedraticos = new ArrayList<Catedratico>();

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

        if (this.vista.guardarButton == e.getSource()){
            catedratico.setNombre(vista.txfNombre.getText());
            catedratico.setRFC(vista.txfFRC.getText());

            String RFC = vista.txfFRC.getText();
            String nombre = vista.txfNombre.getText();
            catedraticos.add(new Catedratico(RFC,nombre));
            System.out.println(catedratico);
        }

        if (this.vista.salirButton == e.getSource()){
            salir();
        }

        if (this.vista.menuButton == e.getSource()){
            vista.dispose();

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
