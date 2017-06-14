/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Line2D;

/**
 *
 * @author SAMSUNG
 */
public class triangle extends shape {

    private point secondpt;
    private point thirdpt;

    int k;

    public triangle(point startpt, point thirdpt, int k, Color color, boolean filled) {
        super(startpt, color, filled);
        this.secondpt = new point(startpt.getX(), thirdpt.getY());
        this.thirdpt = thirdpt;
        this.k = k;
        setSecondpt(startpt, thirdpt);
    }

    public point getSecondpt() {
        return secondpt;
    }

    public void setSecondpt(point a, point b) {
       
        if (this.k == 1) {
            this.secondpt = new point(getStartpoint().getX(), getThirdpt().getY());
        } else if (k == 2) {
           
            if (this.getStartpoint().getX() > this.thirdpt.getX()) {
                this.secondpt = new point(thirdpt.getX() + 2 * Math.abs(getStartpoint().getX() - getThirdpt().getX()), thirdpt.getY());
            } else {
                this.secondpt = new point(Math.abs(getThirdpt().getX() - 2 * Math.abs(getStartpoint().getX() - getThirdpt().getX())), thirdpt.getY());
            }
        }
    }

    public point getThirdpt() {
        return thirdpt;
    }

    public void setThirdpt(point thirdpt) {
        this.thirdpt = thirdpt;
    }

    @Override
    public boolean contains(point p) {
        Polygon triangle = new Polygon();
        triangle.addPoint(getStartpoint().getX(), getStartpoint().getY());
        triangle.addPoint(getSecondpt().getX(), getSecondpt().getY());
        triangle.addPoint(getThirdpt().getX(), getThirdpt().getY());
        if (triangle.contains(p.getX(), p.getY())) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void move(int x, int y) {
        getStartpoint().setX(getStartpoint().getX() + x);
        getStartpoint().setY(getStartpoint().getY() + y);
        thirdpt.setX(getThirdpt().getX() + x);
        thirdpt.setY(getThirdpt().getY() + y);
        setSecondpt(getStartpoint(), thirdpt);

    }

    @Override
    public int getWidth() {
      return thirdpt.getX();
    }

    @Override
    public int getHight() {
        return thirdpt.getY();

    }

    @Override
    public void setWidth(int o) {
        this.thirdpt.setX(o );

    }

    @Override
    public void setHight(int o) {
       this.thirdpt.setY(o );
    }

}
