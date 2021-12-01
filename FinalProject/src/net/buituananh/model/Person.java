/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.buituananh.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Tuan Anh
 */
public class Person implements Serializable {

    private String id;
    private String address;
    private String email;
    private String phoneNumber;
    private FullName fullName;
    private Date dob;

    public Person() {
        fullName = new FullName();
    }

    public Person(String id) {
        this.id = id;
    }

    public Person(String id, String address, String email,
            String phoneNumber, String fullName, Date dob) {
        this();
        this.id = id;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        setFullName(fullName);
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName.last + " " + this.fullName.mid + this.fullName.first;
    }

    public void setFullName(String fullName) {
        var words = fullName.split("\\s+");
        this.fullName.first = words[words.length - 1];
        this.fullName.last = words[0];
        for (int i = 0; i < words.length; i++) {
            this.fullName.mid += words[i] + " "; //Đối với những người 
            //có 2 từ đệm trở lên, dấu cách " " ở đây sẽ dùng để phân tách
        }
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    class FullName implements Serializable {

        private String first;
        private String mid;
        private String last;

        public FullName() {
            first = "";
            last = "";
            mid = "";
        }

        public FullName(String first, String mid, String last) {
            this.first = first;
            this.mid = mid;
            this.last = last;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
