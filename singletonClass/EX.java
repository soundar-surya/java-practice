package singletonClass;

import java.util.*;

class Student{
    static int count = 1;
    private String rollNo;

    private String assignRollNo(){
        Date d = new Date();
        String rollno = "Univ--"+(2020)+"--"+count;
        count++;
        return rollno;
    }

    public Student(){
        rollNo = assignRollNo();
    }

    public String getRollNo(){
        return rollNo;
    }


}

class EX {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
    }
}

/*
Univ--2020--1
Univ--2020--2
*/