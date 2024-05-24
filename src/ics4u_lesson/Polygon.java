/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_lesson;

/**
 *
 * @author Jchui
 */
public abstract class Polygon {
    int numSides;
    String colour;
    
    public Polygon(int numSides, String colour) {
        this.numSides = numSides;
        this.colour = colour;
    }
    
    public abstract double getArea(); 
    
    public int getNumSides() {
        return this.numSides;
    }
}
