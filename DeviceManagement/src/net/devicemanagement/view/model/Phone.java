/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.view.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Tuan Anh
 */
public class Phone implements Serializable {

    private String imei;
    private String name;
    private String phase;

    //insert code constructor
    public Phone() {
    }

    public Phone(String imei) {
        setImei(imei);
    }

    public Phone(String imei, String name, String phase) {
        this.imei = imei;
        this.name = name;
        this.phase = phase;
    }

    //insert code getter and setter
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    //Không cho phép nhập trùng IMEI (IMEI không xuất hiện 2 lần)
    //insert code equals and hasdcode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.imei);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Phone other = (Phone) obj;
        if (!Objects.equals(this.imei, other.imei)) {
            return false;
        }
        return true;
    }
    
    //Thêm phương thức toString
    //insert code toString

    @Override
    public String toString() {
        return "Phone{" + "imei=" + imei + ", name=" + name + ", phase=" + phase + '}';
    }
    
}
