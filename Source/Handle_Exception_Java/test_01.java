package Demo_06.Stream;

import java.util.ArrayList;
import java.util.Scanner;

public class test_01 {
    public static Scanner sc = new Scanner(System.in) ; 
     static class SinhVien { 
        private String maSo  ; 
        private String hoTen ; 
        private float  diemSo ; 
        public String  getMaSo () 
        { 
            return maSo ; 
        }
        public void setMaSo ( String maSo ) { 
            this.maSo = maSo ; 
        }
        public String getHoTen () { 
    
            return hoTen ; 
        }
        public void  setHoTen ( String hoTen )  { 
            this.hoTen = hoTen ; 
        } 
        public float getdiemSo () { 
            return diemSo   ; 
        }
        public void setDiemSo ( float diemSo ) { 
            this.diemSo =diemSo ; 
        }
        public SinhVien () { 

        }
        public SinhVien ( String id , String name , float diem  ) { 
            this.maSo = id ; 
            this.hoTen = name ; 
            this.diemSo = diem ; 
        }
    }
public static void main ( String [] args ) { 
        ArrayList < SinhVien > sinhvien = new ArrayList<>() ; 
        System.out.print("Nhap so luong sinh vien : ");
        int n = sc.nextInt() ; 
        sc.nextLine() ; 
        for ( int i = 0 ; i<= n ; i++ ) { 
            System.out.println("===NHAP THONG TIN CHO SINH VIEN THU "+i+ " :");
            System.out.print("Nhap ma so sinh vien : ");
            String maSo = sc.nextLine() ; 
            System.out.print ("Nhap ho va ten cua sinh vien : ");
            String hoTen = sc.nextLine() ; 
            System.out.print("Nhap diem cua hoc sinh : ");
            float diemSo = sc.nextFloat() ; 
            sc.nextLine() ; 
            sinhvien.add( new SinhVien(maSo , hoTen , diemSo)) ;
        }
        System.out.println("DANH SACH SINH VIEN LA : ");
        sinhvien.forEach(System.out::println);
        //stream -----------------------------
        sinhvien.stream()
                .filter(d->d.diemSo > 8.0) 
                .forEach  (p ->
                    System.out.println(p.hoTen +"--  "+p.diemSo )
                 ) ;
    }
   
}
 