package Demo_06.Lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class case__predicate {
    public static void main ( String [] args ) { 
        Scanner sc = new Scanner(System.in ) ; 
        System.out.println(" nhap so bat ki ");
        int number = sc.nextInt();
        Predicate < Integer  > value = x -> x % 2 == 0 ; 
        if ( value.test(number)) { 
            System.out.println(number +" la so chan ");
        }
        else { 
            System.out.println(number + " la so le ");
        }
    }
}
