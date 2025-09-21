package dao;

import model.Feedback;
import java.util.List;

public interface FeedbackDAO {
    void addFeedback(Feedback feedback);
    List<Feedback> getAllFeedback();
    void updateFeedback(Feedback feedback);
    void deleteFeedback(int feedbackId);
}
