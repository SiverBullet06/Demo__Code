package B;

import java.util.Scanner;
public class bai1 {
    public static void main (String[]args){
        StringBuilder chuoi= new StringBuilder();
        System.out.println("Nhap vao mot chuoi ki tu");
            Scanner input1= new Scanner(System.in);
            Scanner input2= new Scanner(System.in);
        String s1=input1.nextLine();
        String s2=input2.nextLine();
  System.out.println(s1); 
  System.out.println(s2); 
        System.out.println(s1.length());
        System.out.println(s2.length());
    int check=s1.compareToIgnoreCase(s2);
    System.out.println(check);
    String mang []=s1.split(" ");
    for (int i=0;i<=mang.length;i++){
        System.out.println(mang[i]);
    }

     }

}
