/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package net.buituananh.model.controller;

import java.util.List;
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
public interface InfoFilter {

    boolean isStudentIdValid(String id) throws InvalidStudentIdException;

    boolean isPersonIdValid(String id) throws InvalidPersionIdException;

    boolean isNameValid(String name) throws InvalidNameException;

    boolean isEmailValid(String email) throws InvalidEmailException;

    boolean isPhoneNumberValid(String phoneNumber) 
            throws InvalidPhoneNumberException;

    boolean isDateOfBirthValid(String dobString) 
            throws InvalidDateOfBirthException;

    boolean isRecordExist(List<Registering> registerings, Registering r);
    
   
}
