package controlador;

import modelo.Alumno;
import modelo.Especialidad;
import vista.VistaEspecialidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ControladorEspecialidad implements ActionListener {
    public static ArrayList<Especialidad> especialidades = new ArrayList<Especialidad>();

    private final Especialidad especialidad;
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
        if(this.vista.limpiarButton == e.getSource()){
            limpiar();
        }
        if (this.vista.guardarButton == e.getSource()){
            especialidad.setId(Integer.parseInt(vista.txfId.getText()));
            especialidad.setNombre((vista.jtfEspecialidad.getText()));

            int id = Integer.parseInt(vista.txfId.getText());
            String nombre = vista.jtfEspecialidad.getText();
            especialidades.add(new Especialidad(id,nombre));
            System.out.println(especialidad);
        }

        if (this.vista.salirButton == e.getSource()){
            salir();
        }

    }

    public void limpiar(){
        this.vista.txfId.setText("");
        this.vista.jtfEspecialidad.setText("");
    }

    public void salir(){
        System.exit(0);
    }
}
