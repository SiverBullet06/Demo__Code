package org.project.application02.models;

import java.util.Objects;
import java.util.Scanner;

/*
 * =========================================================================
 * 1. TÍNH KẾ THỪA (INHERITANCE):
 * - `Student extends Person`: Lớp Student kế thừa toàn bộ thuộc tính và phương thức
 *   của lớp cha `Person` (id, fullName, age, address, phone, inputInformation, displayInfor).
 * - Tái sử dụng mã nguồn và thể hiện mối quan hệ "IS-A" (Sinh viên LÀ MỘT Con người).
 * =========================================================================
 */
public class Student extends Person implements I_evaluateRanking{

    /*
     * =====================================================================
     * 2. TÍNH ĐÓNG GÓI (ENCAPSULATION):
     * - Các thuộc tính riêng của Student (`score`, `classes`) được đặt là `private`.
     * - Chỉ có thể truy cập hoặc sửa đổi thông qua Getter / Setter.
     * =====================================================================
     */
    private float score;
    private String classes;
    public static double tution = 10000000 ;

    public static double getTution() {
        return tution;
    }

    public static void setTution(double tution) {
        Student.tution = tution;
    }
    /*
     * =====================================================================
     * TÍNH ĐA HÌNH LÚC BIÊN DỊCH (COMPILE-TIME POLYMORPHISM)
     * -> NẠP CHỒNG HÀM KHỞI TẠO (CONSTRUCTOR OVERLOADING):
     * - Trong cùng class `Student`, có nhiều Constructor cùng tên nhưng khác
     *   nhau về số lượng và kiểu tham số truyền vào.
     * =====================================================================
     */

    // 1. Constructor mặc định (không tham số)
    public Student() {
    }

    // 2. Constructor có 7 tham số -> Nạp chồng (Overload) với Constructor không tham số
    public Student(String id, String fullName, int age, String address, String phone , float score , String classes , double tution) {
        // Sử dụng từ khóa `super` để gọi Constructor của lớp cha Person
        super(id, fullName, age, address, phone);
        this.score = score;
        this.classes = classes;
        this.tution = tution ;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student inputStudent(Scanner sc) {
        // Gọi lại phương thức nhập thông tin cơ bản của lớp cha
        super.inputInformation(sc);
        System.out.println("Nhập điểm số :");
        this.score = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhập tên lớp học :");
        this.classes = sc.nextLine();

        System.out.println("Thêm đối tượng cụ thể cho lớp cha");
        return this;
    }

    /*
     * =====================================================================
     * 3. TÍNH ĐA HÌNH (POLYMORPHISM) - GHI ĐÈ PHƯƠNG THỨC (METHOD OVERRIDING):
     * - `@Override displayInfor()`: Lớp con `Student` định nghĩa lại hành vi
     *   hiển thị thông tin của lớp cha `Person` để bổ sung thêm điểm số và lớp học.
     * =====================================================================
     */
    @Override
    public String  toString() {
        // Tái sử dụng phương thức hiển thị của lớp cha
        super.displayInfor();
         return
                "Điểm số :" + score + "\n" +
                "Tên lớp học :" + classes ;
    }

    /*
     * =====================================================================
     * 4. TÍNH ĐA HÌNH (GHI ĐÈ TỪ LỚP GỐC OBJECT):
     * - Ghi đè phương thức `equals` và `hashCode` từ lớp Object của Java.
     * - Định nghĩa lại tiêu chí bằng nhau giữa 2 đối tượng Student (dựa trên id).
     * =====================================================================
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student st = (Student) obj;
        return Objects.equals(this.id, st.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    @Override
    public String evaluateRanking() {
        Student st = new Student() ;
        if (st.getScore() >= 9){
            return "A" ;
        }
        else if (st.getScore() >= 8){
            return "B+" ;
        }
        else if (st.getScore() >= 7.5) {
            return "B";
        }else if (st.getScore() >=6.5){
            return "C";
        }else if (st.getScore() >=5.5 ){
            return "D";
        }else {
            return "F" ;
        }
    }
}
