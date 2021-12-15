package edu.northeastern.yanxuan;

import java.util.Comparator;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(int id, String name, double gpa, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }


    static class NameComparator implements Comparator<Student>{
        public int compare(Student a,Student b){
            return a.getName().compareTo(b.getName());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", dateOfBirth=" + dateOfBirth.getYear() +"-"+dateOfBirth.getMonth() +"-"+dateOfBirth.getDay() +
                '}';
    }
}
