package com.srahibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aid;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return Aname;
    }

    public void setAname(String Aname) {
        this.Aname = Aname;
    }

    public String getTech() {
        return tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", Aname='" + Aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    private String Aname;
    private String tech;



}
