/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.buituananh.model.controller;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.buituananh.model.Registering;
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
public class InfoFilterImp implements InfoFilter {

    @Override
    public boolean isStudentIdValid(String id)
            throws InvalidStudentIdException {
        var regex = "^[a-z]\\d{2}[a-z]{4}\\d{3}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(id);
        if (matcher.matches()) {
            return true;
        } else {
            var msg = "Mã sinh viên không hợp lệ: " + id;
            throw new InvalidStudentIdException(id, msg);
        }
    }

    @Override
    public boolean isPersonIdValid(String id) throws InvalidPersionIdException {
        var regex = "^([a-z0-9]{9,13})$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(id);
        if (matcher.matches()) {
            return true;
        } else {
            var msg = "Số CMND/Căn cước/Hộ chiếu không hợp lệ: " + id;
            throw new InvalidPersionIdException(id, msg);
        }
    }

    @Override
    public boolean isNameValid(String name) throws InvalidNameException {
        var regex = "^(\\w+.*[^0-9].*)$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return true;
        } else {
            var msg = "Họ tên không hợp lệ: " + name;
            throw new InvalidNameException(name, msg);
        }
    }

    @Override
    public boolean isEmailValid(String email) throws InvalidEmailException {
        var regex = "^[a-z]+[a-z0-9._]*@gmail.com$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            var msg = "Email không hợp lệ: " + email;
            throw new InvalidEmailException(email, msg);
        }
    }

    @Override
    public boolean isPhoneNumberValid(String phoneNumber)
            throws InvalidPhoneNumberException {
        var regex = "^(03|04|07|08|09)\\d{8}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            return true;
        } else {
            var msg = "Số điện thoại không hợp lệ: " + phoneNumber;
            throw new InvalidPhoneNumberException(phoneNumber, msg);
        }
    }

    @Override
    public boolean isDateOfBirthValid(String dobString)
            throws InvalidDateOfBirthException {
        var regex = "^\\d{2}/\\d{2}/\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dobString);
        if (matcher.matches()) {
            return true;
        } else {
            var msg = "Ngày sinh không hợp lệ: " + dobString;
            throw new InvalidDateOfBirthException(dobString, msg);
        }
    }

    @Override
    public boolean isRecordExist(List<Registering> registerings, Registering r) {
        return registerings.contains(r);
    }

}
