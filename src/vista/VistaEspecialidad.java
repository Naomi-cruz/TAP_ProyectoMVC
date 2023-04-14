package vista;

import javax.swing.*;

public class VistaEspecialidad extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelCentro;
    public JButton guardarButton;
    public JButton limpiarButton;
    public JButton salirButton;
    public JTextField txfId;
    private JLabel lblaidi;
    public JTextField jtfEspecialidad;
    private JLabel lblEspecialidad;

    public VistaEspecialidad(){
        setTitle("Especialidades");
        setContentPane(panelPrincipal);
        setSize(400,160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
