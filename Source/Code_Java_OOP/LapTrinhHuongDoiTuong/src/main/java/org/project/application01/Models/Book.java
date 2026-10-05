package org.project.application01.Models;


import org.w3c.dom.ls.LSOutput;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Book extends Document{

    private String author  ;
    private int numOfPages ;


    public int getNumOfPages() {
        return numOfPages;
    }
    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Book(String id, String tittle, String publisher, int quantity, String author, int numOfPages) {
        super(id, tittle, publisher, quantity);
        this.author = author;
        this.numOfPages = numOfPages;
    }
    public Book () {
    }


    public void inputBook (Scanner sc) {
        super.inputInfor(sc);
        Book book = new Book() ;
        System.out.println("=== THÔNG TIN SÁCH === ");
            System.out.print("Nhập tên tác giã :");
            author = sc.nextLine() ;
            System.out.print("Nhập sô trang :");
            numOfPages = sc.nextInt() ;
            sc.nextLine() ;

    }
    @Override
    public String toString() {
            super.displayInfor();
            return "Book( author: " + author +
                    "||\t numOfPages" + numOfPages + ")\n";

    }
}
