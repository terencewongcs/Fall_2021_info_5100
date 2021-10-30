package edu.northeastern.yanxuan;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    Person Ashish = new Person("Ashish");
        Person Mark = new Person("Mark");

        Ashish.start();
        Mark.start();

        int counter=15;
        while(true){
            System.out.println("I am main thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter--;
        }

    }
}
