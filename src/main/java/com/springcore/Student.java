package com.springcore;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    public int getStudentId() {
        System.out.println("calling get id");
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("calling set id");
        this.studentId = studentId;
    }

    public String getStudentName() {
        System.out.println("calling get name");
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("calling set name");
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
