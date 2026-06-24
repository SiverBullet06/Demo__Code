import java.util.Scanner;

public class MainHH {
    public static void main ( String [] args ) { 
        Scanner sc = new Scanner(System.in) ; 
        HangHoa hanghoa = new HangHoa() ; 
        while ( true ) {
        String x ; 
        String name ; 
        System.out.println("1.Nhap danh sach hang hoa !"); 
        System.out.println("2.Hien thi danh sach !"); 
        System.out.println("3.Danh sach san pham > 100.000d !"); 
        System.out.println("4.Kiem tra san pham con ton kho khong !"); 
        System.out.println("5.Kiem tra san pham co trong kho khong !"); 
        System.out.println("6.Thong ke so luong hang hoa!"); 
        System.out.println("7.Xem gia don gia cua san pham !"); 
        System.out.println("8.Thanh tien !");
        System.out.println("Vui long chon chuc nang !"); 
        int n = sc.nextInt() ; 
        sc.nextLine() ; 
        switch (n) {
            case 1:
                hanghoa.NhapTT(); 
                break;
            case 2 : 
                hanghoa.XuatTT();
                  // student01.HienThiTT();
                  break ; 
            case 3:
                hanghoa.findHangHoa();
                break;
            case 4 :
                hanghoa.tonKho();
                break  ; 
            case 5 :
                hanghoa.HangHoaYen();
                break  ; 
            case 6 :
                hanghoa.countSoLuongHH();
                break  ;
            case 7 :
                System.out.println("Nhap mat hang can tham khao .");
                name = sc.nextLine() ; 
                double result = hanghoa.PriceHH(name);
                System.out.println(result);
                break  ; 
            case 8 :
                hanghoa.ThanhTien();
                break  ;  
        }
        if (n== 0) { 
            break ; 
        }
    }
    }
}
