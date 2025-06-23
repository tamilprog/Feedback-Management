package model;

public class Student {
    private int studentId;
    private int roomNo;

    public Student(int studentId, int roomNo) {
        this.studentId = studentId;
        this.roomNo = roomNo;
    }

    public String getStudent() {
        return "Student ID: " + studentId + " | Room No: " + roomNo;

    }
}
