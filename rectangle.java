/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author SAMSUNG
 */
public class rectangle extends shape {
   private int width;
   private int hight;
   private point endpt;

    public rectangle( point startpt, point endpt, Color color, boolean filled) {
        super(startpt, color, filled);
        this.endpt = endpt;
    }

    public point getEndpt() {
        return endpt;
    }

    public void setEndpt(point endpt) {
        this.endpt = endpt;
    }

    

   

   
    public int getWidth() {
        return endpt.getX();
    }

   

    public int getHight() {
        return endpt.getY();
    }

    

    @Override
    public boolean contains(point p) {
        Rectangle2D r;
        
        r=new Rectangle2D.Float() ;
        r.setRect(getStartpoint().getX(), getStartpoint().getY(), endpt.getX(),endpt.getY());
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
    public void setWidth(int o) {
        this.getEndpt().setX(o);
        
    }

    @Override
    public void setHight(int o) {
        this.getEndpt().setY(o);
    }

    
}
