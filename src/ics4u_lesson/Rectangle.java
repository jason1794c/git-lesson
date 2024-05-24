/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_lesson;

/**
 *
 * @author Jchui
 */
public class Rectangle extends Polygon {
    private int length;
    private int width;
    
    public Rectangle(int length, int width, String colour) {
        super(4, colour);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return this.width * this.length;
    }
}
