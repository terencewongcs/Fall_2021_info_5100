package edu.northeastern.yanxuan;

public class Printer {
    private static Printer _instance;

    private  Printer() {
    }

    public static Printer getInstance() {
        if(_instance==null){
            _instance=new Printer();
        }
        return _instance;
    }
     public static void getConnection(){
         System.out.println("Your Printer is working.");
     }


}