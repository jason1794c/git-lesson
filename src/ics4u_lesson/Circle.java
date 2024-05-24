/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_lesson;

/**
 *
 * @author Jchui
 */
public class Circle {
    int radius;
    String colour;
    
    public Circle(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }
    
    public int getRadius() {
        return this.radius;
    }
    
    public String getColour() {
        return this.colour;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    
}
