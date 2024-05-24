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

public class SelectChocolate extends JFrame {

    private String[] chocolates = {
        "Kit Kat",
        "Mars Bars",
        "Smarties",
        "Oh Henry!",
        "Aero",
        "M&M",
        "Hersheys"
    };

    public SelectChocolate() {
        super("Favourite Chocolate Brand");
        setSize(250, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel listContainer = new JPanel();
        JLabel listLabel = new JLabel("Pick your favourite chocolate.");
        JList chocolateList = new JList(chocolates);
        chocolateList.setVisibleRowCount(3);
        JScrollPane scrollPane = new JScrollPane(chocolateList, 
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listContainer.add(listLabel);
        listContainer.add(scrollPane);

        add(listContainer);
        setVisible(true);

    }
}
