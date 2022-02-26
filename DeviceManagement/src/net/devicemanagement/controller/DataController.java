/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.devicemanagement.controller;

import java.util.List;
import net.devicemanagement.view.model.Phone;

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
    int PC = 2;

    String PHONE_FILE = "PHONE.DAT";
    
    String PC_FILE = "PC.DAT";

    <T> void writeToFile(List<T> data, String fileName);

    <T> List<T> readDataFromFile(String fileName);

    void sortPhoneByNameASC(List<Phone> phones);

    void sortPhoneByNameDESC(List<Phone> phones);

    void sortPhoneByPhaseASC(List<Phone> phones);

    void sortPhoneByPhaseDESC(List<Phone> phones);
    
    List<Phone> searchPhoneByImei(List<Phone> phones, String key);
    
    List<Phone> searchPhoneByName(List<Phone> phones, String key);
    
    List<Phone> searchPhoneByPhase(List<Phone> phones, String key);

}
