package org.project.application01.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.Doc;
import java.lang.annotation.Documented;
import java.util.*;


public abstract class Document {
    protected String id ;
    protected String tittle ;
    protected String publisher ;
    protected int quantity ;
    public static Scanner sc ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Document(String id, String tittle, String publisher, int quantity) {
        this.id = id;
        this.tittle = tittle;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public Document () {}
    void inputInfor (Scanner sc ) {
            System.out.println("=== THÔNG TIN SÁCH === ");
            System.out.print("Nhập mã tài liệu :");
            id = sc.nextLine();
            System.out.print("Nhập tiêu đề :");
            tittle = sc.nextLine();
            System.out.print("Nhập nhà xuất bản :");
            publisher = sc.nextLine();
            System.out.print("Số lượng tồn ban đầu :");
            quantity = sc.nextInt();
            sc.nextLine() ;
    }
    public String displayInfor () {

        return "Document( id: " + getId()+
                "||\t tittle: " + getTittle() +
                "||\t publisher: " + getPublisher() +
                "||\t quantity: " + getQuantity() +")" ;
    }

}
