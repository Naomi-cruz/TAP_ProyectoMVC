package controlador;

import modelo.Grupo;
import vista.VistaGrupo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorGrupo implements ActionListener {
    public static ArrayList<Grupo> grupos = new ArrayList<Grupo>();

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

        if (this.vista.guardarButton == e.getSource()){
            grupo.setHora(Integer.parseInt(vista.txfHora.getText()));
            grupo.setClave((vista.txfClave.getText()));
            grupo.setSalon(Integer.parseInt(vista.txfSalon.getText()));
            String clave = vista.txfClave.getText();
            int hora = Integer.parseInt(vista.txfHora.getText());
            int salon = Integer.parseInt(vista.txfSalon.getText());
            grupos.add(new Grupo(clave,hora,salon));

            System.out.println(grupo);
        }

        if (this.vista.salirButton == e.getSource()){
            salir();
        }

    }

    public void limpiar(){
        this.vista.txfClave.setText("");
        this.vista.txfHora.setText("");
        this.vista.txfSalon.setText("");
    }

    public void salir(){
        System.exit(0);
    }
}
