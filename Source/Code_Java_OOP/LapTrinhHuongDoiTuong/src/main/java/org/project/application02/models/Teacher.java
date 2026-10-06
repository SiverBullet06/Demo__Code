package org.project.application02.models;

import java.util.Scanner;

public class Teacher extends Person implements I_evaluateRanking{
    private String subject ;
    private int teachingHours ;
    private double baseSalary ;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Teacher (){}
    public Teacher inputTeacher (Scanner sc ) {
        super.inputInformation(sc);
        System.out.println("Nhập môn giảng dạy :");
        subject = sc.nextLine() ;
        System.out.println("Nhập số tiết giảng dạy :");
        teachingHours = sc.nextInt();
        System.out.println("Nhập mức lương cơ bản :");
        return this ;
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println("");
    }

    public Teacher ( String id , String fullName , int age , String address , String phone ,
                     String subject  , int teachingHours , double baseSalary) {
        super(id, fullName, age, address, phone);
        this.subject = subject ;
        this.baseSalary = baseSalary ;
        this.teachingHours = teachingHours ;
    }

    @Override
    public String evaluateRanking() {
        Teacher teacher = new Teacher() ;
        if (teacher.teachingHours >= 500 ){
            return "A+";
        }else if (teacher.teachingHours >=300 ) {
            return "B" ;
        }
        else {
            return "C" ;
        }
    }

}
