package edu.northeastern.yanxuan;

public class Happy extends Moody{
    //returns string indicating happy
    @Override
    String getMood() {
        return "I feel happy Today\n";
    }

    //print laughter string “heeehee....hahahah...HAHAHA!!”
    @Override
    void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    //returns message about self: “Subject laughs a lot”
    public String toString(){
        return "Subject laughs a lot\n";
    }
}
