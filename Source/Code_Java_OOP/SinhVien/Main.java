import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SinhVien sv = new SinhVien("2001240113","Nam") ;
        sv.Nhap();
        sv.Xuat();
        System.out.println("Tong so tien : "+sv.tinhHP()) ;
    }
    }
