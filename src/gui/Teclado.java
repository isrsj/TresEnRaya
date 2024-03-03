package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author compi
 */
public class Teclado implements MouseListener {

    Figura figura = new Figura();
    RellenarFigura rellenar = new RellenarFigura();

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (int i = 0; i < figura.sizeCasilla(); i++) {
            if (figura.getCasilla(i).contains(e.getPoint())) {
                rellenar.setBoolean(i, true);
                System.out.println(rellenar.getBoolean(i));
            }
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
