/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.buituananh.model.controller.sort;

import java.util.Comparator;
import net.buituananh.model.Registering;

/**
 *
 * @author Tuan Anh
 */
public class SortRegisteringByStudentNameZA implements Comparator<Registering> {

    @Override
    public int compare(Registering o1, Registering o2) {
        return o2.getStudent().getFirstName().compareTo(o1.getStudent().getFirstName());
    }

}
