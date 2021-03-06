package edu.northeastern.yanxuan;

public class CarDecorator implements Car {
    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
}
