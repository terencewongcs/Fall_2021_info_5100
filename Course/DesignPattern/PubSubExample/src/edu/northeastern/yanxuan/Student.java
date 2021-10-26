package edu.northeastern.yanxuan;

public class Student {
    private Integer studentID;
    private String name;

    public Integer getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }
    public Student(String name, Integer studentID){
        this.name=name;
        this.studentID=studentID;
    }
    public void getGrades(Publisher publisher, String classname, String grade) {
        System.out.println(publisher.getName()+"Has published grades for class"+ classname);
        System.out.println("Your grade is"+grade);

    }

    public void subscribe(Publisher publisher) {
        publisher.addSubscriber(this);
    }

    public void unsubscribe(Publisher publisher) {
        publisher.removeSubscriber(this);
    }
}
