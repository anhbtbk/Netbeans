/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.buituananh.model.controller.sort;

import java.util.Comparator;
import net.buituananh.model.Student;

/**
 *
 * @author Tuan Anh
 */
public class SortStudentByNameDESC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getFirstName().compareTo(o1.getFirstName());
    }
}
