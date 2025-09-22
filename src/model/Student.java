package model;

public class Student {
    private int studentId; // DB will auto-generate
    private int roomNo;

    // Constructor for inserting a new student
    public Student(int roomNo) {
        this.roomNo = roomNo;
    }

    // Constructor for reading from DB
    public Student(int studentId, int roomNo) {
        this.studentId = studentId;
        this.roomNo = roomNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getRoomNo() {
        return roomNo;
    }
}
