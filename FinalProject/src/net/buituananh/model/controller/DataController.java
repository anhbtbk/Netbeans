/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.buituananh.model.controller;

import java.util.List;
import net.buituananh.model.Subject;

/**
 *
 * @author Tuan Anh
 */
public interface DataController {

    int SUBJECT = 1;
    int STUDENT = 2;
    int REGISTERING = 3;
    String SUBJECT_FILE = "SUBJECT.DAT";
    String STUDENT_FILE = "STUDENT.DAT";
    String REGISTERING_FILE = "STU_REGISTER.DAT";

    <T> void writeToFile(List<T> data, String fileName);

    <T> List<T> readDataFromFile(String fileName);

    void sortSubjectByNameASC(List<Subject> subjects);

    void sortSubjectByNameDESC(List<Subject> subjects);

    void sortSubjectByNunOfLessonASC(List<Subject> subjects);

    void sortSubjectByNunOfLessonDESC(List<Subject> subjects);

    List<Subject> searchSubjectByName(List<Subject> subjects, String key);

    List<Subject> searchSubjectByLessonRange(List<Subject> subjects, 
            int fromVal, int toVal);

}
