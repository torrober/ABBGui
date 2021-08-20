/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abbgui;

import abb.Arbol;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import javax.swing.UIManager;

/**
 *
 * @author guest
 */
public class ABBGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel(new FlatArcDarkIJTheme());
        } catch (Exception ex) {
        }
        Arbol objArbol = new Arbol();
        MainWindow m = new MainWindow(objArbol);
    }

}
