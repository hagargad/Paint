/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import static java.util.Collections.swap;
import java.util.Stack;
import sun.java2d.loops.DrawRect;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;
import static java.util.Collections.swap;

/**
 *
 * @author SAMSUNG
 */
public class DrawingArea extends javax.swing.JPanel {

    /**
     * Creates new form DrawingArea
     */
    int thecurrent = 0;

    Stack redoStack = new Stack();
    Stack undoStack = new Stack();

    public static ArrayList<shape> shapes = new ArrayList<>();
    public static ArrayList<shape> shapes1 = new ArrayList<>();
    public static int shapenum = 0;
    private int ShapeType;
    private Color c;
    private boolean filled;
    private int i = 0;
    private int stroke;
    Polygon pol = new Polygon();
    private shape currentSelectedobject;
    point A = new point(-1, -1);
    point B = new point(-1, -1);
    point C = new point(-1, -1);
    int currentShape = -1;

    public static ArrayList<shape> getShapes() {
        return shapes;
    }

    public static void setShapes(ArrayList<shape> shapes) {
        DrawingArea.shapes = shapes;
    }

    public void setStroke(int stroke) {
        this.stroke = stroke;
    }

    public int getShapeType() {
        return ShapeType;
    }

    public void setShapeType(int ShapeType) {
        this.ShapeType = ShapeType;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public DrawingArea() {
        initComponents();
    }

    public void setC(Color c) {
        this.c = c;
    }

    /**
     *
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (shape s : shapes) {

            check(s, g);
        }
        for (shape s1 : shapes1) {

            check(s1, g);
        }
    }

    public void check(shape s, Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        g.setColor(s.getColor());
        g.setStroke(new BasicStroke(s.getStroke()));

        if (s instanceof line) {

            line l = (line) s;
            g.setColor(s.getColor());
            g.drawLine(l.getStartpoint().getX(), l.getStartpoint().getY(), l.getEndppoint().getX(), l.getEndppoint().getY());
            if ( thecurrent == 10 && s == currentSelectedobject) {

                int x = currentSelectedobject.getStartpoint().getX();
                int y = currentSelectedobject.getStartpoint().getY();
                int w = currentSelectedobject.getWidth();
                int h = currentSelectedobject.getHight();
                if (currentSelectedobject.isIsSelected()) {
                    g.setColor(Color.black);
                    g.fillRect(x - 3, y - 3, 6, 6);
                    g.fillRect(w - 3, h - 3, 6, 6);

                }
            }

        } else if (s instanceof circle) {

            circle c = (circle) s;
            g.setColor(s.getColor());
            if (c.isFilled()) {

                g.fillOval(c.getStartpoint().getX(), c.getStartpoint().getY(), c.getRaduis() * 2, c.getRaduis() * 2);
            } else {

                g.drawOval(c.getStartpoint().getX(), c.getStartpoint().getY(), c.getRaduis() * 2, c.getRaduis() * 2);
            }
            if ( thecurrent == 10 && s == currentSelectedobject) {
                int x = currentSelectedobject.getStartpoint().getX();
                int y = currentSelectedobject.getStartpoint().getY();
                int w = currentSelectedobject.getWidth();
                int h = currentSelectedobject.getHight();
                if (currentSelectedobject.isIsSelected()) {
                    g.setColor(Color.black);
                    g.fillRect(x - 3, y - 3, 6, 6);
                    g.fillRect(x + w / 2 - 3, y - 3, 6, 6);
                    g.fillRect(x + w - 3, y - 3, 6, 6);
                    g.fillRect(x - 3, y + h / 2 - 3, 6, 6);
                    g.fillRect(x + w - 3, y + h / 2 - 3, 6, 6);
                    g.fillRect(x - 3, y + h - 3, 6, 6);
                    g.fillRect(x + w / 2 - 3, y + h - 3, 6, 6);
                    g.fillRect(x + w - 3, y + h - 3, 6, 6);
                }
            }

        } else if (s instanceof triangle) {
            triangle t = (triangle) s;
            g.setColor(s.getColor());
            Polygon p = new Polygon();
            p.addPoint(t.getStartpoint().getX(), t.getStartpoint().getY());
            p.addPoint(t.getSecondpt().getX(), t.getSecondpt().getY());
            p.addPoint(t.getThirdpt().getX(), t.getThirdpt().getY());
            if (t.isFilled()) {
                g.fillPolygon(p);
            } else {
                g.drawPolygon(p);
            }

            if ( thecurrent == 10 && s == currentSelectedobject) {
                triangle ttt = (triangle) currentSelectedobject;
                int x = currentSelectedobject.getStartpoint().getX();
                int y = currentSelectedobject.getStartpoint().getY();
                int w = ttt.getThirdpt().getX();
                int h = ttt.getThirdpt().getY();
                int w2 = ttt.getSecondpt().getX();
                int h2 = ttt.getSecondpt().getY();
                if (currentSelectedobject.isIsSelected()) {
                    g.setColor(Color.black);
                    g.fillRect(x - 3, y - 3, 6, 6);
                    g.fillRect(w2 - 3, h2 - 3, 6, 6);
                    g.fillRect(w - 3, h - 3, 6, 6);

                }
            }

        } else if (s instanceof rectangle) {

            rectangle r = (rectangle) s;
            g.setColor(s.getColor());

            if (r.isFilled()) {
                g.fillRect(r.getStartpoint().getX(), r.getStartpoint().getY(), r.getEndpt().getX(), r.getEndpt().getY());
            } else {

                g.drawRect(r.getStartpoint().getX(), r.getStartpoint().getY(), r.getEndpt().getX(), r.getEndpt().getY());
            }

            if ( thecurrent == 10 && s == currentSelectedobject) {
                int x = currentSelectedobject.getStartpoint().getX();
                int y = currentSelectedobject.getStartpoint().getY();
                int w = currentSelectedobject.getWidth();
                int h = currentSelectedobject.getHight();
                if (currentSelectedobject.isIsSelected()) {
                    g.setColor(Color.black);
                    g.fillRect(x - 3, y - 3, 6, 6);
                    g.fillRect(x + w / 2 - 3, y - 3, 6, 6);
                    g.fillRect(x + w - 3, y - 3, 6, 6);
                    g.fillRect(x - 3, y + h / 2 - 3, 6, 6);
                    g.fillRect(x + w - 3, y + h / 2 - 3, 6, 6);
                    g.fillRect(x - 3, y + h - 3, 6, 6);
                    g.fillRect(x + w / 2 - 3, y + h - 3, 6, 6);
                    g.fillRect(x + w - 3, y + h - 3, 6, 6);
                }
            }

        } else if (s instanceof square) {
            square sq = (square) s;
            g.setColor(s.getColor());
            if (sq.isFilled()) {
                g.fillRect(sq.getStartpoint().getX(), sq.getStartpoint().getY(), sq.getSide(), sq.getSide());
            } else {
                g.drawRect(sq.getStartpoint().getX(), sq.getStartpoint().getY(), sq.getSide(), sq.getSide());
            }
            if ( thecurrent == 10 && s == currentSelectedobject) {
                int x = currentSelectedobject.getStartpoint().getX();
                int y = currentSelectedobject.getStartpoint().getY();
                int w = currentSelectedobject.getWidth();
                int h = currentSelectedobject.getHight();
                if (currentSelectedobject.isIsSelected()) {
                    g.setColor(Color.black);
                    g.fillRect(x - 3, y - 3, 6, 6);
                    g.fillRect(x + w / 2 - 3, y - 3, 6, 6);
                    g.fillRect(x + w - 3, y - 3, 6, 6);
                    g.fillRect(x - 3, y + h / 2 - 3, 6, 6);
                    g.fillRect(x + w - 3, y + h / 2 - 3, 6, 6);
                    g.fillRect(x - 3, y + h - 3, 6, 6);
                    g.fillRect(x + w / 2 - 3, y + h - 3, 6, 6);
                    g.fillRect(x + w - 3, y + h - 3, 6, 6);
                }
            }

        } else if (s instanceof ellipse) {
            ellipse e = (ellipse) s;
            g.setColor(s.getColor());
            if (e.isFilled()) {
                g.fillOval(e.getStartpoint().getX(), e.getStartpoint().getY(), e.getRaduis1() * 2, e.getRaduis2() * 2);
            } else {
                g.drawOval(e.getStartpoint().getX(), e.getStartpoint().getY(), e.getRaduis1() * 2, e.getRaduis2() * 2);
            }
            if ( thecurrent == 10 && s == currentSelectedobject) {
                int x = currentSelectedobject.getStartpoint().getX();
                int y = currentSelectedobject.getStartpoint().getY();
                int w = currentSelectedobject.getWidth();
                int h = currentSelectedobject.getHight();

                if (currentSelectedobject.isIsSelected()) {
                    g.setColor(Color.black);
                    g.fillRect(x - 3, y - 3, 6, 6);
                    g.fillRect(x + w / 2 - 3, y - 3, 6, 6);
                    g.fillRect(x + w - 3, y - 3, 6, 6);
                    g.fillRect(x - 3, y + h / 2 - 3, 6, 6);
                    g.fillRect(x + w - 3, y + h / 2 - 3, 6, 6);
                    g.fillRect(x - 3, y + h - 3, 6, 6);
                    g.fillRect(x + w / 2 - 3, y + h - 3, 6, 6);
                    g.fillRect(x + w - 3, y + h - 3, 6, 6);

                }
            }

        } else if (s instanceof polygon) {
            polygon p = (polygon) s;
            g.setColor(s.getColor());
            if (p.isFilled()) {
                g.fillPolygon(p.x, p.y, p.n);
            } else {
                g.drawPolygon(p.x, p.y, p.n);
            }
        } else if (s instanceof FreeHand) {
            FreeHand f = (FreeHand) s;
            ArrayList<Point> points = f.getPoints();
            g.setColor(s.getColor());
            for (int i = 0; i < points.size() - 1; i++) {
                g.drawLine((int) points.get(i).getX(), (int) points.get(i).getY(), (int) points.get(i + 1).getX(), (int) points.get(i + 1).getY());
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        point p = new point(evt.getX(), evt.getY());
        if ( thecurrent == 10) {

            if (currentSelectedobject != null && currentSelectedobject.contains(p)) {
                currentSelectedobject.setIsSelected(true);
                repaint();
            } else if (!currentSelectedobject.contains(p) && currentSelectedobject != null) {
                currentSelectedobject.setIsSelected(false);
                repaint();
            }

        }
        if ( thecurrent == 9) {
            switch (ShapeType) {
                case 5:
                    frame.x[i] = evt.getX();
                    frame.y[i] = evt.getY();
                    i++;
                    if (i == frame.n) {
                        point st = new point(frame.x[0], frame.y[0]);
                        polygon pol = new polygon(i, frame.x, frame.y, st, c, filled);
                        pol.setColor(c);
                        pol.setStroke(stroke);
                        shapes.add(pol);
                        repaint();

                        i = 0;
                    }
                    break;

            }
        }

    }//GEN-LAST:event_formMouseClicked
    FreeHand f;
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        point ooo = new point(evt.getX(), evt.getY());
        if ( thecurrent == 9) {
            B = new point(evt.getX(), evt.getY());

            switch (ShapeType) {

                case 0:

                    line l = new line(A, B, c, false);
                    l.setStroke(stroke);
                    if (shapes1.size() == 0) {
                        shapes1.add(l);
                    } else {

                        shapes1.clear();

                        shapes1.add(l);

                    }

                    repaint();

                    break;
                case 1:
                    int xsq = (int) Math.pow(A.getX() - B.getX(), 2);
                    int ysq = (int) Math.pow(A.getY() - B.getY(), 2);
                    int rad = (int) Math.sqrt(xsq + ysq);
                    point p = new point(A.getX() - rad, A.getY() - rad);
                    circle cir = new circle(p, rad, c, filled);
                    cir.setStroke(stroke);

                    if (shapes1.size() == 0) {
                        shapes1.add(cir);
                    } else {

                        shapes1.clear();

                        shapes1.add(cir);

                    }
                    repaint();
                    break;
                case 2:

                    triangle tri = new triangle(A, B, 1, c, filled);
                    tri.setStroke(stroke);
                    if (shapes1.size() == 0) {
                        shapes1.add(tri);
                    } else {

                        shapes1.clear();

                        shapes1.add(tri);

                    }
                    repaint();
                    break;
                case 3:
                    B = new point(evt.getX(), evt.getY());
                    rectangle rec = null;
                    point end = null;
                    if (A.getX() < B.getX()) {
                        if (A.getY() < B.getY()) {
                            end = new point(Math.abs(A.getX() - B.getX()), Math.abs(A.getY() - B.getY()));
                            rec = new rectangle(A, end, c, filled);
                            rec.setStroke(stroke);
                        } else {
                            end = new point(Math.abs(A.getX() - B.getX()), Math.abs(A.getY() - B.getY()));
                            point first = new point(A.getX(), A.getY() - Math.abs(A.getY() - B.getY()));
                            rec = new rectangle(first, end, c, filled);
                            rec.setStroke(stroke);

                        }
                    } else {

                        if (A.getY() < B.getY()) {
                            end = new point(Math.abs(A.getX() - B.getX()), Math.abs(A.getY() - B.getY()));
                            point first = new point(B.getX(), B.getY() - Math.abs(A.getY() - B.getY()));
                            rec = new rectangle(first, end, c, filled);
                            rec.setStroke(stroke);

                        } else {
                            end = new point(Math.abs(A.getX() - B.getX()), Math.abs(A.getY() - B.getY()));
                            point first = new point(B.getX(), A.getY() - Math.abs((A.getY()) - B.getY()));
                            rec = new rectangle(first, end, c, filled);
                            rec.setStroke(stroke);

                        }

                    }
                    if (shapes1.size() == 0) {
                        shapes1.add(rec);
                    } else {

                        shapes1.clear();

                        shapes1.add(rec);

                    }

                    repaint();
                    break;
                case 4:
                    int xs = Math.min(A.getX(), B.getX());
                    int ys = Math.min(A.getY(), B.getY());
                    point pp = new point(xs, ys);
                    int rad1 = (int) Math.sqrt(xs + ys);

                    ellipse el = new ellipse(Math.abs(-A.getX() + B.getX()), Math.abs(-A.getY() + B.getY()), pp, c, filled);
                    el.setStroke(stroke);
                    if (shapes1.size() == 0) {
                        shapes1.add(el);
                    } else {

                        shapes1.clear();

                        shapes1.add(el);

                    }
                    repaint();
                    break;

                case 6:
                    square sq = null;
                    point end1 = null;
                    int x = Math.min(A.getX(), B.getX());

                    int y = Math.min(A.getY(), B.getY());
                    point p2 = new point(x, y);
                    sq = new square(Math.abs(A.getX() - B.getX()), p2, c, filled);
                    sq.setStroke(stroke);

                    if (shapes1.size() == 0) {
                        shapes1.add(sq);
                    } else {

                        shapes1.clear();

                        shapes1.add(sq);

                    }

                    repaint();
                    break;
                case 7:

                    triangle tri2 = new triangle(A, B, 2, c, filled);
                    tri2.setStroke(stroke);

                    if (shapes1.size() == 0) {
                        shapes1.add(tri2);
                    } else {

                        shapes1.clear();

                        shapes1.add(tri2);

                    }
                    repaint();
                    break;
                case 50:

                    Point oo = new Point(2, 3);

                    f.addPoint(evt.getPoint());
                    f.setStroke(stroke);

                    if (shapes1.size() == 0) {
                        shapes1.add(f);

                    } else {
                        shapes1.clear();
                        shapes1.add(f);
                    }
                    repaint();
                    break;
                case 60:
                    f.setColor(Color.white);

                    f.addPoint(evt.getPoint());
                    f.setStroke(stroke);
                    if (shapes1.size() == 0) {
                        shapes1.add(f);

                    } else {
                        shapes1.clear();
                        shapes1.add(f);
                    }
                    repaint();
                    break;

            }
        } else if ( thecurrent == 10 && currentSelectedobject.isIsSelected() && currentSelectedobject.contains(ooo)) {
            if (currentSelectedobject != null) {
                B = new point(evt.getX(), evt.getY());

                currentSelectedobject.move(B.getX() - A.getX(), B.getY() - A.getY());
                A = new point(evt.getX(), evt.getY());

                repaint();
            } else if ( thecurrent == 10 && currentSelectedobject.isIsSelected() && !currentSelectedobject.contains(ooo)) {
                currentSelectedobject.setIsSelected(false);
                repaint();
            }
        } else if ( thecurrent == 11) {
            if (currentSelectedobject != null) {
                if (currentSelectedobject instanceof triangle) {
                    triangle ttt = (triangle) currentSelectedobject;
                    B = new point(evt.getX(), evt.getY());
                    currentSelectedobject.setWidth((B.getX()));
                    currentSelectedobject.setHight((B.getY()));
                    A = new point(evt.getX(), evt.getY());
                    repaint();
                } else if (currentSelectedobject instanceof line) {
                    line ttt = (line) currentSelectedobject;
                    B = new point(evt.getX(), evt.getY());
                    currentSelectedobject.setWidth((B.getX()));
                    currentSelectedobject.setHight((B.getY()));
                    A = new point(evt.getX(), evt.getY());
                    repaint();
                } else {
                    B = new point(evt.getX(), evt.getY());
                    currentSelectedobject.setWidth(currentSelectedobject.getWidth() + (B.getX() - A.getX()));
                    currentSelectedobject.setHight(currentSelectedobject.getHight() + (B.getX() - A.getX()));
                    A = new point(evt.getX(), evt.getY());
                    repaint();
                }
            }
        }

    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:

        if ( thecurrent == 9) {
            A = new point(evt.getX(), evt.getY());
            if (ShapeType == 50 || ShapeType == 60) {
                f = new FreeHand(A, c, false);
            }

        } else if ( thecurrent == 10) {
            point ooo = new point(evt.getX(), evt.getY());

            if (this.getCursor().getType() == java.awt.Cursor.SW_RESIZE_CURSOR) {
                 thecurrent = 11;
                A = new point(evt.getX(), evt.getY());
            }
            if (currentSelectedobject != null) {
                currentSelectedobject.setIsSelected(true);
                currentSelectedobject.setColor(c);

                for (int i = (shapes.size() - 1); i >= 0; i--) {
                    if (currentSelectedobject == shapes.get(i)) {
                        shapenum = i;
                        break;
                    }

                }

                repaint();
                A = new point(evt.getX(), evt.getY());
            }

            if (currentSelectedobject.isIsSelected() && !currentSelectedobject.contains(ooo)) {
                currentSelectedobject.setIsSelected(false);
                repaint();
            }
        }

    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        if ( thecurrent == 11) {
            this. thecurrent = 10;

        }

        if (shapes1.size() > 0) {
            shapes.add(shapes1.get(0));
            undoStack.add(shapes1.get(0));
            shapes1.clear();

        }


    }//GEN-LAST:event_formMouseReleased

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        point p = new point(evt.getX(), evt.getY());
        if ( thecurrent == 10) {

            for (int i = shapes.size() - 1; i >= 0; i--) {

                {
                    if (shapes.get(i).contains(p)) {

                        if (this.getCursor().getType() != java.awt.Cursor.HAND_CURSOR) {
                            this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                        }
                        currentSelectedobject = shapes.get(i);

                        break;
                    } else {
                        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                        if (currentSelectedobject != null) {
                            currentSelectedobject.setIsSelected(false);
                        }
                    }
                }
            }
            if (currentSelectedobject != null) {
                Rectangle2D r1;
                Rectangle2D r2;
                Rectangle2D r3;
                Rectangle2D r4;

                if (currentSelectedobject instanceof triangle) {
                    triangle ttt = (triangle) currentSelectedobject;
                    int x = currentSelectedobject.getStartpoint().getX();
                    int y = currentSelectedobject.getStartpoint().getY();
                    int w = ttt.getThirdpt().getX();
                    int h = ttt.getThirdpt().getY();
                    int w2 = ttt.getSecondpt().getX();
                    int h2 = ttt.getSecondpt().getY();
                    r1 = new Rectangle2D.Float(x - 3, y - 3, 6, 6);
                    r2 = new Rectangle2D.Float(w2 - 3, h2 - 3, 6, 6);
                    r3 = new Rectangle2D.Float(w - 3, h - 3, 6, 6);
                    r4 = new Rectangle2D.Float(x + w - 3, y + h - 3, 6, 6);

                } else if (currentSelectedobject instanceof line) {
                    line ttt = (line) currentSelectedobject;
                    int x = currentSelectedobject.getStartpoint().getX();
                    int y = currentSelectedobject.getStartpoint().getY();
                    int w = ttt.getEndppoint().getX();
                    int h = ttt.getEndppoint().getY();

                    r1 = new Rectangle2D.Float(x - 3, y - 3, 6, 6);
                    r2 = new Rectangle2D.Float(0, 0, 0, 0);
                    r3 = new Rectangle2D.Float(w - 3, h - 3, 6, 6);
                    r4 = new Rectangle2D.Float(0, 0, 0, 0);
                } else {
                    int x = currentSelectedobject.getStartpoint().getX();
                    int y = currentSelectedobject.getStartpoint().getY();
                    int w = currentSelectedobject.getWidth();
                    int h = currentSelectedobject.getHight();

                    r1 = new Rectangle2D.Float(x - 3, y - 3, 6, 6);
                    r2 = new Rectangle2D.Float(x + w - 3, y - 3, 6, 6);
                    r3 = new Rectangle2D.Float(x - 3, y + h - 3, 6, 6);
                    r4 = new Rectangle2D.Float(x + w - 3, y + h - 3, 6, 6);
                }

                if (r1.contains(evt.getPoint())) {
                    this.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));
                     thecurrent = 11;
                } else if (r2.contains(evt.getPoint())) {
                    this.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));
                     thecurrent = 11;
                } else if (r3.contains(evt.getPoint())) {
                    this.setCursor(new java.awt.Cursor(java.awt.Cursor.SW_RESIZE_CURSOR));
                     thecurrent = 11;
                } else if (r4.contains(evt.getPoint())) {
                    this.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
                     thecurrent = 11;
                }
//else {this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));}
            }

    }//GEN-LAST:event_formMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
}
