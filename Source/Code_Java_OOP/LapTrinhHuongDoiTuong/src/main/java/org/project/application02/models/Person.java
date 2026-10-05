package org.project.application02.models;

import java.util.Scanner;

/*
 * =========================================================================
 * 1. TÍNH TRỪU TƯỢNG (ABSTRACTION):
 * - Lớp trừu tượng `public abstract class Person` đại diện cho khái niệm
 *   chung về "Con người". Lớp này không thể khởi tạo đối tượng trực tiếp (new Person())
 *   mà đóng vai trò làm lớp cơ sở (khuôn mẫu) cho các lớp cụ thể như Student kế thừa.
 * =========================================================================
 */
public abstract class Person {

    /*
     * =====================================================================
     * 2. TÍNH ĐÓNG GÓI (ENCAPSULATION):
     * - Các thuộc tính được ẩn giấu và bảo vệ bằng phạm vi truy cập:
     *   + `protected`: chỉ cho phép lớp này và các lớp con (như Student) truy cập trực tiếp.
     *   + `private` / `protected` giúp bảo toàn tính toàn vẹn của dữ liệu.
     * - Dữ liệu được đọc/ghi thông qua các phương thức Getter và Setter.
     * =====================================================================
     */
    protected String id;
    protected String fullName;
    public int age;
    protected String address;
    protected String phone;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age < 0 ) {
            this.age = 0  ;
            throw new RuntimeException("Tuổi không được âm");
        }

        this.age = age;
    }

    public String getId() {
        return id;
    }

    /*
     * Tính đóng gói thể hiện qua việc kiểm soát và ràng buộc dữ liệu đầu vào trong Setter
     */
    public void setId(String id) {
        if (!(id == null || id.isEmpty())) {
            this.id = id;
        } else {
            System.out.println("Vui lòng nhập lại id ");
            throw new RuntimeException("Lỗi nhập liệu");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /*
     * =====================================================================
     * TÍNH ĐA HÌNH LÚC BIÊN DỊCH (COMPILE-TIME POLYMORPHISM)
     * -> NẠP CHỒNG HÀM KHỞI TẠO (CONSTRUCTOR OVERLOADING):
     * - Cùng tên Constructor `Person` nhưng khác nhau về danh sách tham số.
     * =====================================================================
     */

    // 1. Constructor không tham số (Default Constructor)
    public Person() {
    }

    // 2. Constructor có đầy đủ 5 tham số (Parameterized Constructor) -> Nạp chồng với Constructor trên
    public Person(String id, String fullName, int age, String address, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void inputInformation(Scanner sc) {
        System.out.println("=== Nhập thông tin của Person ===");
        System.out.println("Nhập mã số :");
        id = sc.nextLine();
        System.out.println("Nhập họ và tên :");
        fullName = sc.nextLine();
        System.out.println("Nhập tuổi :");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chi :");
        address = sc.nextLine();
        System.out.println("Nhập số điện thoại :");
        phone = sc.nextLine();
    }

    public void displayInfor() {
        System.out.println("=== Hiển thị thông tin của Person ===");
        System.out.println("Id :" + id + "\n" +
                "Họ và tên :" + fullName + "\n" +
                "Địa chỉ :" + address + "\n" +
                "Số điện thoại :" + phone +"\n");
    }
}