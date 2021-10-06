package edu.northeastern.yanxuan;

public class Animal {
    private String name;
    private int age;
    private double weight;
    private boolean isManual;

    public Animal(String name,int age,double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public void eat(){
        System.out.println("I am Animal.");
    }


}
