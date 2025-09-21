package ui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Feedback Management System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Feedback Form - Work in Progress");
        label.setHorizontalAlignment(SwingConstants.CENTER); // center horizontally
        label.setVerticalAlignment(SwingConstants.CENTER);   // center vertically

        add(label); // BorderLayout.CENTER by default
    }
}
