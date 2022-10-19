package com.nestdigital.studentbackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dataentry")
public class DataentryModel {
    @Id
    @GeneratedValue
    private int id;
    private String studentname;
    private String clubname;
    private String clubcolour;
    private String moto;

    public DataentryModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public String getClubcolour() {
        return clubcolour;
    }

    public void setClubcolour(String clubcolour) {
        this.clubcolour = clubcolour;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public DataentryModel(int id, String studentname, String clubname, String clubcolour, String moto) {
        this.id = id;
        this.studentname = studentname;
        this.clubname = clubname;
        this.clubcolour = clubcolour;
        this.moto = moto;
    }
}
