package edu.northeastern.yanxuan;

import java.util.ArrayList;
import java.util.HashMap;

public class Publisher {
    private String name;
    private String className;
    private ArrayList<Student> students;
    private HashMap<Integer, String> grades;

    public Publisher(String name, String className) {
        this.name=name;
        this.className=className;
        this.students=new ArrayList<>();
        this.grades=new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public void NotifyGrades(){
        for(Student student : students){
            student.getGrades(this,this.className,grades.get(student.getStudentID()));
        }
    }

    public void addGrades(Integer studentID,String grade){
        grades.put(studentID,grade);
    }

    public void addSubscriber(Student student){
        if(!students.contains(student)){
            students.add(student);
        }
    }

    public void removeSubscriber(Student student){
        if(students.contains(student)){
            students.remove(student);
        }
    }
}
