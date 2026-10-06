package org.project.application02;

import java.util.Scanner;

import org.project.application02.service.PersonManagement;

/*
 * =========================================================================
 * ĐIỂM CHẠY CHƯƠNG TRÌNH (ENTRY POINT):
 * - Thể hiện tính Đóng gói thông qua việc che giấu chi tiết cài đặt:
 *   + `MainApplication02` chỉ tương tác với đối tượng `PersonManagement`
 *     thông qua các phương thức công khai (`addPerson`, `displayInfor`).
 *   + Lớp Main không cần biết chi tiết danh sách được lưu trữ bằng List hay Set,
 *     hoặc cách sinh viên được nhập liệu ra sao.
 * =========================================================================
 */
public class MainApplication02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        String keyword ;
        while (true) {
            PersonManagement personManagement = new PersonManagement();
            System.out.println("\n===== MENU =====");
            System.out.println("0. Thoát");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Thêm giảng viên");
            System.out.println("3. Hiển thị tất cả danh sách");
            System.out.println("4. Xóa mã cá nhân :");
            System.out.println("5. Tìm kiếm theo mã cá nhân :");
            System.out.println("6 . Danh sách đạt giải thưởng");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("1.Thêm sinh viên");
                    System.out.println("Nhập số lượng :");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        personManagement.addStudent(sc);
                    }
                    break;
                case 2:
                    System.out.println("1.Thêm giảng viên");
                    System.out.println("Nhập số lượng :");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        personManagement.addTeacher(sc);
                    }
                    break;
                case 3:
                    System.out.println("Hiển thị tất cả danh sách");
                    personManagement.displayInfor();
                    break;
                case 4:
                    System.out.println("Nhập mã cá nhân bạn muốn xóa :");
                    keyword = sc.nextLine();
                    personManagement.deleteById(keyword);
                    break;
                case 5:
                    System.out.println("Tìm kiếm theo mã cá nhân :");
                    String id = sc.nextLine();
                    personManagement.findById(id);
                case 6:
                    personManagement.getRanKing();
                    System.out.println("=== DANH SÁCH SINH VIÊN ĐẠT GIẢI THƯỞNG LÀ ===");
                    personManagement.displayRanking();
                case 0:
                    System.out.println("Thoát chương trình!");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }

    }
}
