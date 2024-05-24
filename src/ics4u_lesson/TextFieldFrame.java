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

public class TextFieldFrame extends JFrame {
    
    JTextField randomTextField = new JTextField(10);
    JPasswordField randomPasswordField = new JPasswordField(10);
    JTextArea randomTextArea = new JTextArea(50, 50);
    
    public TextFieldFrame() {
        super("Text Field Frame");
        setSize(700, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel textContainer = new JPanel();
        
        randomPasswordField.setEchoChar('^');
        randomTextArea.setLineWrap(true);
        randomTextArea.setWrapStyleWord(true);
        
        textContainer.add(randomTextField);
        textContainer.add(randomPasswordField);
        textContainer.add(randomTextArea);
        add(textContainer);
        setVisible(true);
    }
}
