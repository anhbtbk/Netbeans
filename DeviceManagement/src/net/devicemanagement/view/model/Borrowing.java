/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.devicemanagement.view.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Tuan Anh
 */
public class Borrowing implements Serializable {
    private Employee employee;
    private Phone phone;
    private Pc pc;
    private Laptop laptop;
    private Monitor monitor;
    private Date borrowingDate;

    public Borrowing() {
    }

    public Borrowing(Employee employee, Phone phone, Pc pc, Laptop laptop, 
            Monitor monitor, Date borrowingDate) {
        this.employee = employee;
        this.phone = phone;
        this.pc = pc;
        this.laptop = laptop;
        this.monitor = monitor;
        this.borrowingDate = borrowingDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Pc getPc() {
        return pc;
    }

    public void setPc(Pc pc) {
        this.pc = pc;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Date getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.employee);
        hash = 89 * hash + Objects.hashCode(this.phone);
        hash = 89 * hash + Objects.hashCode(this.pc);
        hash = 89 * hash + Objects.hashCode(this.laptop);
        hash = 89 * hash + Objects.hashCode(this.monitor);
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
        final Borrowing other = (Borrowing) obj;
        if (!Objects.equals(this.employee, other.employee)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.pc, other.pc)) {
            return false;
        }
        if (!Objects.equals(this.laptop, other.laptop)) {
            return false;
        }
        if (!Objects.equals(this.monitor, other.monitor)) {
            return false;
        }
        return true;
    }
    
    
    
}
