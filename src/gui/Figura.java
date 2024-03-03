package gui;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

/**
 *
 * @author compi
 */
public class Figura {
    
    private static ArrayList<Rectangle2D> casillas;
    
    public Figura (){
        casillas = new ArrayList<Rectangle2D>();
        generarCasillas();
    }
    
    public Boolean isEmpty (){
        return casillas.isEmpty();
    }
    
    public int sizeCasilla (){
        return casillas.size();
    }
    
    public Rectangle2D getCasilla (int i){
        return casillas.get(i);
    }

    public void generarCasillas() {
        for (int i = 0; i < 9; i++) {
            if (casillas.isEmpty()) {
                casillas.add(rectangulo(125, 100, 50, 50));
            } else {
                if (i > 0 && i < 3) {
                    casillas.add(rectangulo(casillas.get(i - 1).getX() + 100, 100, 50, 50));
                } else if (i == 3) {
                    casillas.add(rectangulo(125, 200, 50, 50));
                } else if (i > 3 && i < 6) {
                    casillas.add(rectangulo(casillas.get(i - 1).getX() + 100, 200, 50, 50));
                } else if (i == 6) {
                    casillas.add(rectangulo(125, 300, 50, 50));
                } else if (i > 6 && i < 9) {
                    casillas.add(rectangulo(casillas.get(i - 1).getX() + 100, 300, 50, 50));
                }
            }
        }
    }
    
    
    public Rectangle2D rectangulo(double x, double y, double w, double h){
        return new Rectangle2D.Double(x, y, w, h);
    }
    
}
