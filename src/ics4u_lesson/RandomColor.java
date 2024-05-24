/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_lesson;

/**
 *
 * @author Jchui
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class RandomColor extends JButton implements MouseListener {
    
    Canvas2 canvas;
    
    public RandomColor(Canvas2 canvas) {
        super("Random Color");
        this.canvas = canvas;
        this.addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        this.canvas.red = (int)(Math.random() * 255 + 1);
        this.canvas.green = (int)(Math.random() * 255 + 1);
        this.canvas.blue = (int)(Math.random() * 255 + 1);
        this.canvas.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
