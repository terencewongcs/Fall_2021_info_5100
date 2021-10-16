package edu.northeastern.yanxuan;

public class Car {
    private String name;
    private String modelName;
    private Wheels wheels;
    private GearBox gearBox;
    private Seats seats;

    public Car(String modelName,int wheelSize,boolean isAutomatic, int numSeats , boolean hasLeatherSeats){
        this.modelName=modelName;
        wheels=new Wheels(wheelSize);
        gearBox=new GearBox(isAutomatic);
        seats=new Seats(hasLeatherSeats,numSeats);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }
}

// Has a relationship
// Is a relationship