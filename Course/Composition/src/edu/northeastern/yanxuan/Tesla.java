package edu.northeastern.yanxuan;

public class Tesla extends Car{
    public Tesla(String modelName, int wheelSize, boolean isAutomatic, int numSeats, boolean hasLeatherSeats) {
        super(modelName, wheelSize, isAutomatic, numSeats, hasLeatherSeats);
        super.setName("Tesla");
    }
}
