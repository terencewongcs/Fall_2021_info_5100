package edu.northeastern.yanxuan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();

        Student student1=new Student(1, "AA",3.0, new Date(2000,1,1));
        Student student2=new Student(2, "EE",3.4, new Date(2000,1,2));
        Student student3=new Student(3, "BB",3.2, new Date(1999,2,6));
        Student student4=new Student(4, "CC",3.5, new Date(1998,5,16));
        Student student5=new Student(5, "RR",3.9, new Date(2000,2,2));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("Sort by ascending order of 'name'");
        Collections.sort(students, (a, b) -> a.getName().compareTo(b.getName()));
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("Sort by descending order of 'gpa'");
        Collections.sort(students, (a,b) -> Double.compare(a.getGpa(), b.getGpa()));
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("Sort by ascending order of 'dateOfBirth'");
        Collections.sort(students, (a,b) ->a.getDateOfBirth().compareTo(b.getDateOfBirth()));
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
