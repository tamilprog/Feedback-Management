package model;

public class Feedback {
    private String title;
    private String description;
    private String category;
    private int studentId;
    private int roomId;

    public Feedback(String title, String description, String category, int studentId, int roomId) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.studentId = studentId;
        this.roomId = roomId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getRoomId() {
        return roomId;
    }
}
