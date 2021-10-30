package edu.northeastern.yanxuan;

public class Main {

    public static void main(String[] args) {
        Publisher ashish =new Publisher("Ashish","Info 5100");

        Student Mark=new Student("Mark",1);
        Student Bill=new Student("Bill",2);
        Student Peter=new Student("Peter",3);



        Mark.subscribe(ashish);
        Bill.subscribe(ashish);

        ashish.addGrades(1,"A");
        ashish.addGrades(2,"B");

        ashish.NotifyGrades();



    }
}
