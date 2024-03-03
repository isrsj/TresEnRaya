package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author compi
 */
public class Panel extends JPanel {

    Figura figura = new Figura();
    Teclado teclado = new Teclado();
    RellenarFigura rellenar = new RellenarFigura();

    public Panel() {
        this.setLayout(null);
        this.setBackground(Color.green);
        this.addMouseListener(teclado);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;

        for (int i = 0; i < figura.sizeCasilla(); i++) {
            graphics2D.draw(figura.getCasilla(i));
        }
        for (int i = 0; i < figura.sizeCasilla(); i++) {
            if (rellenar.getBoolean(i)) {
                graphics2D.fill(figura.getCasilla(i));
            }
        }

        repaint();
    }
    
    

}
