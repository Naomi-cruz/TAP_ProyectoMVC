package controlador;

import modelo.*;
import vista.VistaGrupo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static modelo.Grupo.grupos;

public class ControladorGrupo implements ActionListener {

    private final Grupo grupo;
    private final VistaGrupo vista;

    public ControladorGrupo(Grupo grupo, VistaGrupo vista) {
        this.grupo = grupo;
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
            if (vista.txfrfc.getText().isEmpty() || vista.txfidMateria.getText().isEmpty() || vista.txfHora.getText().isEmpty() || vista.txfClave.getText().isEmpty() || vista.txfSalon.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Ingresa valores en todos los campos", "Accion invalida", 0);
            } else {
                try {
                    if (Grupo.validarGrupoclave(vista.txfClave.getText()) == true) {
                        JOptionPane.showMessageDialog(vista, "Grupo ya existente", "Accion invalida", 0);
                    } else {
                        if (Grupo.salonDisponible(Integer.parseInt(vista.txfSalon.getText()), Integer.parseInt(vista.txfHora.getText())) == false && Materia.validarMateriaID(Integer.parseInt(vista.txfidMateria.getText())) == true && Catedratico.validarCatedraticoRFC(vista.txfrfc.getText()) == true) {

                            String clave = vista.txfClave.getText();
                            int hora = Integer.parseInt(vista.txfHora.getText());
                            int salon = Integer.parseInt(vista.txfSalon.getText());
                            Materia m = Materia.busquedaMateria(Integer.parseInt(vista.txfidMateria.getText()));
                            Catedratico c = Catedratico.busquedaCatedratico(vista.txfrfc.getText());

                            grupo.setHora(hora);
                            grupo.setMateria(m);
                            grupo.setClave(clave);
                            grupo.setSalon(salon);
                            grupo.setCatedratico(c);
                            System.out.println(grupo);

                            grupos.add(new Grupo(clave, hora, salon, m, c));
                        } else {
                            JOptionPane.showMessageDialog(vista, "Parametros no validos", "Accion invalida", 0);
                        }
                    }
                    } catch(NumberFormatException error){
                        System.out.println("\nIngresa valores numericos en los lugares correspondientes");
                }

            }
        }

        if (this.vista.salirButton == e.getSource()){
            salir();
        }

    }

    public void limpiar(){
        this.vista.txfClave.setText("");
        this.vista.txfHora.setText("");
        this.vista.txfSalon.setText("");
        this.vista.txfidMateria.setText("");
        this.vista.txfrfc.setText("");
    }

    public void salir(){
        System.exit(0);
    }
}
