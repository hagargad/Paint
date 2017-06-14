/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author SAMSUNG
 */
public class circle extends shape{
    private int radius;
  
    
   
    public circle(point startpt, int raduis, Color color, boolean filled) {
        super(startpt, color, filled);
        this.radius = raduis;
    }

    public int getRaduis() {
        return radius;
    }

    public void setRaduis(int raduis) {
        this.radius = raduis;
    }

    String getRadius() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public void move(int x,int y)
 {
     getStartpoint().setX(getStartpoint().getX()+x);
     getStartpoint().setY(getStartpoint().getY()+y);
 }

    @Override
    public boolean contains(point p) {
        Ellipse2D r;
        r= new Ellipse2D.Float(getStartpoint().getX(),getStartpoint().getY(),2*radius,2*radius);
        if(r.contains(p.getX(),p.getY()))
        {
            return true;
        }
        else
        {return false;}
    }

    @Override
    public int getWidth() {
        
     return radius*2;
     
    }

    @Override
    public int getHight() {
        return radius*2;
    }

    @Override
    public void setWidth(int o) {
        
       radius=o/2;
    }

    @Override
    public void setHight(int o) {
       
    }

  
    
    
}
