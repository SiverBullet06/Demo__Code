package B;

import java.util.Scanner;

public class bai2  {
    public static void main(String[] args) {
        System.out.println("Nhap mot chuoi van ban");
        int demSo=0;
        int chuThuong=0;
        int chuHoa=0;
        int space=0;
        Scanner ex = new Scanner(System.in);
        String input =ex.nextLine();
        System.out.println(ex);
        char mang[]=input.toCharArray();
        for (int i=0;i < mang.length;i++){
            if(Character.isDigit(mang[i]))
                demSo++;
            if(Character.isLowerCase(mang[i]))
                chuThuong++;
            if(Character.isUpperCase(mang[i]))
                chuHoa++;
            if(Character.isWhitespace(mang[i]))
                space++;
            



        }
System.out.println("So luong chu so co trong doan chuoi la:  "+demSo);
System.out.println("So luong chu thuong co trong doan chuoi la:  "+chuThuong);
System.out.println("So luong chu Hoa co trong doan chuoi la:  "+chuHoa);
System.out.println("So luong khoang trang co trong doan chuoi la:  "+space);
    }
}
