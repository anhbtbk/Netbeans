/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.buituananh.model;

import java.io.Serializable;

/**
 *
 * @author Tuan Anh
 */
public class Subject implements Serializable {

    private int id;
    private static int sId = 100000;
    private String name;
    private String kind;
    private int numOfLession;
    public Object getNumOfLession;

    public Subject() {
        id = sId++;
    }

    public Subject(int id) {
        this.id = id;
    }

    public Subject(String name, String kind, int numOfLession) {
        this();
        this.name = name;
        this.kind = kind;
        this.numOfLession = numOfLession;
    }

    public Subject(int id, String name, String kind, int numOfLession) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.numOfLession = numOfLession;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getsId() {
        return sId;
    }

    public static void setsId(int sId) {
        Subject.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getNumOfLession() {
        return numOfLession;
    }

    public void setNumOfLession(int numOfLession) {
        this.numOfLession = numOfLession;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
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
        final Subject other = (Subject) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", name=" + name
                + ", kind=" + kind + ", numOfLession=" + numOfLession + '}';
    }

}
