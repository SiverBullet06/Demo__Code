package org.project.application02.service;

import java.util.*;

import org.project.application02.models.Person;
import org.project.application02.models.Student;

/*
 * =========================================================================
 * TÍNH ĐÓNG GÓI & TÍNH ĐA HÌNH TRONG QUẢN LÝ DỮ LIỆU:
 * - Lớp `PersonManagement` đóng gói toàn bộ logic nghiệp vụ (thêm, hiển thị)
 *   và cấu trúc dữ liệu lưu trữ (List, Set).
 * - Sử dụng tính Đa hình (Polymorphism):
 *   + `HashSet<Person>`: Khai báo với kiểu cha `Person`, có thể lưu trữ bất kỳ
 *     đối tượng con nào (như `Student`, `Teacher`,...).
 *   + Khi gọi các phương thức, Java sẽ tự động gọi phiên bản được ghi đè
 *     (Overriding) ở lớp con tại thời điểm chạy (Runtime Polymorphism).
 * =========================================================================
 */
public class PersonManagement {
    List<Student> Alist = new ArrayList<>() ;

    public List<Student> getAlist() {
        return Alist;
    }

    public void setAlist(List<Student> alist) {
        Alist = alist;
    }

    // Danh sách lưu trữ sinh viên cụ thể
    public List<Student> studentList = new ArrayList<>();

    // Tính đa hình: Khai báo kiểu lớp cha `Person` để có thể lưu đa dạng các đối tượng con
    public HashSet<Person> personHashSet = new HashSet<>();

    public HashSet<Person> getPersonHashSet() {
        return personHashSet;
    }

    public void setPersonHashSet(HashSet<Person> personHashSet) {
        this.personHashSet = personHashSet;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void PersonListCondition () {

    }

    /*
     * Phương thức nghiệp vụ:
     * - Tận dụng tính Đa hình của `equals` và `hashCode` trong HashSet
     *   để kiểm tra và chống trùng lặp dữ liệu.
     */
    public void addPerson(Scanner sc) {
        Student st = new Student();
        Student student = st.inputStudent(sc);

        // personHashSet sẽ gọi hashCode() và equals() đã được override trong Student
        boolean isAdded = personHashSet.add(student);
        if (!isAdded) {
            System.out.println("Mã id trùng: " + student.getId());
        } else {
            System.out.println("Đã thêm person vào danh sách thành công!");
            studentList.add(student);
        }
    }

    public void displayInfor() {
        for (Student person : studentList) {
            System.out.println("\nMã số :" + person.getId() +
                    "\nHọ và tên : " + person.getFullName() +
                    "\nTuổi :" + person.getAge() +
                    "\nĐịa chỉ :" + person.getAddress() +
                    "\nSố điện thoại :" + person.getPhone() +
                    "\nĐiểm số :" + person.getScore()
            );
        }
    }

    public void deleteById (String  id ) {
        if (id == null && id.trim().isEmpty()){
                System.out.println(" Từ khóa không được để trống !");
        }
        String key = id.trim().toLowerCase() ;
        Iterator<Student> studentIterator = studentList.iterator();
        boolean found = false ;
//        for ( Student st : studentList ){
//            if (st.getId()!=null && st.getId().toLowerCase().contains(key)){
//
//            }
//            found = false ;
        while (studentIterator.hasNext()){
           Student st = studentIterator.next();
            if (st.getId()!=null && st.getId().toLowerCase().contains(key)){
                studentIterator.remove();
                found = true ;
                break;
            }
        }
        if (!found){
            System.out.println("Khng tìm thấy  thông tin mã :"+id);
        }
        else {
            System.out.println("Đã xóa mã cá nhân  :"+id);
        }

    }

    public void findById ( String id ) {
        if (id == null && id.trim().isEmpty()){
            System.out.println(" Từ khóa không được để trống !");
        }
        String key = id.trim().toLowerCase() ;
        boolean found = false ;
        for ( Student st : studentList ){
            if (st.getId()!=null && st.getId().toLowerCase().contains(key)){
            found = true ;
            System.out.println("Đã tìm thấy mã cá nhân :"+st.getId());
            break;
            }
        }
        if ( !found) {
            System.out.println("Không tìm thấy tài liệu nào khớp với từ khóa trên !");
        }
    }
    public List<Student>  getRanKing () {
        for (Student st :studentList ){
            String ranking = st.evaluateRanking() ;
            ranking.toLowerCase().trim() ;
            if (ranking.equalsIgnoreCase("A")){
                Alist.add(st) ;
            }
        }
        return Alist ;
    }
    public void displayRanking() {
        for ( Student st : Alist){
            System.out.println("Mã cá nhân :\t\t\t"+"Họ và tên:");
            System.out.print(st.getId()+"\t\t\t\t\t"+st.getFullName());
        }
    }


    public Student findStudentMaxScore () {
        Student indexMaxscore = studentList.get(0);

        for (int i=1 ; i<studentList.size() ;i++){
            Student st = studentList.get(i) ;
            if ( indexMaxscore.getScore() < st.getScore()){
                indexMaxscore = st ;
            }
        }
        return indexMaxscore ;
    }
    public double calculateAverageStudentScore ( ) {
        int count = 0 ;
        double sum  = 0 ;
        for ( int i=0 ; i<= studentList.size() ; i++ ){
            Student student = new Student() ;
            count ++ ;
            sum += student.getScore() ;
        }
        return (double )sum/count;
    }

    public double tuitionPayment ( String yourRanking ) {
        String key = yourRanking.toLowerCase().trim() ;
        Student student = new Student() ;
        if (student.evaluateRanking().equalsIgnoreCase(key)){
            if (key.equalsIgnoreCase("a")){
                return (double)10000000*(1- 0.5 ) ;
            }else if (key.equalsIgnoreCase("b+")){
                return (double)10000000*(1- 0.3 )  ;
            }else {
                return Student.tution ;
            }
        }
        return  0 ;
    }


}
