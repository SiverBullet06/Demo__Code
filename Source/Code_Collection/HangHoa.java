import java.lang.classfile.ClassFile.Option;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HangHoa {
    private String maHang ; 
    private String tenHang ; 
    private String loaiHang ; 
    private int soLuong ; 
    private double donGia ; 
    public static Scanner sc ; 
    public static ArrayList <HangHoa> hanghoas ;

    public String getMaHang () { 
        return maHang ; 
    }
    public String getTenHang () { 
        return tenHang ; 
    }
    public String getLoaiHang () { 
        return loaiHang  ;
    }
    public void setLoaiHang ( String loaiHang ) { 
        if ( loaiHang =="thung"|| loaiHang =="hop") { 
            this.loaiHang = loaiHang ;
        }
        else 
        {
            System.out.println("Loi nhap lieu { loai hang = thung } ");
            this.loaiHang = "thung" ; 
        }
    }
    public int getSoLuong () { 
        return soLuong  ; 
    }
    public double getDonGia () { 
        return donGia ;
    }
    public HangHoa () { 
        sc = new Scanner(System.in) ; 
        hanghoas = new ArrayList<>() ; 

    }
    public HangHoa ( String maHang , String tenHang , String loaiHang , int soLuong , double donGia ) { 
        this.maHang = maHang ; 
        this.tenHang = tenHang ; 
        this.loaiHang = loaiHang ; 
        this.soLuong = soLuong ; 
        this.donGia = donGia ; 
    }

    //* Nhap thong tin san pham  */
    public void NhapTT () { 
        System.out.print("Nhap so luong hang hoa  : ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nHang Hoa   " + (i + 1));

            System.out.print("Ma hang   : ");
            String maHang = sc.nextLine();

            System.out.print("Ten hang  : ");
            String tenHang  = sc.nextLine();

            System.out.print("Loai hang   : ");
            String loaiHang = sc.nextLine();

            System.out.print("So luong   : ");
            int soLuong  = sc.nextInt();
            sc.nextLine() ; 
            
            System.out.print("Don gia   :");
            double donGia = sc.nextDouble();
            sc.nextLine(); 

            hanghoas.add(new HangHoa(maHang,tenHang,loaiHang,soLuong ,donGia));
        }
    }
        //*Danh sach thong tin hang hoa  */
    public void XuatTT () { 
        Consumer <HangHoa> lists = 
        tt -> System.out.println("Ma hang :"+tt.getMaHang()+"\t"+
                                "Ten hang :"+tt.getTenHang()+"\t"+
                                "Loai hang :"+tt.getLoaiHang()+"\t"+
                                "So luong :"+tt.getSoLuong()+"\t"+
                                "Don gia :"+tt.getDonGia()+"\t");
        hanghoas.forEach(lists); 
    }
    //? Stream ----------
    public void HienThiTT () { 
        hanghoas.stream()
                .forEach(System.out::println);
    }
    // public void findMaxHangHoa () { 
    //     System.out.println("Cac mat hang co gia tren 19.000 la:");
    //     hanghoas.stream()
    //             .filter(tt -> tt.getDonGia()>20.000)
    //             .forEach(System.out::println);
    // }
    //* san pham lon hon 100.000d */
    public void findHangHoa () { 
        Predicate <HangHoa> sp = 
                tt -> tt.getDonGia() > 100.000 ;
        for ( HangHoa hh : hanghoas) {
            if (sp.test(hh)) { 
                System.out.println(hh.getTenHang());
            }
        }
    }
    //* San pham con ton kho ? */
    public void tonKho () { 
        Predicate <HangHoa> sp = 
            tt -> tt.getSoLuong() <0 ; 
            for ( HangHoa hh : hanghoas) {
                if ( sp.test(hh)) { 
                    System.out.println("Da het hang "+hh.getTenHang());
                }
                else { 
                    System.out.println("Con hang ! ");
                }
            }
    }
    //* San pham co ton tai trong kho ? */
    public void HangHoaYen () { 
        Predicate <HangHoa > sp = 
            tt -> tt.getTenHang().equalsIgnoreCase("Yen sao Khanh Hoa") ; 

        for ( HangHoa hh : hanghoas ) { 
            if ( sp.test(hh)) { 
                System.out.println("Co san pham trong cua hang ! \t"+hh.getMaHang());
            }
        }
    }
    //* so luong hang hoa  */
    public void countSoLuongHH () { 
        Predicate <HangHoa > sp = 
            tt -> tt.getSoLuong() > 50 ; 
        for ( HangHoa hh : hanghoas) { 
            if ( sp.test(hh)) { 
                System.out.println("Ma hang :"+hh.getMaHang()+
                                    "\tTen hang :"+hh.getTenHang()+
                                    "\tLoai hang :"+hh.getLoaiHang()+
                                    "\tSoLuong :"+hh.getSoLuong()+
                                    "\tDon gia :"+hh.getDonGia()
                                );
            }
        }
    }
    //*  */
    public void check () { 
        Predicate <HangHoa> sp = 
            tt -> tt.getDonGia()>100000 && tt.getSoLuong() >0 ; 
        for ( HangHoa hh : hanghoas) { 
            if ( sp.test(hh))
            {
                System.out.println(hh) ;
            }
        }
    }
    //* Lay gia cua san pham  */
    public double PriceHH (String tenSP) { 
        double getGia = 0 ;  
        Function <HangHoa , Double  > sp = 
            tt -> tt.getDonGia() ; 
        for ( HangHoa hh :hanghoas ) { 
            if (hh.getTenHang()==tenSP) {
            getGia = sp.apply(hh) ;
            }
        }
        return getGia ; 

    }
    //* Thanh tien san pham  */
    public void ThanhTien () { 
        double thanhtien = 0  ; 
        Function <HangHoa , Double > sp = 
            tt -> tt.getDonGia() * tt.getSoLuong() ; 
        for ( HangHoa hh : hanghoas ){
            thanhtien = sp.apply(hh) ; 
            System.out.println("San pham "+hh.getTenHang()+"co tong tien la :"+thanhtien);
        } 
        return ; 
    }

    //*  */
    public void Stream01 () { 
        hanghoas.stream ()
                .filter(tt -> tt.getSoLuong()>50)
                .forEach(tt -> System.out.println(tt.getTenHang()));
    }
    public void Stream02 () { 
        hanghoas.stream()
                .map(tt -> tt.getTenHang())
                .forEach(System.out::println);
    }
    public void Stream03 () { 
        Optional <String> sp = hanghoas.stream()
                .filter (tt -> tt.getMaHang().equalsIgnoreCase("MH2003"))
                .findFirst()
                .map(HangHoa::getTenHang) ; 
            // sp.ifPresent(System.out.println);
    }

    public int Stream04 () { 
        int result = 0 ;
        boolean x = hanghoas.stream()
                            .allMatch(tt -> tt.getDonGia()>100.000) ;
        if (x) { 
            System.out.println("Tat ca hang hoa dem co don gia ten 99.000");
            result = 1 ;
        }
        return result ; 
    }

    // public void findMaxHangHoa ()  { 
    //     Function <HangHoa,String > results =
    //         tt -> { System.out.println("Ma hang :"+tt.getMaHang()+"\t"+
    //                             "Ten hang :"+tt.getTenHang()+"\t"+
    //                             "Loai hang :"+tt.getLoaiHang()+"\t"+
    //                             "So luong :"+tt.getSoLuong()+"\t"+
    //                             "Don gia :"+tt.getDonGia()+"\t");
    //                 }
                    
    // }



}
