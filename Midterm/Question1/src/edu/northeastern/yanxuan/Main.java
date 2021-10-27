package edu.northeastern.yanxuan;

public class Main {

    public static void main(String[] args) {
	    Fiction f1= new Fiction("aa",15,"2000");
        f1.setBorrowDate(1);
        f1.setReturnDate(5);
        System.out.println(f1.isAvailable(6));
        System.out.println(f1.description());

        Reference b2= new Reference("bb",18,"2000","dictionary");
        b2.setBorrowDate(4);
        b2.setReturnDate(6);
        System.out.println(b2.isAvailable(5));
        System.out.println(b2.description());

    }
}
