import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String maSo ;  
    private String hoTen ;
    private double diemSo ; 
    public static Scanner sc ; 
    public static ArrayList <Student> studentList ; 
    public String getMaSo ()  { 
        return maSo ; 
    }
    public void setMaSo ( String maSo ) { 
        this.maSo = maSo ; 
    }
    public String getHoTen () { 
        return hoTen ; 
    }
    public void setHoTen  ( String hoTen ) { 
        this.hoTen = hoTen ; 
    }
    public double getDiemSo () { 
        return diemSo ; 
    }
    public void setDiemSo ( double diemSo ) { 
        this.diemSo = diemSo ; 
    }
    public Student () { 
        sc = new Scanner(System.in ) ;
        studentList = new ArrayList<>() ;  
    }
    public Student (  String maSo , String hoTen , double diemSo ) { 
        this.maSo = maSo ;
        this.hoTen = hoTen ; 
        this.diemSo = diemSo ; 
    }
    public void NhapTT () { 
        System.out.print("Nhap so luong sinh vien : ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nSinh vien  " + (i + 1));

            System.out.print("Ma so sinh vien : ");
            String maSo = sc.nextLine();

            System.out.print("Ho va ten : ");
            String hoTen  = sc.nextLine();

            System.out.print("Diem: ");
            double diemSo = sc.nextDouble();
            sc.nextLine(); 

            studentList.add(new Student(maSo,hoTen,diemSo ));
        }
    }
    // public void HienThiTT () { 
    //     System.out.println("\n--- DANH SÁCH SINH VIÊN VỪA NHẬP ---");
    //     for (Student st : studentList) {
    //        System.out.println("Ma so sinh vien: " + st.getMaSo() + 
    //                            "\tHo va ten: " + st.getHoTen() + 
    //                            "\tDiem so: " + st.getDiemSo());
    //     }
    // }
    public void Xuat () { 
        studentList.forEach(
            tt -> System.out.println(tt.getMaSo() +tt.getHoTen() +tt.getDiemSo() )
        );
    }
    //? Xuat ra sinh vien co diem cao nhat la :
    public void findmaxScore () { 
        Student st = Collections.max(studentList ,
             (s1,s2 ) -> Double.compare( s1.getDiemSo() , s2.getDiemSo() ) 
        ) ;
        System.out.println("Sinh vien co diem cao nhat la \n"+
                            "Ma so sinh vien:"+st.getMaSo()+"|\t"+
                            "Ho ten sinh vien:"+st.getHoTen()+"|\t"+
                            "Diem so :"+st.getDiemSo()
        );
    }    
    //? Loc so hoc sinh tren diem 8 
    public int  countStudent () { 
        List<Double> result = new ArrayList<>() ; 
        studentList.forEach(
            tt -> result.add(tt.getDiemSo())
        );
        int n = Collections.frequency(result, 8) ; 
        return n ; 
    }
    
    
    //? Sap xep sinh vien theo diem 
    public void sapXep () { 
    studentList.sort(
        (s1, s2) -> 
                Double.compare( s1.getDiemSo() , s2.getDiemSo() )
    );
    }
    //? Timf sinh vien theo ten trong danh sach 
    public void  findStudent ( String x ) { 
        for ( Student st : studentList ) { 
            if ( st.getHoTen().equals(x)) { 
                System.out.println(" Co sinh vien "+x+" trong danh sach dau ki thi THPT ");
                System.out.println("MSSV: " + st.getMaSo() + " | Ho ten : " + st.getHoTen() + " | Điem: " + st.getDiemSo());
            }
    } 
    }
    //? sap xep danh sach 
    public void sortListbyScore () { 
        for ( int i = 0 ; i < studentList.size() - 1 ; i++) { 
            for ( int j = 1+i ; j< studentList.size() ; j ++ ) {
                Student tempStudent = studentList.get(i); 
                if (studentList.get(i).getDiemSo()<studentList.get(j).getDiemSo()) { 
                    studentList.set(i, studentList.get(j));
                    studentList.set(j, tempStudent);
                }
            }
        }
        System.out.println("Da sap xep thanh cong ");
        for (Student st : studentList) {
           System.out.println("Ma so sinh vien: " + st.getMaSo() + 
                               "\tHo va ten: " + st.getHoTen() + 
                               "\tDiem so: " + st.getDiemSo());
        }

    } 
    //? kiem tra danh sach rong 
    public void  emptySudent () { 
        if ( studentList.isEmpty()) { 
            System.out.println("Chua co du lieu trong danh sach !");
        }
        else { 
            System.out.println(" Danh sach da duoc cap nhat !");
        }
    }
    


}
