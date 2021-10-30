package edu.northeastern.yanxuan;

public class Main {

    public static void main(String[] args) {
	    Projector proj=Projector.getInstance();
        Projector proj1=Projector.getInstance();
        proj.name="Projector in room";

        System.out.println(proj1.name);
    }
}
