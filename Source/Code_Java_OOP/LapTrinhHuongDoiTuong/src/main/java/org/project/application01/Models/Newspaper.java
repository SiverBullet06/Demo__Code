package org.project.application01.Models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Newspaper extends Document {
    private int issueNumber ;
    private LocalDate publishDate  ;

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Newspaper(String id, String tittle, String publisher, int quantity, int issueNNumber, LocalDate publishDate) {
        super(id, tittle, publisher, quantity);
        this.issueNumber = issueNNumber;
        this.publishDate = publishDate;
    }

    public Newspaper () { }

    void inputNewspaper (Scanner sc) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy") ;
        super.inputInfor(sc);
        System.out.println("Thông tin tạp chí ");
        System.out.print("Nhập số phát hành: ");
        issueNumber = sc.nextInt() ;
        sc.nextLine() ;
        System.out.print("Nhập ngày phát hành: ");
        String datetime = sc.nextLine() ;
        publishDate = LocalDate.parse(datetime , formatter);

    }
    @Override
    public String toString() {
        super.displayInfor();
        return "Số phát hành :"+issueNumber +"||\t" +
                "Ngày phát hành :"+publisher  ;
    }


}
