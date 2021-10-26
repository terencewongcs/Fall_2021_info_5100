package edu.northeastern.yanxuan;

public class Projector {
    private static Projector _instance;

    private Projector(){}

    private static Object obj = new Object();
    public String name = "Default";
    public static Projector getInstance(){

        //double locking 1st time: slow after: quick
        //phone screen logging system
        if(_instance == null){
            synchronized (obj){
                if(_instance==null){
                    _instance= new Projector();
                }
            }
        }
        return _instance;
    }

    public static void sampleFunction(int value){
        //Debug.log("Inside Sqmple Function "+"value=" + value + UserID);
    }
}


