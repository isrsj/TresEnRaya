package gui;

import javax.swing.JFrame;

/**
 *
 * @author compi
 */
public class Ventana {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        Panel panel = new Panel();
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 500);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.add(panel);
        ventana.setVisible(true);
    }
}
