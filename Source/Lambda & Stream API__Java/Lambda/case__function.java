package Demo_06.Lambda;

import java.util.Scanner;
import java.util.function.Function;
public class case__function {
    public static void main ( String [] args ) { 
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Nhap ho va ten cua ban : ");
        String text = sc.nextLine()  ;
        Function < String  ,String > value = (s) -> s.toUpperCase()   ;
        System.out.println("ho va ten cua ban : " + value.apply(text));
    }

}
