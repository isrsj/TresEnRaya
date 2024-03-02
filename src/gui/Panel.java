/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author compi
 */
public class Panel extends JPanel{
    Figura figura = new Figura();
    
    private Rectangle2D primerCasilla, segundaCasilla, tercerCasilla, cuartaCasilla, quintaCasilla, sextaCasilla, septimaCasilla, octavaCasilla, novenaCasilla;
    private final double ladoCasilla = 50;
    
    public Panel (){
        this.setLayout(null);
        this.setBackground(Color.green);
        primerCasilla = figura.rectangulo(125, 100, ladoCasilla, ladoCasilla);
        segundaCasilla = figura.rectangulo(225, 100, ladoCasilla, ladoCasilla);
        tercerCasilla = figura.rectangulo(325, 100, ladoCasilla, ladoCasilla);
        cuartaCasilla = figura.rectangulo(125, 200, ladoCasilla, ladoCasilla);
        quintaCasilla = figura.rectangulo(225, 200, ladoCasilla, ladoCasilla);
        sextaCasilla = figura.rectangulo(325, 200, ladoCasilla, ladoCasilla);
        septimaCasilla = figura.rectangulo(125, 300, ladoCasilla, ladoCasilla);
        octavaCasilla = figura.rectangulo(225, 300, ladoCasilla, ladoCasilla);
        novenaCasilla = figura.rectangulo(325, 300, ladoCasilla, ladoCasilla);
    }
    
    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        dibujarCasilla(graphics2D, primerCasilla);
        dibujarCasilla(graphics2D, segundaCasilla);
        dibujarCasilla(graphics2D, tercerCasilla);
        dibujarCasilla(graphics2D, cuartaCasilla);
        dibujarCasilla(graphics2D, quintaCasilla);
        dibujarCasilla(graphics2D, sextaCasilla);
        dibujarCasilla(graphics2D, septimaCasilla);
        dibujarCasilla(graphics2D, octavaCasilla);
        dibujarCasilla(graphics2D, novenaCasilla);
        repaint();
    }
    
    public void dibujarCasilla(Graphics2D graphics2D, Rectangle2D r){
        graphics2D.draw(r);
    }
    
    
}
