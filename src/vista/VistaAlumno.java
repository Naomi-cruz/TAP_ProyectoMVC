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
    public JButton menuButton;
    private JPanel panelSur;
    private JPanel panelNorte;
    public JButton salirButton;

    public VistaAlumno(){
        setTitle("Alumnos");
        setContentPane(panelPrincipal);
        setSize(500,140);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }





}
