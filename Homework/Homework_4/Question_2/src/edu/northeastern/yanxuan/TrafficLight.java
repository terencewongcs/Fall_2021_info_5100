package edu.northeastern.yanxuan;

class TrafficLight {
    private boolean isGreen;

    public TrafficLight() {
        this.isGreen = true;
    }

    public void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ) {
        synchronized (this) {
            if (roadId == 1 && !isGreen){
                this.isGreen = true;
                turnGreen.run();
            }
            else if( roadId == 2 && isGreen){
                this.isGreen = false;
                turnGreen.run();
            }
            crossCar.run();
        }
    }
}