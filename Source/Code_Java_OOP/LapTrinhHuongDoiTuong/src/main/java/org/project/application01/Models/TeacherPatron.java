package org.project.application01.Models;

public class TeacherPatron extends Patron{
    public TeacherPatron(String patronId, String name, String email) {
        super(patronId, name, email);
    }
    public TeacherPatron () {}
    @Override
    public int getMaxBorrowLimit() {
        return 0;
    }

    @Override
    public double getDailyLateFee() {
        return 0;
    }
}
