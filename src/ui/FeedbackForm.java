package ui;

import dao.FeedbackDAO;
import model.Feedback;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeedbackForm extends JPanel {

    private JTextField titleField, categoryField, studentIdField, roomIdField;
    private JTextArea descriptionArea;
    private JButton submitButton;
    private FeedbackDAO feedbackDAO;

    public FeedbackForm() {
        feedbackDAO = new FeedbackDAO();

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        titleField = new JTextField(15);
        descriptionArea = new JTextArea(5, 15);
        categoryField = new JTextField(10);
        studentIdField = new JTextField(5);
        roomIdField = new JTextField(5);
        submitButton = new JButton("Submit Feedback");

        gbc.gridx = 0; gbc.gridy = 0; add(new JLabel("Title:"), gbc);
        gbc.gridx = 1; add(titleField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; add(new JLabel("Description:"), gbc);
        gbc.gridx = 1; add(new JScrollPane(descriptionArea), gbc);

        gbc.gridx = 0; gbc.gridy = 2; add(new JLabel("Category:"), gbc);
        gbc.gridx = 1; add(categoryField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; add(new JLabel("Student ID:"), gbc);
        gbc.gridx = 1; add(studentIdField, gbc);

        gbc.gridx = 0; gbc.gridy = 4; add(new JLabel("Room ID:"), gbc);
        gbc.gridx = 1; add(roomIdField, gbc);

        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2;
        add(submitButton, gbc);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String title = titleField.getText();
                    String desc = descriptionArea.getText();
                    String category = categoryField.getText();
                    int studentId = Integer.parseInt(studentIdField.getText());
                    int roomId = Integer.parseInt(roomIdField.getText());

                    feedbackDAO.addFeedback(new Feedback(title, desc, category, studentId, roomId));
                    JOptionPane.showMessageDialog(FeedbackForm.this, "Feedback submitted successfully!");

                    titleField.setText("");
                    descriptionArea.setText("");
                    categoryField.setText("");
                    studentIdField.setText("");
                    roomIdField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(FeedbackForm.this, "Enter valid numbers for Student ID & Room ID");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(FeedbackForm.this, "Error submitting feedback");
                }
            }
        });
    }
}
