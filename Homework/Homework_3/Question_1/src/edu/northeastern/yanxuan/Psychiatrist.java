package edu.northeastern.yanxuan;

public class Psychiatrist {
    //asks moody object about its mood
    public void examine(Moody moodyObject) {
        System.out.println("How are you feeling today?");
        System.out.println(moodyObject.getMood());
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moodyObject) {
        moodyObject.expressFeelings();
        System.out.println("Observation: "+moodyObject.toString());
    }

    //returns message about self: “Subject laughs a lot”
    public String toString() {
        return "I am a Psychiatrist";
    }
}
