/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.buituananh.model.controller;

import java.util.Date;
import java.util.List;
import net.buituananh.model.Course;
import net.buituananh.model.Registering;
import net.buituananh.model.Student;
import net.buituananh.model.Subject;

/**
 *
 * @author Tuan Anh
 */
public interface DataController {

    int SUBJECT = 1;
    int STUDENT = 2;
    int REGISTERING = 3;
    int COURSE = 4;
    
    String SUBJECT_FILE = "SUBJECT.DAT";
    String STUDENT_FILE = "STUDENT.DAT";
    String REGISTERING_FILE = "STU_REGISTER.DAT";
    String COURSE_FILE = "COURSE.DAT";

    <T> void writeToFile(List<T> data, String fileName);

    <T> List<T> readDataFromFile(String fileName);

    void sortSubjectByNameASC(List<Subject> subjects);

    void sortSubjectByNameDESC(List<Subject> subjects);

    void sortSubjectByNunOfLessonASC(List<Subject> subjects);

    void sortSubjectByNunOfLessonDESC(List<Subject> subjects);

    List<Subject> searchSubjectByName(List<Subject> subjects, String key);

    List<Subject> searchSubjectByLessonRange(List<Subject> subjects,
            int fromVal, int toVal);

    void sortStudentByNameASC(List<Student> students);

    void sortStudentByNameDESC(List<Student> students);

    void sortStudentByStudentIdASC(List<Student> students);

    List<Student> searchStudentByName(List<Student> students, String name);

    List<Student> searchStudentById(List<Student> students, String id);

    List<Student> searchStudentByMajor(List<Student> students, String major);

    void sortRegisteringByStudentNameAZ(List<Registering> rs);

    void sortRegisteringByStudentNameZA(List<Registering> rs);

    void sortRegisteringByRegisterTimeEL(List<Registering> rs);

    void sortRegisteringByRegisterTimeLE(List<Registering> rs);

    List<Registering> searchReByStudentName(List<Registering> rs, String name);

    List<Registering> searchReByRegisterTime(List<Registering> rs, 
            Date fromDate, Date toDate);
    
    List<Course> createCourse(List<Registering> rs, List<Subject> subjects);

}
