public class SinhVien extends Nguoi  {
    private String maSSV ;
    private String heDT ;
    private double tongTC ;
    public SinhVien (String code , String gt  ) {
        super ( code , gt  ) ;
        this.tongTC  = tongTC ;
        this.heDT = heDT ;
        this.maSSV = maSSV ;
    }

    public String getMaSSV () {
        return maSSV ;
    }

    public void setMaSSV(String maSSV) {
        this.maSSV = maSSV;
    }
    public String getHeDT () {
        return heDT  ;
    }
    public void setHeDT ( String heDT ) {
        if ( heDT.equals("Cao Dang")||heDT.equals("Dai Hoc")||heDT.equals("Cao Dang Nghe"))
        {
        this.heDT = heDT   ;
        }
        else
        {
            this.heDT = "Dai Hoc" ;
        }
    }
    public double getTongTC () {
        return tongTC ;
    }
    public void setTongTC ( double tongTC ) {
        this.tongTC = tongTC ;
    }
    public double tinhTongTC () {
        if ( this.heDT.equals("Dai Hoc"))
        {
            return 150 ;
        }
        else if ( this.heDT.equals("Cao Dang"))
        {
            return 100 ;
        }
        else {
            return 130 ;
        }
    }
    public double tinhHPT ( )
    {
        if ( this.heDT.equals("Dai Hoc"))
        {
            return 200 ;
        }
        else if ( this.heDT.equals("Cao Dang"))
        {
            return 150 ;
        }
        else {
            return 120 ;
        }

    }

    @Override
    double tinhHP() {
        return tinhHPT() * tinhTongTC();
    }

    @Override
    void Xuat() {
        super.Xuat();
        System.out.print("Nhap ma so sinh vien :");
        String maSSV = sc.nextLine();
        System.out.print("Nhap he dao tao :");
        String heDT = sc.nextLine();
        System.out.print("Nhap tong tinh chi :");
        double tongTC = sc.nextDouble();
    }

    @Override
    void Nhap() {
        super.Nhap();
        System.out.println("Ma so sinh vien: "+maSSV+"\nHe dao tao: "+heDT+"\nTong tinh chi: "+tongTC);
    }
}
