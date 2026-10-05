package org.project.application01.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public abstract class Patron {
    protected String patronId ;
    protected String name ;
    protected String email ;

    public String getPatronId() {
        return patronId;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Patron () {}
    public Patron(String patronId, String name, String email) {
        this.patronId = patronId;
        this.name = name;
        this.email = email;
    }

    public  int getMaxBorrowLimit () {
        return 1 ;
    }
    public  double getDailyLateFee () {
        return  1.1 ;
    }
}
