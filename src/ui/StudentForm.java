package ui;

import dao.StudentDAO;
import model.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JPanel {

    private JTextField roomNoField;
    private JButton addButton;
    private StudentDAO studentDAO;

    public StudentForm() {
        studentDAO = new StudentDAO();

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        JLabel roomLabel = new JLabel("Room No:");
        roomNoField = new JTextField(10);
        addButton = new JButton("Add Student");

        gbc.gridx = 0; gbc.gridy = 0;
        add(roomLabel, gbc);

        gbc.gridx = 1; gbc.gridy = 0;
        add(roomNoField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
        add(addButton, gbc);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int roomNo = Integer.parseInt(roomNoField.getText());
                    studentDAO.addStudent(new Student(roomNo));
                    JOptionPane.showMessageDialog(StudentForm.this, "Student added successfully!");
                    roomNoField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(StudentForm.this, "Enter a valid number");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(StudentForm.this, "Error adding student");
                }
            }
        });
    }
}
