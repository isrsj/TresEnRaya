/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.util.ArrayList;

/**
 *
 * @author compi
 */
public class RellenarFigura {
    
    private static ArrayList<Boolean> estaPintado;
    
    public RellenarFigura (){
        estaPintado = new ArrayList<Boolean>();
        for (int i = 0; i < 9; i++) {
            estaPintado.add(false);
        }
    }
    
    public Boolean isEmpty (){
        return estaPintado.isEmpty();
    }
    
    public void addBoolean (Boolean boo){
        estaPintado.add(boo);
    }
    
    public void setBoolean (int i, Boolean boo){
        estaPintado.set(i, boo);
    }
    
    public Boolean getBoolean (int i){
        return estaPintado.get(i);
    }
}
