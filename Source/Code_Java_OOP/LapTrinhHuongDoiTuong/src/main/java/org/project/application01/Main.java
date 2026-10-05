package org.project.application01;


import org.project.application01.Models.Book;
import org.project.application01.Service.DocumentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner sc = new Scanner(System.in) ;
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager() ;
        List<Book> bookList = new ArrayList<>() ;
        Book book = new Book() ;
        System.out.println("Nhập số lượng :");
        int n = sc.nextInt() ;
        sc.nextLine();
        for ( int i = 0 ;i <n; i++ ) {
            System.out.println("Nhập thông tin sách  !");
            book.inputBook(sc);
            bookList.add(book) ;
        }
        documentManager.addDocument(book) ;
        System.out.println("=== HIỂN THỊ THÔNG TIN SÁCH ===");
        bookList.forEach( f -> System.out.println(f.getId()));
        System.out.println("List danh sách dữ liệu trong Document  !");
        for ( Book b : bookList ){
            System.out.println(
                    "Mã sách :"+b.getId()+"\n" +
                    "Tiêu đề :"+b.getTittle()+"\n"+
                    "Nhà xuất bản : "+ b.getPublisher()+"\n"+
                    "Số lượng tồn ban đầu :"+b.getQuantity()+"\n"+
                            "Tên tác giã:"+b.getAuthor()
            );
        }
        System.out.println("== THÔNG TIN TÀI LIỆU ===");
        documentManager.displayAll();




    }
}