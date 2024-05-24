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

public class Authenticator extends JFrame {

    public Authenticator() {
        super("Account Information");
        setSize(300, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creating components
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        JLabel commentsLabel = new JLabel("Comments");
        JTextField usernameField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JTextArea commentsArea = new JTextArea(4, 15);
        JScrollPane commentsScroll = new JScrollPane(commentsArea,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        JPanel loginContainer = new JPanel();

        // Adding in components to container
        loginContainer.add(usernameLabel);
        loginContainer.add(usernameField);
        loginContainer.add(passwordLabel);
        loginContainer.add(passwordField);
        loginContainer.add(commentsLabel);
        loginContainer.add(commentsScroll);
        loginContainer.add(okButton);
        loginContainer.add(cancelButton);
        
//        commentsArea.setLineWrap(true);
//        commentsArea.setWrapStyleWord(true);
        
        add(loginContainer);
        setVisible(true);

    }

}
