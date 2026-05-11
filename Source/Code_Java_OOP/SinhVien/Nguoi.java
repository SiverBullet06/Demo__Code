import java.util.Scanner;

public abstract class Nguoi {
    protected String id ;
    protected String gioiTinh ;
    public static Scanner sc = new Scanner(System.in) ;
    public String getId ( ) {
        return id ;
    }
    public void setId ( String id ) {
        this.id = id ;
    }
    public String getGioiTinh ( ) {
        return gioiTinh ;
    }
    public  void setGioiTinh ( String gioiTinh ) {
        if ( gioiTinh.equals("Nam") || gioiTinh.equals("Nu"))
        {
             this.gioiTinh = gioiTinh ;
        }
        else {
            System.out.println("Loi nhap du lieu .HE THONG CHON :Nam");
            this.gioiTinh = "Nam" ;
        }
    }
    public Nguoi ( String code , String gt) {
        this.id = code ;
        this.gioiTinh = gt ;
    }
    void Xuat () {
        System.out.println("Id: "+id+"\nGioi tinh: "+gioiTinh);
    }
    void Nhap () {
        System.out.print("Nhap id: ");
        String id = sc.nextLine() ;
        System.out.print("Nhap gioi tinh ( chi Nam hoac Nu ");
        String gioiTinh = sc.nextLine() ;
    }
    abstract double tinhHP () ;


}
