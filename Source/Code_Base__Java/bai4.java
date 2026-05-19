package B;

import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=0;
        System.out.println("Nhap mat khau");
        String password=input.nextLine();
        while(true){
            System.out.println("Moi ban nhap lai mat khau de dang nhap");
            String newpassword=input.nextLine();
            if (password==newpassword){
            System.out.println("Mat khau trung khop!");
                        break;
            }
            else{
                System.out.println("Mat khau khong trung khop");
                System.out.println("Mat khau khong trung khop qua 3 lan se khoa ung dung");
                count++;
                while(count==3)
                {
                            System.out.println("KHOA UNG DUNG");

                        }
            }
        }
        
    }
    public static boolean check(String password){
        if (password.length()<6)
        return false;

        boolean hasLetter=false;
        for(char pt:password.toCharArray()){
            if(Character.isLetter(pt)){
                hasLetter=true;
                    break;
            }
        }
        if (hasLetter=false)
        return false;

        boolean hasNumber=false;
        for(char pt:password.toCharArray()){
            if(Character.isDigit(pt)){
                hasNumber=true;
                    break;
            }
        }
        if(hasNumber=false)
        return false;
        return true;
    }
}
