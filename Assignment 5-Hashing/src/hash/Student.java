package hash;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

//    public Student(){
//        this.studentID = createID ();
//        this.studentName = createStudentName ();
//    }
//
//    private int createID(){
//        int studentID = 99999;
//        studentID++;
//        return studentID;
//    }
//
//    private String createStudentName(){
//        int nameLength = 8;
//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//                + "abcdefghijklmnopqrstuvwxyz";
//        StringBuilder name = new StringBuilder();
//        for(int i = 0; i < nameLength; i++) {
//            int index = (int)(alphabet.length() * Math.random());
//            name.append(alphabet.charAt(index));
//        }
//
//        return name.toString();
//    }

    public String toString(){
        return "StudentID: " + studentID + " Student Name: " + studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
