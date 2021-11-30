/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.buituananh.model.controller;

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
import net.buituananh.model.Subject;
import net.buituananh.model.controller.sort.SortSubjectByNameASC;
import net.buituananh.model.controller.sort.SortSubjectByNameDESC;
import net.buituananh.model.controller.sort.SortSubjectByNumOfLessonASC;
import net.buituananh.model.controller.sort.SortSubjectByNumOfLessonDESC;

/**
 *
 * @author Tuan Anh
 */
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
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        return data;
    }

    @Override
    public void sortSubjectByNameASC(List<Subject> subjects) {
        Collections.sort(subjects, new SortSubjectByNameASC());
    }

    @Override
    public void sortSubjectByNameDESC(List<Subject> subjects) {
        Collections.sort(subjects, new SortSubjectByNameDESC());
    }

    @Override
    public void sortSubjectByNunOfLessonASC(List<Subject> subjects) {
        Collections.sort(subjects, new SortSubjectByNumOfLessonASC());
    }

    @Override
    public void sortSubjectByNunOfLessonDESC(List<Subject> subjects) {
        Collections.sort(subjects, new SortSubjectByNumOfLessonDESC());
    }

    @Override
    public List<Subject> searchSubjectByName(List<Subject> subjects, String key) {
        List<Subject> resultList = new ArrayList<>();
        var regex = ".*" + key + ".*";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        for (Subject subject : subjects) {
            matcher = pattern.matcher(subject.getName());
            if (matcher.matches()) {
                resultList.add(subject);
            }
        }
        return resultList;
    }

    @Override
    public List<Subject> searchSubjectByLessonRange(List<Subject> subjects,
            int fromVal, int toVal) {
        List<Subject> resultList = new ArrayList<>();
        for (Subject subject : subjects) {
            if (subject.getNumOfLession() >= fromVal
                    && subject.getNumOfLession() <= toVal) {
                resultList.add(subject);
            }
        }
        return resultList;

    }
}
