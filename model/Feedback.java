package model;

public class Feedback {
    private int feedBackId;
    private String Title;
    private String Description;
    private String Category;
    private int StudentId;
    private int roomId;

    public Feedback(int feedBackId, String Title, String Description, String Category, int StudentId, int roomId) {

        this.Title = Title;
        this.Description = Description;
        this.Category = Category;
        this.StudentId = StudentId;
        this.roomId = roomId;
    }


   public String getFeedBackSummary() {
        return Title +" "+ Description +" "+ Category;
   }
}

