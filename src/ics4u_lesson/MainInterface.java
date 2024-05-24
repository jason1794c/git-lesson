/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ics4u_lesson;

import javax.swing.*;

/**
 *
 * @author Jchui
 */
public class MainInterface extends JFrame {
    
    JPanel container = new JPanel();
    JPanel buttonsContainer = new JPanel();
    JPanel labelContainer = new JPanel();
    JLabel buttonsLabel = new JLabel("Buttons", SwingConstants.CENTER);
    JButton load = new JButton("Load");
    JButton save = new JButton("Save");
    JButton unsub = new JButton("Unsubscribe");
    ImageIcon hamburgerIcon = new ImageIcon("hamburger.jpg");
    JButton burgerButton = new JButton(hamburgerIcon);

    public MainInterface(String title) {
        super(title);
        setBounds(300, 200, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelContainer.add(buttonsLabel);

        // Create the container that will hold our buttons  
        buttonsContainer.add(load);
        buttonsContainer.add(save);
        buttonsContainer.add(unsub);
        buttonsContainer.add(burgerButton);

        container.add(labelContainer);
        container.add(buttonsContainer);
        this.add(container);
        setVisible(true);

    }
}
