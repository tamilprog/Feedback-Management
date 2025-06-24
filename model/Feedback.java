package model;

public class Feedback {
    private int feedBackId;
    private String Title;
    private String Description;
    private String Category;
    private int studentId;
    private int roomId;

    public Feedback(int feedBackId, String Title, String Description, String Category, int studentId, int roomId) {

        this.Title = Title;
        this.Description = Description;
        this.Category = Category;
        this.studentId = studentId;
        this.roomId = roomId;
    }


   public String getTitle() {
        return Title;
   }

    public String getDescription() {
        return Description;
    }
    public String getCategory() {
        return Category;
    }
    public int getStudentId () {
        return studentId;
    }
}

