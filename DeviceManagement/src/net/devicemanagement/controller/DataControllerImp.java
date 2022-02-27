/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.devicemanagement.controller.sort.SortPcByChipASC;
import net.devicemanagement.controller.sort.SortPcByChipDESC;
import net.devicemanagement.controller.sort.SortPcByRamASC;
import net.devicemanagement.controller.sort.SortPcByRamDESC;
import net.devicemanagement.controller.sort.SortPhoneByNameASC;
import net.devicemanagement.controller.sort.SortPhoneByNameDESC;
import net.devicemanagement.controller.sort.SortPhoneByPhaseASC;
import net.devicemanagement.controller.sort.SortPhoneByPhaseDESC;
import net.devicemanagement.view.model.Pc;
import net.devicemanagement.view.model.Phone;

/**
 *
 * @author Tuan Anh
 */
//thực hiện chi tiết các hành động trong lớp interface
public class DataControllerImp implements DataController {

    @Override
    public <T> void writeToFile(List<T> data, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(data);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public <T> List<T> readDataFromFile(String fileName) {
        List<T> data = new ArrayList<>();
        File file = new File(fileName);
        if (file.length() > 0) {
            try (FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                data = (List<T>) ois.readObject();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }
        return data;
    }

    @Override
    public void sortPhoneByNameASC(List<Phone> phones) {
        Collections.sort(phones, new SortPhoneByNameASC());
    }

    @Override
    public void sortPhoneByNameDESC(List<Phone> phones) {
        Collections.sort(phones, new SortPhoneByNameDESC());
    }

    @Override
    public void sortPhoneByPhaseASC(List<Phone> phones) {
        Collections.sort(phones, new SortPhoneByPhaseASC());
    }

    @Override
    public void sortPhoneByPhaseDESC(List<Phone> phones) {
        Collections.sort(phones, new SortPhoneByPhaseDESC());
    }

    @Override
    public List<Phone> searchPhoneByImei(List<Phone> phones, String key) {
        List<Phone> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Phone phone : phones) {
            var imeiStr = Long.toString(phone.getImei());
            matcher = pattern.matcher(imeiStr);
            if (matcher.matches()) {
                resultList.add(phone);
            }
        }
        return resultList;
    }

    @Override
    public List<Phone> searchPhoneByName(List<Phone> phones, String key) {
        List<Phone> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Phone phone : phones) {
            matcher = pattern.matcher(phone.getName());
            if (matcher.matches()) {
                resultList.add(phone);
            }
        }
        return resultList;
    }

    @Override
    public List<Phone> searchPhoneByPhase(List<Phone> phones, String key) {
        List<Phone> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Phone phone : phones) {
            matcher = pattern.matcher(phone.getPhase());
            if (matcher.matches()) {
                resultList.add(phone);
            }
        }
        return resultList;
    }

    @Override
    public void sortPcByChipASC(List<Pc> pcs) {
        Collections.sort(pcs, new SortPcByChipASC());
    }

    @Override
    public void sortPcByChipDESC(List<Pc> pcs) {
        Collections.sort(pcs, new SortPcByChipDESC());
    }

    @Override
    public void sortPcByRamASC(List<Pc> pcs) {
        Collections.sort(pcs, new SortPcByRamASC());
    }

    @Override
    public void sortPcByRamDESC(List<Pc> pcs) {
        Collections.sort(pcs, new SortPcByRamDESC());
    }

}
