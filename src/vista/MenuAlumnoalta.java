package vista;

import javax.swing.*;

public class MenuAlumnoalta extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelCentral;
    public JTextField txfnumcontrol;
    public JTextField txfclaveclase;
    public JButton agregarButton;
    public JButton limpiarButton;
    public JButton salirButton;

    public MenuAlumnoalta(){
        setTitle("Alumnos");
        setContentPane(panelPrincipal);
        setSize(300,170);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
