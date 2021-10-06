package edu.northeastern.yanxuan;

public class Dog extends Animal{
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }
    public void eat(){
        System.out.println("I am Dog.");
    }
}
