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
public class ellipse extends shape{
   private int raduis1;
    private int raduis2;

    public ellipse(int raduis1, int raduis2, point startpt, Color color, boolean filled) {
        super(startpt, color, filled);
        this.raduis1 = raduis1;
        this.raduis2 = raduis2;
    }

 

    public int getRaduis1() {
        return raduis1;
    }

    public void setRaduis1(int raduis1) {
        this.raduis1 = raduis1;
    }

    public int getRaduis2() {
        return raduis2;
    }

    public void setRaduis2(int raduis2) {
        this.raduis2 = raduis2;
    }

    @Override
    public int getWidth() {
       return raduis1*2;
    }

    @Override
    public int getHight() {
      return raduis2*2;
    }

    @Override
    public void setWidth(int o) {
        raduis1=o/2;
    }

    @Override
    public boolean contains(point p) {
  Ellipse2D r;
        r= new Ellipse2D.Float(getStartpoint().getX(),getStartpoint().getY(),raduis1*2,raduis2*2);
        if(r.contains(p.getX(),p.getY()))
        {
            return true;
        }
        else
        {return false;}
    }

    @Override
    public void move(int x, int y) {
       {
     getStartpoint().setX(getStartpoint().getX()+x);
     getStartpoint().setY(getStartpoint().getY()+y);
 }
    }

    @Override
    public void setHight(int o) {
       raduis2=o/2;
    }


  
    
    
}
