/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_lesson;

/**
 *
 * @author Jchui
 */
public class Sphere extends Circle {
    
    public Sphere(int radius, String colour) {
        super(radius, colour);
    }
    
    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
    
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
    }
}
