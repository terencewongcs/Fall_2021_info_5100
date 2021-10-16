package edu.northeastern.yanxuan;

public class Mercedes extends Car{

    public Mercedes(String modelName, int wheelSize, boolean isAutomatic, int numSeats, boolean hasLeatherSeats) {
        super(modelName, wheelSize, isAutomatic, numSeats, hasLeatherSeats);
        super.setName("Mercedes");
    }
}
