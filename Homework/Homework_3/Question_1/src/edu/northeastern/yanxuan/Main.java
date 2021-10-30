package edu.northeastern.yanxuan;

public class Main {

    public static void main(String[] args) {
        Psychiatrist psychiatrist =new Psychiatrist();
        Moody moodyObject1=new Happy();
        Moody moodyObject2=new Sad();

        psychiatrist.examine(moodyObject1);
        psychiatrist.observe(moodyObject1);

        psychiatrist.examine(moodyObject2);
        psychiatrist.observe(moodyObject2);

    }
}
