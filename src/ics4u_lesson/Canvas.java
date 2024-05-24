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

public class Canvas extends JPanel implements ActionListener, KeyListener {

    int width = 500;
    int height = 500;
    int x = 200;
    int y = 200;
    Timer timer;

    public Canvas() {
        timer = new Timer(1, this);
        timer.start();
        this.addKeyListener(this);
        this.setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D pen = (Graphics2D) g;

        Ellipse2D.Double circle = new Ellipse2D.Double(this.x, this.y, 50, 50);
        pen.fill(circle);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 37 || e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
            if (this.x > 0) {
                this.x -= 10;
            }
        } else if (e.getKeyCode() == 38 || e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
            if (this.y > 0) {
                this.y -= 10;
            }
        } else if (e.getKeyCode() == 39 || e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
            if (this.x + 71 <= this.width) {
                this.x += 10;
            }
        } else if (e.getKeyCode() == 40 || e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
            if (this.y + 100 <= this.height) {
                this.y += 10;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
