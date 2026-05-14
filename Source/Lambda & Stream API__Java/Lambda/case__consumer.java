package Demo_06.Lambda;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.Calendar ; 
public class case__consumer {
    public static Calendar cl = Calendar.getInstance() ; 
    public static Scanner sc = new Scanner(System.in) ;
    private String hoTen ; 
    private int namSinh ; 

    public String getHoTen ( ) { 
        return hoTen  ; 
    } public void setHoTen ( String hoTen ) { 
        this.hoTen  =hoTen ; 
    }
    public int getNamSinh () { 
        return namSinh ; 
    }
    public void setNamSinh ( int namSinh ) { 
        this.namSinh = namSinh ; 
    }
    public case__consumer () { 
         
    }
    public case__consumer ( String name , int age ) { 
        this.hoTen =name ; 
        this.namSinh = age ;
    }
    public void Nhap () { 
        System.out.print("Nhap ho va ten cua sinh vien :");
        hoTen = sc.nextLine() ; 
        System.out.print("Nhap nam sinh  cua sinh vien :");
         
    }

    public static void main ( String [] args ) { 
        // Lambda không có tham số 
        Runnable text = () -> {
            System.out.println("Hello World ! ");
        } ; 
        text.run () ;
        //Lambda có tham số 
        int yearOfNow ;
        System.out.print("Nhap nam sinh cua ban : ");
        int birth =sc.nextInt() ; 
         yearOfNow = cl.get (Calendar.YEAR) ; 
         Consumer <Integer> nameOfPer = (x) -> { 
            System.out.println("So tuoi cua ban la : "+ (yearOfNow - x ));
         } ; 
         nameOfPer.accept(birth);
    }
}
