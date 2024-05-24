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

public class Drawing extends JFrame {
    
    public Drawing() {
        super("My Moving Drawings!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Adding Canvas
//        Canvas canvas = new Canvas();
//        setSize(canvas.width, canvas.height);
//        add(canvas);
        
        // Adding Canvas2
        Canvas2 canvas2 = new Canvas2();
        setSize(canvas2.width, canvas2.height);
        add(canvas2);
        
        setVisible(true);      
    }
}
