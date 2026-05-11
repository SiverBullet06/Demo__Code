import java.util.ArrayList;
import java.util.Scanner;
public class Tao_arraylist {
    //    public void Nhap ( Arraylist <Integer> , Scanner sc , int n ) {
//        System.out.println("Nhap so luong phan tu:");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            try {
//                System.out.println("Nhap phan tu thu: " + (i + 1));
//                int value = sc.nextInt();
//                listName.add(value);
//            } catch (Exception e) {
//                System.out.println("Loi nhap du lieu!");
//                throw new RuntimeException(e);
//            }
//        }
//
//        System.out.println("List goc la: " + listName);
//
//        Tao_arraylist ob = new Tao_arraylist();
//        String result1 = ob.checking1_list(listName, sc);
//
//        System.out.println(result1);
//    }

//    public String checking1_list(ArrayList<Integer> listName, Scanner sc) {
//
//        System.out.println("Nhap gia tri can xoa:");
//        int giaTri = sc.nextInt();
//
//        boolean timThay = false;
//
//        for (int i = 0; i < listName.size(); i++) {
//            if (giaTri == listName.get(i)) {
//                listName.remove(i);
//                timThay = true;
//                break;
//            }
//        }
//
//        if (!timThay) {
//            return "Khong tim thay phan tu " + giaTri + " trong list!";
//        }
//
//        return "List sau khi cap nhat la: " + listName;
//    }


public class Student {
    public String id ;
    public String name ;
    public double score ;
    public String adress ;
    public Student ( String id ,String name ,double score , String adress  ) {
        this.id = id ;
        this.name =name ;
        this.score  = score ;
        this.adress = adress ;

    }
    public void printInfo () {
        System.out.println("Ten: " + name + ", Diem: " + score + ", Que quan: " + adress );
    }
}

public void Nhap_DS_ArraySV ( ArrayList <Student> students , Scanner sc ) {
    System.out.println("Nhap so luong sinh vien : ");
    int n = sc.nextInt();
    sc.nextLine();
    for ( int i = 0 ; i< n ; i++ ) {
        try {
            System.out.println("Nhap id cua sinh vien thu "+ ( i+1)+" :");
            String id = sc.nextLine();
            System.out.println("Nhap ten sinh vien co id  "+id+" :");
            String name = sc.nextLine();
            System.out.println("Nhap diem trung binh cua "+name+" :");
            double score = sc.nextDouble();
            sc.nextLine();
            System.out.println("Nhao que quan :");
            String adress = sc.nextLine();
            students.add (new Student(id , name ,score , adress )) ;
        } catch (Exception e) {
            System.out.println("Loi nhap du lieu !");
            throw new RuntimeException(e);
        }
    }
    System.out.println("Danh sach sinh vien:");
    for (Student s : students) {
        s.printInfo();
    }
}

public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Tao_arraylist ob = new Tao_arraylist();
    ob.Nhap_DS_ArraySV(students , sc );
    System.out.println(ob);

}
}


