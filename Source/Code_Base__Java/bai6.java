package B;

import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
     String a="abcdefghijk";
     String b="zxcvbnamsdf";
     System.out.println("NHAP DOAN TIN NHAN CAN MA HOA");
     Scanner ex=new Scanner (System.in);
     String input=ex.nextLine();
     String output="";
     for(int i=0;i<input.length();i++){
        char phantu=input.charAt(i);
        int index =a.indexOf(phantu);
        if(index==-1){
            output+=phantu;
        }
        else
        {
            output+=b.charAt(index);
        }
     }
System.out.println("Tin nhan sau ma hoa la :"+output);
     }


    }

