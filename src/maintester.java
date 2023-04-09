import controlador.ControladorMenuGUI;
import vista.MenuPrincipalGUI;

public class maintester {
    public static void main(String[] args) {


        MenuPrincipalGUI p = new MenuPrincipalGUI();
       ControladorMenuGUI gui = new ControladorMenuGUI(p);
    }
}
