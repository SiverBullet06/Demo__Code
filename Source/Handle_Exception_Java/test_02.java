package Demo_06.Stream;

import java.util.ArrayList;
import java.util.Scanner;
public class test_02 {
    static class ChuyenXe {
        protected String maSo ; 
        protected String tenTai ; 
        protected String dDi ; 
        protected String dDen ; 
        protected float giaVe ; 
            protected boolean has_vourcher ; 
            static Scanner sc = new Scanner (System.in ) ; 
    public String getMaSo () {
        return maSo ; 
    }
    public void setMaSo ( String maSo ) {
        this.maSo = maSo ; 
    }
    public String getTenTai ( ) {
        return tenTai ; 
    }
    public void setTenTai ( String tenTai ) {
        this.tenTai = tenTai ; 
    }
    public String getDDi () {
        return dDi ; 
    }
    public void setDDi ( String dDi ) {
        this.dDi = dDi ; 
    }
    public String getDDen ( ) { 
        return dDen ; 
    }
    public void setDDen ( String dDen ) {
        this.dDen = dDen ; 

    }
    public float getGiaVe ( ) {
        return giaVe ; 
    }
    public void setGiaVe ( float giaVe ) { 
            if ( giaVe <=0 ) 
            {
                System.out.println("Loi nhap lenh");
                this.giaVe = 0 ; 
            }
            else {
                this.giaVe = giaVe ; 
            }
    }
    public ChuyenXe () 
    {

    }
    public ChuyenXe ( String ms , String ten , String diemdi , String diemden , float gia , boolean vourcher ) {
        this.maSo = ms ; 
        this.tenTai = ten ; 
        this.dDi = diemdi ; 
        this.dDen = diemden ; 
        this.giaVe = gia ; 
        this.has_vourcher = vourcher ;
    }
    public void Nhap () {
        ArrayList <ChuyenXe> chuyenxe = new ArrayList<>() ; 
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Nhap ma so cua chuyen xe : ");
        maSo = sc.nextLine() ; 
        System.out.println("Nhap ho ten cua tai xe xe : ");
        tenTai = sc.nextLine() ;
        System.out.println("Nhap noi xuat phat  : ");
        dDi = sc.nextLine() ; 
        System.out.println("Nhap noi den : ");
        dDen = sc.nextLine() ; 
        sc.nextLine();
        System.out.println("Nhap gia ve  : ");
        giaVe = sc.nextFloat() ; 
        sc.nextLine();
        System.out.println("Ban co so huu vourcher khong ? : ");
        has_vourcher = sc.nextBoolean() ; 
        chuyenxe.add(new ChuyenXe(maSo , tenTai , dDi , dDen , giaVe , has_vourcher )) ; 
        ////stream -------------------------
        chuyenxe.stream() 
                .filter(m -> m.getMaSo ().startsWith("2")) 
                .findFirst()
                .ifPresent( p ->
                  System.out.println (p.maSo +"--- "+p.dDen )   
                );
    }
    public void Xuat () {
        System.out.println("Ma so chuyen:"+maSo );
        System.out.println("Ho ten tai xe:"+tenTai );
        System.out.println("Diem xuat phat:"+dDi );
        System.out.println("Diem ket thuc :"+dDen );
        System.out.println("Nhap gia ve : " + giaVe );
        System.out.println("Voucher:"+has_vourcher );
    }

}

}
