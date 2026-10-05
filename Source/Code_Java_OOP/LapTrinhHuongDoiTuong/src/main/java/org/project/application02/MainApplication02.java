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

        // Khởi tạo đối tượng quản lý để thực thi các nghiệp vụ
        PersonManagement personManagement = new PersonManagement();

        System.out.println("Nhập số lượng :");
        int n = sc.nextInt();
        sc.nextLine();

        // Vòng lặp thêm n đối tượng sinh viên
        for (int i = 0; i < n; i++) {
            personManagement.addPerson(sc);
        }

        // Hiển thị danh sách thông tin sinh viên
        personManagement.displayInfor();
        System.out.println("Nhập mã cá nhân bạn muốn xóa :");
        String keyword = sc.nextLine() ;
        personManagement.deleteById(keyword);

        System.out.println("Tìm kiếm theo mã cá nhân :");
        String id = sc.nextLine() ;
        personManagement.findById(id);

        personManagement.getRanKing();
        System.out.println("=== DANH SÁCH SINH VIÊN ĐẠT GIẢI THƯỞNG LÀ ===");
        personManagement.displayRanking();
    }
}
