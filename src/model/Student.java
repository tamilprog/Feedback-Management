package model;

public class Student {
    private int studentId;
    private int roomNo;

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
