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
    public JTextField txfNombre;
    private JLabel lblNombre;
    private JLabel lblRFC;

    public VistaCatedratico(){
        setTitle("Catedratico");
        setContentPane(panelPrincipal);
        setSize(300,160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

}
