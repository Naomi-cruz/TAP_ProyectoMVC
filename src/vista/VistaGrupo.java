package vista;

import javax.swing.*;

public class VistaGrupo extends JFrame{
    private JPanel panelPrincipal;
    public JTextField txfClave;
    private JPanel panelNorte;
    private JLabel lblClave;
    public JTextField txfHora;
    private JLabel lblHora;
    private JLabel lblSalon;
    public JTextField txfSalon;
    public JButton guardarButton;
    public JButton limpiarButton;
    public JButton salirButton;
    private JPanel panelSur;
    private JPanel panelCentral;

    public VistaGrupo(){
        setTitle("Grupo");
        setContentPane(panelPrincipal);
        setSize(500,160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
