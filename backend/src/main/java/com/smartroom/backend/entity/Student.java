package com.smartroom.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

@Document(collection = "student")
public class Student {

    // student  + unique id
    @NotNull
    @NotEmpty
    @Id
    private String studentId;

    @NotNull
    @NotEmpty
    private String studentName;

    @NotNull
    @NotEmpty
    @Email
    private String email;


    private String password = String.valueOf(new Random().nextInt(999999));


    private StudentParameter studentParameter;

    private HashMap<String, ArrayList<Integer>> studentMarks1;

    private HashMap<String,ArrayList<Integer>> studentMarks2;

    private String role = "ROLE_STUDENT";

    public Student() {
    }

    public Student(String studentId, String studentName, String email, String password, StudentParameter studentParameter, HashMap<String, ArrayList<Integer>> studentMarks1, HashMap<String, ArrayList<Integer>> studentMarks2, String role) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.password = password;
        this.studentParameter = studentParameter;
        this.studentMarks1 = studentMarks1;
        this.studentMarks2 = studentMarks2;
        this.role = role;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StudentParameter getStudentParameter() {
        return studentParameter;
    }

    public void setStudentParameter(StudentParameter studentParameter) {
        this.studentParameter = studentParameter;
    }

    public HashMap<String, ArrayList<Integer>> getStudentMarks1() {
        return studentMarks1;
    }

    public void setStudentMarks1(HashMap<String, ArrayList<Integer>> studentMarks1) {
        this.studentMarks1 = studentMarks1;
    }

    public HashMap<String, ArrayList<Integer>> getStudentMarks2() {
        return studentMarks2;
    }

    public void setStudentMarks2(HashMap<String, ArrayList<Integer>> studentMarks2) {
        this.studentMarks2 = studentMarks2;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", studentParameter=" + studentParameter +
                ", studentMarks1=" + studentMarks1 +
                ", studentMarks2=" + studentMarks2 +
                ", role='" + role + '\'' +
                '}';
    }
}
