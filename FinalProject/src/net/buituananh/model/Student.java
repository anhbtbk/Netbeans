/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.buituananh.model;

import java.util.Objects;
import net.buituananh.model.controller.InfoFilterImp;
import net.buituananh.model.exception.InvalidDateOfBirthException;
import net.buituananh.model.exception.InvalidEmailException;
import net.buituananh.model.exception.InvalidNameException;
import net.buituananh.model.exception.InvalidPersionIdException;
import net.buituananh.model.exception.InvalidPhoneNumberException;
import net.buituananh.model.exception.InvalidStudentIdException;

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

    public Student(String studentId) throws InvalidStudentIdException {
        setStudentId(studentId);
    }

    public Student(String studentId, String id) throws InvalidStudentIdException,
            InvalidPersionIdException {
        super(id);
        setStudentId(studentId);
    }

    public Student(String studentId, String studentClass, String major,
            String schoolYear, String id, String address, String email,
            String phoneNumber, String fullName, String dob)
            throws InvalidStudentIdException, InvalidPersionIdException,
            InvalidEmailException, InvalidPhoneNumberException,
            InvalidDateOfBirthException, InvalidNameException {
        super(id, address, email, phoneNumber, fullName, dob);
        this.setStudentId(studentId);
        this.studentClass = studentClass;
        this.major = major;
        this.schoolYear = schoolYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) throws InvalidStudentIdException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isStudentIdValid(studentId)) {
                this.studentId = studentId;
            }
        } catch (InvalidStudentIdException e) {
            throw e;
        }
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
