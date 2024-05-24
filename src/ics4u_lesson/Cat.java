/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_lesson;

/**
 *
 * @author Jchui
 */
public class Cat extends Animal {
    
    @Override
    public void speak() {
        System.out.println("Meow");
    }
    
    public void humanSpeak() {
        super.speak();
    }
    
}
