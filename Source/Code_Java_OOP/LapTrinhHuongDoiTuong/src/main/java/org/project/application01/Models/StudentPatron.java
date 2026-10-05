package org.project.application01.Models;

public class StudentPatron extends Patron {

    public StudentPatron(String patronId, String name, String email) {
        super(patronId, name, email);
    }

    @Override
    public int getMaxBorrowLimit() {
        return 0;
    }

    @Override
    public double getDailyLateFee() {
        return 0;
    }
}
