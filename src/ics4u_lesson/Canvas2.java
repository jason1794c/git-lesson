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

public class Canvas2 extends JPanel implements MouseListener, MouseMotionListener {

    int width = 500;
    int height = 500;
    RandomColor clickMe;
    RandomLocationButton randomLocation;
    int x;
    int y;
    int xRadius;
    int yRadius;
    Color color;
    int red;
    int green;
    int blue;

    public Canvas2() {
        this.x = 150;
        this.y = 150;
        this.xRadius = 50;
        this.yRadius = 50;
        clickMe = new RandomColor(this);
        randomLocation = new RandomLocationButton(this);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        add(clickMe);
        add(randomLocation);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D pen = (Graphics2D) g;
        color = new Color(red, green, blue);

        pen.setColor(color);
        Ellipse2D.Double circle = new Ellipse2D.Double(this.x, this.y, this.xRadius, this.yRadius);
        pen.fill(circle);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1) {
            this.xRadius += 1;
            this.yRadius += 1;
        } else if (e.getButton() == 3) {
            if (this.xRadius > 1 || this.yRadius > 1) {
                this.xRadius -= 1;
                this.yRadius -= 1;
            }
        }
        repaint();
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

    @Override
    public void mouseDragged(MouseEvent e) {
    }
    

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("x: " + e.getX());
        System.out.println("y: " + e.getY());
    }
}
