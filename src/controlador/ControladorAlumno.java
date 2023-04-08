package controlador;

import modelo.Alumno;
import vista.VistaAlumno;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAlumno implements ActionListener {

    private final Alumno alumno;
    private final VistaAlumno vista;
    public ControladorAlumno(Alumno alumno, VistaAlumno vista) {
        this.alumno = alumno;
        this.vista = vista;
        this.vista.guardarButton.addActionListener(this);
        this.vista.menuButton.addActionListener(this);
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
            System.out.println(alumno);
        }

        if (this.vista.salirButton == e.getSource()){
            salir();
        }

    }

    public void limpiar(){
        this.vista.txfNombre.setText("");
        this.vista.txfNumecontrol.setText("");
    }

    public void salir(){
        System.exit(0);
    }

}
