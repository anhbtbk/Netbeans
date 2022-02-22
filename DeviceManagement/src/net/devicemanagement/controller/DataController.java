/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.devicemanagement.controller;

import java.util.List;

/**
 *
 * @author Tuan Anh
 */
/*
lớp interface để nêu ra các hành động cần được thực hiện, nhưng interface lại
không nói hành động được thực hiện ntn
việc thực hiện chi tiết do các lớp thực thi interface đảm nhiệm
vd: DataControllerImp
*/
public interface DataController {

    int PHONE = 1;

    String PHONE_FILE = "PHONE.DAT";

    <T> void writeToFile(List<T> data, String fileName);

    <T> List<T> readDataFromFile(String fileName);

}
