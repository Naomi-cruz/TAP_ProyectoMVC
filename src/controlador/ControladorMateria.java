package controlador;

import modelo.Especialidad;
import modelo.Materia;
import vista.VistaMateria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorMateria implements ActionListener {

    public static ArrayList<Materia> materias = new ArrayList<Materia>();

    public final Materia materia;
    public final VistaMateria vista;

    public ControladorMateria(Materia materia, VistaMateria vista) {
        this.materia = materia;
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

            materia.setId_materia(Integer.parseInt(vista.txfid.getText()));
            materia.setNombre(vista.txfMateria.getText());

            int id = Integer.parseInt(vista.txfid.getText());
            String nombre = vista.txfMateria.getText();

            materias.add(new Materia(id,nombre));
            System.out.println(materia);
        }

        if (this.vista.salirButton == e.getSource()){
            salir();
        }

    }

    public void limpiar(){
        this.vista.txfid.setText("");
        this.vista.txfMateria.setText("");
    }

    public void salir(){
        System.exit(0);
    }
}
