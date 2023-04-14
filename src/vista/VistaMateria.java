package vista;

import javax.swing.*;

public class VistaMateria extends JFrame {
    private JPanel panelPrincipal;
    public JTextField txfid;
    public JTextField txfMateria;
    private JPanel panelCentral;
    private JPanel panelNorte;
    private JPanel panelSur;
    public JButton guardarButton;
    public JButton limpiarButton;
    public JButton salirButton;
    private JLabel lblMateria;
    private JLabel lblaidi;

    public VistaMateria(){
        setTitle("Materias");
        setContentPane(panelPrincipal);
        setSize(300,160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
