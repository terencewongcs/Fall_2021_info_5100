package edu.northeastern.yanxuan;

public class GearBox {
    boolean isAutomatic;
    int currentGear;

    public GearBox(boolean isAutomatic){
        this.isAutomatic=isAutomatic;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
