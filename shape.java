/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author SAMSUNG
 */
public abstract class  shape {
    private point startpoint;
    private Color color;
    private boolean isSelected;
     private int width ;
    private int hight;
private int Stroke;

    public int getStroke() {
        return Stroke;
    }

    public void setStroke(int Stroke) {
        this.Stroke = Stroke;
    }

    public abstract int getWidth() ;

    public abstract int getHight() ;
    public abstract void setWidth(int o) ;
    

    public abstract void setHight(int o);
    
            
            
    
    

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
    private boolean filled;
    

    public boolean isIsSelected() {
        return isSelected;
    }

    public shape(point startpt, Color color, boolean filled) {
        this.startpoint = startpt;
        this.color = color;
        this.filled = filled;
        
    }

    public point getStartpoint() {
        return startpoint;
    }

    public void setStartpoint(point startpoint) {
        this.startpoint = startpoint;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract boolean contains(point p);
    public abstract void move(int x,int y);
    
    
    
}
