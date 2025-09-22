package dao;

import db.DBManager;
import model.Feedback;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FeedbackDAO {


    public void addFeedback(Feedback feedback) {
        String query = "INSERT INTO feedback (title, description, category, student_id, room_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBManager.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, feedback.getTitle());
            stmt.setString(2, feedback.getDescription());
            stmt.setString(3, feedback.getCategory());
            stmt.setInt(4, feedback.getStudentId());
            stmt.setInt(5, feedback.getRoomId());

            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("Inserted Feedback with ID: " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Feedback> getAllFeedback() {
        List<Feedback> feedbacks = new ArrayList<>();
        String query = "SELECT * FROM feedback";

        try (Connection conn = DBManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                feedbacks.add(new Feedback(
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("category"),
                        rs.getInt("student_id"),
                        rs.getInt("room_id")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return feedbacks;
    }
}
