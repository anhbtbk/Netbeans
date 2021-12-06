/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.buituananh.model.exception;

/**
 *
 * @author Tuan Anh
 */
public class InvalidPersionIdException extends Exception {
    private String invalidId;

    public InvalidPersionIdException() {
    }

    public InvalidPersionIdException(String invalidId, String message) {
        super(message);
        this.invalidId = invalidId;
    }

    public String getInvalidId() {
        return invalidId;
    }

    public void setInvalidId(String invalidId) {
        this.invalidId = invalidId;
    }
    

}
