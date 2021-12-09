/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.buituananh.model.controller.sort;

import java.util.Comparator;
import net.buituananh.model.Subject;

/**
 *
 * @author Tuan Anh
 */
public class SortSubjectByNameASC implements Comparator<Subject> {

    public SortSubjectByNameASC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compare(Subject o1, Subject o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
