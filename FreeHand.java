/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author SAMSUNG
 */
public class FreeHand extends shape {
    public  ArrayList<Point> Points=new ArrayList();

    public FreeHand(point startpt, Color color, boolean filled) {
        super(startpt, color, filled);
    }


    public ArrayList<Point> getPoints() {
        return Points;
    }

    public void setPoints(ArrayList<Point> Points) {
        this.Points = Points;
    }
    public void addPoint(Point p){
         Points.add(p);

    }

    @Override
    public int getWidth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWidth(int o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(point p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHight(int o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
