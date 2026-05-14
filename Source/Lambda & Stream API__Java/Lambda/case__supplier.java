package Demo_06.Lambda;

import java.util.Random;
import java.util.function.Supplier;

public class case__supplier {
public static Random rd = new Random() ; 
    public static void main ( String [] args ) {      
        // supplier 
        Supplier <String > school = () -> " Đại hoc CNTT "; 
        System.out.println("Trường học :"  +school.get());
        Supplier <Integer > num =() -> rd.nextInt(1, 100) ;
        System.out.println("Số ngẫu nhiên : "+ num.get());  
    }
}
