/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.buituananh.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Tuan Anh
 */
public class Student extends Person {
    private String studentId;
    private String studentClass;
    private String major;
    private String schoolYear;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String id) {
        super(id);
        this.studentId = studentId;
    }

    public Student(String studentId, String studentClass, String major, 
            String schoolYear, String id, String address, String email, 
            String phoneNumber, String fullName, Date dob) {
        super(id, address, email, phoneNumber, fullName, dob);
        this.studentId = studentId;
        this.studentClass = studentClass;
        this.major = major;
        this.schoolYear = schoolYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.studentId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }
        return true;
    }
 
    
    
}
