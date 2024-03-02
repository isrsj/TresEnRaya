/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author compi
 */
public class Figura {
    
    public Figura (){
        
    }
    
    
    public Rectangle2D rectangulo(double x, double y, double w, double h){
        return new Rectangle2D.Double(x, y, w, h);
    }
    
}
