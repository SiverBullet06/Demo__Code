package CongTy;

public class NhanVien
{
    protected String ten;
    protected String que ;
    protected int  cccd;
    protected double luongCB=5000;

public NhanVien ( String ten , String que , int cccd)
{
    this.ten=ten;
    this.que=que;
    this.cccd=cccd;
}

public double tinhLuong ()
{
    return luongCB;
}
}
