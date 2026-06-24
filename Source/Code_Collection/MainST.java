import java.util.Scanner;

public class MainST {
    public static void main ( String [] args ) { 
        Scanner sc = new Scanner(System.in) ; 
        Student student01 = new Student() ;
        HangHoa hanghoa = new HangHoa() ; 
        while ( true ) {
        String x ; 
        System.out.println("1.Nhap danh sach sinh vien !"); 
        System.out.println("2.Hien thi danh sach !"); 
        System.out.println("3.Tim kiem danh sach sinh vien !"); 
        System.out.println("4. Sap xep theo diem !"); 
        System.out.println("Vui long chon chuc nang !"); 
        int n = sc.nextInt() ; 
        sc.nextLine() ; 
        switch (n) {
            case 1:
                student01.NhapTT(); 
                break;
            case 2 : 
                student01.Xuat();
                  // student01.HienThiTT();
                  break ; 
            case 3:
                System.out.println("Nhap sinh vien can tim kiem :");
                x = sc.nextLine() ; 
                student01.findStudent(x);
                break;
            case 4 :
                student01.sortListbyScore();
                break  ; 
        }
        if (n== 0) { 
            break ; 
        }
    }
    }
}
