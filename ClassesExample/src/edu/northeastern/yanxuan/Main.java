package edu.northeastern.yanxuan;

public class Main {

    public static void main(String[] args) {
	    House whiteHouse=new House();
        whiteHouse.houseNumber=1;
        whiteHouse.color="White";

        System.out.println("White House Number ="+whiteHouse.houseNumber);
        System.out.println("White House Color= "+whiteHouse.color);

        House greenHouse = whiteHouse;
        System.out.println("Green House Number ="+whiteHouse.houseNumber);
        System.out.println("Green House Color= "+whiteHouse.color);

        greenHouse.houseNumber=2;
        greenHouse.color="Green";
        System.out.println("White House Number ="+whiteHouse.houseNumber);
        System.out.println("White House Color= "+whiteHouse.color);
        System.out.println("Green House Number ="+whiteHouse.houseNumber);
        System.out.println("Green House Color= "+whiteHouse.color);
        //whiteHouse and greenHouse point to the same location

        //Garbage Collection
    }
}
