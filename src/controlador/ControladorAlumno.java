package controlador;

import modelo.Alumno;
import modelo.Especialidad;
import vista.VistaAlumno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ControladorAlumno implements ActionListener {

    public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

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
            alumno.setNumControl(Integer.parseInt(vista.txfNumecontrol.getText()));
            alumno.setNombre((vista.txfNumecontrol.getText()));
            alumno.setEspecialidad(Integer.parseInt(vista.txfEspecialidad.getText()));
            int numControl = Integer.parseInt(vista.txfNumecontrol.getText());
            String nombre = vista.txfNombre.getText();
            int idEspecialidad = Integer.parseInt(vista.txfEspecialidad.getText());
            alumnos.add(new Alumno(numControl,nombre,idEspecialidad));
            System.out.println(alumno);
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
