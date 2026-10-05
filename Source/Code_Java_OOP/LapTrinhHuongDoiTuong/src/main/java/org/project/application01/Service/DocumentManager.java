package org.project.application01.Service;

import org.project.application01.Models.Document;

import java.util.ArrayList;
import java.util.List;

public class DocumentManager {
    public  List<Document> documents = new ArrayList<>() ;

    public DocumentManager () { }



    public boolean addDocument ( Document document) {
        System.out.println("---- Information about Document ----");
        if ( document == null ) {
            return false;
        }

        for ( Document doc : documents ) {
            if (doc.getId().equalsIgnoreCase(document.getId())){
                System.out.println("Lỗi mã tài liệu đã tồn tại: "+document.getId());
                return false ;
            }
        }
        this.documents.add(document) ;
        System.out.println("Đã thêm dữ liệu thành công !");

        return true ;
    }
    public void displayAll () {
        if (documents.isEmpty()){
            System.out.println("Danh sách tài liệu đang trống !");
        }
        for ( Document doc : documents) {
            doc.displayInfor();
        }
    }

    public void findDocumentByTittle (String keyword  ) {
        if ( keyword == null && keyword.trim().isEmpty()) {
            System.out.println("Từ khóa trên không được để trống ");
        }
        String key = keyword.trim().toLowerCase() ;
        boolean found = false ;
        for ( Document doc : documents ) {
            if (doc.getTittle()!= null && doc.getTittle().toLowerCase().contains(key)) {
                doc.displayInfor();
                found = true ;
            }
        }
        if ( !found) {
            System.out.println("Không tìm thấy tài liệu nào khớp với từ khóa trên !");
        }

    }
}
