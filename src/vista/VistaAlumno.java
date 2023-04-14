package vista;

import javax.swing.*;

public class VistaAlumno extends JFrame{
    private JPanel panelPrincipal;
    private JLabel lblNumcontrol;
    private JPanel panelCentral;
    public JTextField txfNumecontrol;
    private JLabel lblNombre;
    public JTextField txfNombre;
    public JButton guardarButton;
    public JButton limpiarButton;
    private JPanel panelSur;
    private JPanel panelNorte;
    public JButton salirButton;
    public JTextField txfEspecialidad;
    private JLabel lblEspecialidad;

    public VistaAlumno(){
        setTitle("Alumnos");
        setContentPane(panelPrincipal);
        setSize(500,160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }





}
