/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author SAMSUNG
 */
public class square extends shape{
     int side;

    public square(int side, point startpt, Color color, boolean filled) {
        super(startpt, color, filled);
        this.side = side;
    }

   

    

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getWidth() {
       return side;
    }

    @Override
    public int getHight() {
      return side;}

    @Override
    public void setWidth(int o) {
        
    }

    @Override
    public boolean contains(point p) {
         Rectangle2D r;
        
        r=new Rectangle2D.Float() ;
        r.setRect(getStartpoint().getX(), getStartpoint().getY(), getSide(),getSide());
        if(r.contains(p.getX(),p.getY()))
        {
            
            return true;
        }
        else
        {return false;
    }

        
   
   
    
    
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
        this.side=o;
    }
}