/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_lesson;

/**
 *
 * @author Jchui
 */
public class Triangle extends Polygon {
    private int base;
    private int height;
    
    public Triangle(int base, int height, String colour) {
        super(3, colour);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return this.base * this.height / 2.0;
    }
}
