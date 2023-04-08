package vista;

import javax.swing.*;

public class VistaCatedratico extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelCentral;
    public JTextField txfFRC;
    private JPanel panelNorte;
    private JPanel panelSur;
    public JButton guardarButton;
    public JButton limpiarButton;
    public JButton salirButton;
    public JButton menuButton;
    public JTextField txfNombre;
    private JLabel lblNombre;
    private JLabel lblRFC;

    public VistaCatedratico(){
        setTitle("Catedratico");
        setContentPane(panelPrincipal);
        setSize(500,140);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
