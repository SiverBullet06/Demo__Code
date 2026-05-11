package CongTy;


public class test {
    public static void main(String[] args) {
        NhanVien sv_1=new NhanVien ("Dang Hoang Giang","Khanh Hoa",4000);
   
NvHanhChinh sv_2 =new NvHanhChinh("Nguyen Dang Hung", "Bac Ninh", 4733);
double luong_sv2 =sv_2.tinhLuong();
System.out.println("Luong cua nhan vien 2 la"+luong_sv2);

    }
}
