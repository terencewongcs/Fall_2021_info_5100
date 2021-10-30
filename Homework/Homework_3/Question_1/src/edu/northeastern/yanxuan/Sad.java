package edu.northeastern.yanxuan;

public class Sad extends Moody{

    //returns string indicating sad
    @Override
    String getMood() {
        return "I feel sad Today\n";
    }

    //print crying string “‘waah’  ‘boo hoo’  ‘weep’ ‘sob’”
    @Override
    void expressFeelings() {
        System.out.println("‘waah’  ‘boo hoo’  ‘weep’ ‘sob ‘");
    }


    //returns message about self : “Subject cries a lot”
    public String toString(){
        return "Subject cries a lot\n";
    }
}
