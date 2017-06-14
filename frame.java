/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JFileChooser;
import javax.swing.colorchooser.*;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author SAMSUNG
 */
public class frame extends javax.swing.JFrame {

    /**
     * Creates new form frame
     */
    ColorSelectionModel m;
    public static int n;
    public static int[] x;
    public static int[] y;
    int flag = 0;
    JFileChooser myfilechooChooser = new JFileChooser();

    public frame() {
        
        initComponents();
           getContentPane().setBackground(new Color(153,153,153));
        jColorChooser1.setColor(new Color(0, 0, 0));
       slidersize.setValue(0);
        myfilechooChooser = new JFileChooser();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser2 = new javax.swing.JColorChooser();
        linebt = new javax.swing.JButton();
        circlebt = new javax.swing.JButton();
        righttrianglebt = new javax.swing.JButton();
        rectbt = new javax.swing.JButton();
        ellipse = new javax.swing.JButton();
        filledcheckbox = new javax.swing.JCheckBox();
        jColorChooser1 = new javax.swing.JColorChooser();
        drawingArea1 = new paint.DrawingArea();
        clearallbt = new javax.swing.JButton();
        selectbt = new javax.swing.JButton();
        deletedbt = new javax.swing.JButton();
        squarebt = new javax.swing.JButton();
        trianglebt = new javax.swing.JButton();
        freehandbt = new javax.swing.JButton();
        redo = new javax.swing.JButton();
        undo = new javax.swing.JButton();
        polygonbt = new javax.swing.JButton();
        numberofsidestxt = new javax.swing.JTextField();
        eraserbt = new javax.swing.JButton();
        slidersize = new javax.swing.JSlider();
        savebt = new javax.swing.JButton();
        openexistbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint ");
        setBackground(new java.awt.Color(102, 102, 102));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        linebt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/draw-line.png")); // NOI18N
        linebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linebtActionPerformed(evt);
            }
        });

        circlebt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/draw-circle.png")); // NOI18N
        circlebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        circlebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circlebtActionPerformed(evt);
            }
        });

        righttrianglebt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/draw-triangle.png")); // NOI18N
        righttrianglebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        righttrianglebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                righttrianglebtActionPerformed(evt);
            }
        });

        rectbt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/draw-rectangle.png")); // NOI18N
        rectbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rectbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectbtActionPerformed(evt);
            }
        });

        ellipse.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/draw-ellipse.png")); // NOI18N
        ellipse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ellipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ellipseActionPerformed(evt);
            }
        });

        filledcheckbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        filledcheckbox.setText("Filled");
        filledcheckbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filledcheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filledcheckboxActionPerformed(evt);
            }
        });

        jColorChooser1.setBackground(new java.awt.Color(153, 153, 153));
        jColorChooser1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jColorChooser1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jColorChooser1MouseMoved(evt);
            }
        });
        jColorChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jColorChooser1MouseClicked(evt);
            }
        });
        jColorChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jColorChooser1PropertyChange(evt);
            }
        });

        drawingArea1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout drawingArea1Layout = new javax.swing.GroupLayout(drawingArea1);
        drawingArea1.setLayout(drawingArea1Layout);
        drawingArea1Layout.setHorizontalGroup(
            drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1147, Short.MAX_VALUE)
        );
        drawingArea1Layout.setVerticalGroup(
            drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );

        clearallbt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/edit-clear.png")); // NOI18N
        clearallbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearallbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearallbtActionPerformed(evt);
            }
        });

        selectbt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/edit-select.png")); // NOI18N
        selectbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtActionPerformed(evt);
            }
        });

        deletedbt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/edit-delete.png")); // NOI18N
        deletedbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletedbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedbtActionPerformed(evt);
            }
        });

        squarebt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/draw-square.png")); // NOI18N
        squarebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squarebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squarebtActionPerformed(evt);
            }
        });

        trianglebt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/draw-triangle3.png")); // NOI18N
        trianglebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trianglebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trianglebtActionPerformed(evt);
            }
        });

        freehandbt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/draw-freehand.png")); // NOI18N
        freehandbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        freehandbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freehandbtActionPerformed(evt);
            }
        });

        redo.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/edit-redo.png")); // NOI18N
        redo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });

        undo.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/edit-undo.png")); // NOI18N
        undo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });

        polygonbt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/draw-polygon.png")); // NOI18N
        polygonbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        polygonbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polygonbtActionPerformed(evt);
            }
        });

        numberofsidestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberofsidestxtActionPerformed(evt);
            }
        });

        eraserbt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/draw-eraser.png")); // NOI18N
        eraserbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eraserbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraserbtActionPerformed(evt);
            }
        });

        slidersize.setMaximum(50);
        slidersize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slidersize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidersizeStateChanged(evt);
            }
        });

        savebt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/document-save.png")); // NOI18N
        savebt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtActionPerformed(evt);
            }
        });

        openexistbt.setIcon(new javax.swing.ImageIcon("/Users/hagargad/Desktop/images/document-open-folder.png")); // NOI18N
        openexistbt.setText(" ");
        openexistbt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        openexistbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openexistbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawingArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(slidersize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(polygonbt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberofsidestxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ellipse, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(circlebt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(squarebt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rectbt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(linebt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(trianglebt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(righttrianglebt)
                                    .addComponent(freehandbt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(filledcheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(savebt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openexistbt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(undo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearallbt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletedbt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectbt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eraserbt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eraserbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(savebt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(openexistbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(undo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(redo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearallbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletedbt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(squarebt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rectbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trianglebt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(righttrianglebt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(circlebt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(linebt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(freehandbt, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(ellipse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(polygonbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numberofsidestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filledcheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGap(32, 32, 32)
                        .addComponent(slidersize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawingArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linebtActionPerformed
        // TODO add your handling code here:
        drawingArea1.setShapeType(0);
        drawingArea1. thecurrent= 9;
    }//GEN-LAST:event_linebtActionPerformed

    private void filledcheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filledcheckboxActionPerformed
        // TODO add your handling code here:
        drawingArea1.setFilled(filledcheckbox.isSelected());
        drawingArea1. thecurrent = 9;
    }//GEN-LAST:event_filledcheckboxActionPerformed

    private void circlebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circlebtActionPerformed
        // TODO add your handling code here:
        drawingArea1.setShapeType(1);
        drawingArea1. thecurrent = 9;
    }//GEN-LAST:event_circlebtActionPerformed

    private void righttrianglebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_righttrianglebtActionPerformed
        // TODO add your handling code here:
        drawingArea1.setShapeType(2);
        drawingArea1. thecurrent = 9;
    }//GEN-LAST:event_righttrianglebtActionPerformed

    private void rectbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectbtActionPerformed
        // TODO add your handling code here:
        drawingArea1.setShapeType(3);
        drawingArea1. thecurrent = 9;
    }//GEN-LAST:event_rectbtActionPerformed

    private void ellipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ellipseActionPerformed
        // TODO add your handling code here:
        drawingArea1.setShapeType(4);
        drawingArea1. thecurrent= 9;
    }//GEN-LAST:event_ellipseActionPerformed

    private void clearallbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearallbtActionPerformed
        // TODO add your handling code here:
        drawingArea1.removeAll();
        DrawingArea.shapes1.clear();
        DrawingArea.shapes.clear();

        drawingArea1.repaint();
        drawingArea1. thecurrent = 12;

    }//GEN-LAST:event_clearallbtActionPerformed

    private void polygonbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polygonbtActionPerformed
        // TODO add your handling code here:
        drawingArea1.setShapeType(5);
        n = Integer.parseInt(numberofsidestxt.getText());
        x = new int[n];
        y = new int[n];
        drawingArea1. thecurrent = 9;


    }//GEN-LAST:event_polygonbtActionPerformed

    private void numberofsidestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberofsidestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberofsidestxtActionPerformed

    private void selectbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtActionPerformed
        drawingArea1. thecurrent = 10;
    }//GEN-LAST:event_selectbtActionPerformed

    private void deletedbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedbtActionPerformed
        // TODO add your handling code here:
        if (drawingArea1. thecurrent == 10) {
            if (DrawingArea.shapes.isEmpty() == false) {
                
                drawingArea1.undoStack.push(DrawingArea.shapes.get(DrawingArea.shapenum));
                DrawingArea.shapes.remove((DrawingArea.shapenum));               

            }

        }
        drawingArea1.repaint();
        flag=1;


    }//GEN-LAST:event_deletedbtActionPerformed

    private void squarebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squarebtActionPerformed
        // TODO add your handling code here:
        drawingArea1.setShapeType(6);
        drawingArea1. thecurrent = 9;
    }//GEN-LAST:event_squarebtActionPerformed

    private void trianglebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trianglebtActionPerformed
        // TODO add your handling code here:
        drawingArea1.setShapeType(7);
        drawingArea1. thecurrent= 9;

    }//GEN-LAST:event_trianglebtActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        // TODO add your handling code here:

        if(flag==1)
        {
            if(!drawingArea1.undoStack.isEmpty())
            {
                shape s= (shape) drawingArea1.undoStack.pop();
                drawingArea1.shapes.add(drawingArea1.shapenum,s);
                drawingArea1.redoStack.push(s);
                flag=2;
                
                repaint();
            }
        }
        else
        {
            if (!drawingArea1.undoStack.isEmpty()) {
            shape s = (shape) drawingArea1.undoStack.pop();
            drawingArea1.shapes.remove(s);
            drawingArea1.shapes1.remove(s);
            drawingArea1.repaint();
            drawingArea1.redoStack.push(s);
           
        }
        }
    }//GEN-LAST:event_undoActionPerformed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed
        // TODO add your handling code here:
        if(flag==2)
        {
            if(!drawingArea1.redoStack.isEmpty())
            {
                shape s=(shape) drawingArea1.redoStack.pop();
                drawingArea1.shapes.remove(drawingArea1.shapenum);
                drawingArea1.undoStack.push(s);
                repaint();
                flag=0;
            }
        }
        else
        {
                if (!drawingArea1.redoStack.isEmpty()) {
            shape s = (shape) drawingArea1.redoStack.pop();
            drawingArea1.shapes.add(s);
            drawingArea1.shapes1.add(s);
            drawingArea1.repaint();
            drawingArea1.undoStack.push(s);

        }
                }
    }//GEN-LAST:event_redoActionPerformed

    private void freehandbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freehandbtActionPerformed
drawingArea1.setShapeType(50);
        drawingArea1. thecurrent= 9;

        // TODO add your handling code here:
    }//GEN-LAST:event_freehandbtActionPerformed

    private void eraserbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraserbtActionPerformed
        // TODO add your handling code here:
       drawingArea1.setShapeType(60); 
               drawingArea1. thecurrent = 9;

    }//GEN-LAST:event_eraserbtActionPerformed

    private void jColorChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jColorChooser1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jColorChooser1MouseClicked

    private void slidersizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidersizeStateChanged
        // TODO add your handling code here:
       drawingArea1.setStroke(slidersize.getValue());
    }//GEN-LAST:event_slidersizeStateChanged

    private void jColorChooser1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jColorChooser1MouseMoved
        // TODO add your handling code here:
         drawingArea1.setC(jColorChooser1.getColor());
         getContentPane().setBackground(new Color(153,153,153));
    }//GEN-LAST:event_jColorChooser1MouseMoved

    private void jColorChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jColorChooser1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jColorChooser1PropertyChange

    private void savebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtActionPerformed
        // TODO add your handling code here:
        myfilechooChooser.showSaveDialog(this);
        String name = myfilechooChooser.getSelectedFile().getPath();
       
        if (!name.equalsIgnoreCase("")) {
            saveLoad s = new saveLoad();
            try {
                s.save(drawingArea1.shapes, name);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_savebtActionPerformed

    private void openexistbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openexistbtActionPerformed
        // TODO add your handling code here:
          myfilechooChooser.showOpenDialog(this);
        String name = myfilechooChooser.getSelectedFile().getPath();
        
        if (!name.equalsIgnoreCase("")) {
            saveLoad s = new saveLoad();
            try {
                drawingArea1.setShapes(s.Load(name));
                drawingArea1.repaint();
                
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SAXException ex) {
                Logger.getLogger(frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                  
    }
    private void RedobtActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        if(flag==2){
            if(!drawingArea1.redoStack.isEmpty()){
                shape s=(shape) drawingArea1.redoStack.pop();
                drawingArea1.shapes.remove(drawingArea1.shapenum);
                drawingArea1.undoStack.push(s);
                repaint();
                flag=0;
            }
        }
        else {
            if(!drawingArea1.redoStack.isEmpty()){
                shape s=(shape) drawingArea1.redoStack.pop();
                drawingArea1.shapes.add(s);
                drawingArea1.shapes1.add(s);
                drawingArea1.repaint();
                drawingArea1.undoStack.push(s);
                
            }
                
            
        }
    }//GEN-LAST:event_openexistbtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circlebt;
    private javax.swing.JButton clearallbt;
    private javax.swing.JButton deletedbt;
    private paint.DrawingArea drawingArea1;
    private javax.swing.JButton ellipse;
    private javax.swing.JButton eraserbt;
    private javax.swing.JCheckBox filledcheckbox;
    private javax.swing.JButton freehandbt;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JButton linebt;
    private javax.swing.JTextField numberofsidestxt;
    private javax.swing.JButton openexistbt;
    private javax.swing.JButton polygonbt;
    private javax.swing.JButton rectbt;
    private javax.swing.JButton redo;
    private javax.swing.JButton righttrianglebt;
    private javax.swing.JButton savebt;
    private javax.swing.JButton selectbt;
    private javax.swing.JSlider slidersize;
    private javax.swing.JButton squarebt;
    private javax.swing.JButton trianglebt;
    private javax.swing.JButton undo;
    // End of variables declaration//GEN-END:variables

    private static class ChangeListenerImpl implements ChangeListener {

        public ChangeListenerImpl() {
        }

        @Override
        public void changed(ObservableValue observable, Object oldValue, Object newValue) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
