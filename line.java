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
import org.w3c.dom.Element;

/**
 *
 * @author SAMSUNG
 */
public class line extends shape {

    static void appendChild(Element x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private point endppoint;

    public line(point startpoint, point endpt, Color color, boolean filled) {
        super(startpoint, color, filled);
        this.endppoint = endpt;
    }

    public point getEndppoint() {
        return endppoint;
    }

    public void setEndppoint(point endppoint) {
        this.endppoint = endppoint;
    }

    @Override
    public boolean contains(point p) {

        int d1;
        int d2;
        int d3;
       
        int xst=getStartpoint().getX();
        int yst=getStartpoint().getY();
        int xend=getEndppoint().getX();
        int yend=getEndppoint().getY();
        d1=(int) Math.sqrt((Math.abs((p.getX()-xst)*(p.getX()-xst)))+(Math.abs((p.getY()-yst)*(p.getY()-yst))));
        d2=(int) Math.sqrt((Math.abs((xend-p.getX())*(xend-p.getX())))+(Math.abs((yend-p.getY())*(yend-p.getY()))));
        d3=(int) Math.sqrt(Math.abs(((xend-xst)*(xend-xst)))+(Math.abs((yend-yst)*(yend-yst))));

        if((d1+d2)==d3 || (d1+d2) < d3)
        {
           
            return true;
        }
        else
            return false;
    }

    @Override
    public void move(int x, int y) {
        getStartpoint().setX(getStartpoint().getX() + x);
        getStartpoint().setY(getStartpoint().getY() + y);
        endppoint.setX(endppoint.getX()+x);
        endppoint.setY(endppoint.getY()+y);
    }

    @Override
    public int getWidth() {
        return endppoint.getX();
    }

    @Override
    public int getHight() {
        return endppoint.getY();
    }

    @Override
    public void setWidth(int o) {
        endppoint.setX(o);
    }

    @Override
    public void setHight(int o) {
        endppoint.setY(o);
    }

}
